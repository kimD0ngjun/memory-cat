#include "com_cat_system_MemoryService.h"
#include <sys/sysctl.h>
#include <mach/mach.h>
#include <stdio.h>

JNIEXPORT jstring JNICALL Java_com_cat_system_MemoryService_getMemoryUsageString
  (JNIEnv *env, jobject obj) {
    vm_size_t pageSize;
    mach_msg_type_number_t count;
    vm_statistics64_data_t vmStats;
    mach_port_t machPort = mach_host_self();

    // 페이지 크기 가져오기
    if (host_page_size(machPort, &pageSize) != KERN_SUCCESS) {
        return (*env)->NewStringUTF(env, "Error retrieving memory stats");
    }

    // VM 통계 가져오기
    count = sizeof(vmStats) / sizeof(natural_t);
    if (host_statistics64(machPort, HOST_VM_INFO, (host_info64_t)&vmStats, &count) != KERN_SUCCESS) {
        return (*env)->NewStringUTF(env, "Error retrieving memory stats");
    }

    // 사용 중인 메모리 계산: active + wired
    int64_t usedMemory = (vmStats.active_count + vmStats.wire_count) * pageSize;
    int64_t totalMemory = vmStats.free_count + vmStats.active_count + vmStats.wire_count + vmStats.inactive_count;

    // KB 단위로 계산
    char result[256];
    snprintf(result, sizeof(result), "used=%lld&total=%lld", usedMemory / 1024, totalMemory / 1024);

    // 문자열로 반환
    return (*env)->NewStringUTF(env, result);
}

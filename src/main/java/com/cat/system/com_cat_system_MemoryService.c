#include "com_cat_system_MemoryService.h"
#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <sys/sysctl.h>
#include <mach/mach.h>

// 사용 중인 메모리 반환 (KB 단위)
JNIEXPORT jint JNICALL Java_com_cat_system_MemoryService_getUsedMemory
  (JNIEnv *env, jobject obj) {
    vm_size_t pageSize;
    mach_msg_type_number_t count;
    vm_statistics64_data_t vmStats;
    mach_port_t machPort = mach_host_self();

    // 페이지 크기 가져오기
    if (host_page_size(machPort, &pageSize) != KERN_SUCCESS) {
        return -1; // 실패 시 -1 반환
    }

    // VM 통계 가져오기
    count = sizeof(vmStats) / sizeof(natural_t);
    if (host_statistics64(machPort, HOST_VM_INFO, (host_info64_t)&vmStats, &count) != KERN_SUCCESS) {
        return -1; // 실패 시 -1 반환
    }

    // 사용 중인 메모리 계산: active + wired
    int64_t usedMemory = (vmStats.active_count + vmStats.wire_count) * pageSize;

    // KB 단위로 반환
    return (jint)(usedMemory / 1024);
}

// 전체 메모리 반환 (KB 단위)
JNIEXPORT jint JNICALL Java_com_cat_system_MemoryService_getTotalMemory
  (JNIEnv *env, jobject obj) {
    vm_size_t pageSize;
    mach_msg_type_number_t count;
    vm_statistics64_data_t vmStats;
    mach_port_t machPort = mach_host_self();

    // 페이지 크기 가져오기
    if (host_page_size(machPort, &pageSize) != KERN_SUCCESS) {
        return -1; // 실패 시 -1 반환
    }

    // VM 통계 가져오기
    count = sizeof(vmStats) / sizeof(natural_t);
    if (host_statistics64(machPort, HOST_VM_INFO, (host_info64_t)&vmStats, &count) != KERN_SUCCESS) {
        return -1; // 실패 시 -1 반환
    }

    // 전체 메모리 계산: free + active + wire + inactive
    int64_t totalMemory = (vmStats.free_count + vmStats.active_count + vmStats.wire_count + vmStats.inactive_count) * pageSize;

    // KB 단위로 반환
    return (jint)(totalMemory / 1024);
}

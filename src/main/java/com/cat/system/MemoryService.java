package com.cat.system;

public class MemoryService {
    public native String getMemoryUsage();

    static {
        try {
            System.loadLibrary("native-lib");
        } catch (UnsatisfiedLinkError e) {
            throw new RuntimeException("네이티브 라이브러리 호출 실패: native-lib", e);
        }
    }

    // MemoryDTO 반환
    public String getMemoryUsageSafe() {
        try {
            return getMemoryUsage();
        } catch (UnsatisfiedLinkError | RuntimeException e) {
            System.err.println(e.getMessage());
            return "네이티브 코드에서 메모리 사용량 계측 실패!";
        }
    }
}

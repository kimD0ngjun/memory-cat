package com.cat.system;

public class MemoryService {

    public native int getUsedMemory();

    static {
        try {
            System.loadLibrary("native-lib");
        } catch (UnsatisfiedLinkError e) {
            throw new RuntimeException("네이티브 라이브러리 호출 실패: native-lib", e);
        }
    }

    public double getUsedMemoryInMB() {
        return getUsedMemory() / (1024.0 * 1024.0);
    }

    public int getUsedMemorySafe() {
        try {
            return getUsedMemory();
        } catch (UnsatisfiedLinkError | RuntimeException e) {
            System.err.println(e.getMessage());
            return -1; // 기본값 반환
        }
    }
}

package com.cat.system;

public class MemoryService {

    public native int getUsedMemory();

    static {
        try {
            System.loadLibrary("native-lib");
        } catch (UnsatisfiedLinkError e) {
            throw new RuntimeException("네이티브 라이브러리 실행 실패: native-lib", e);
        }
    }
}

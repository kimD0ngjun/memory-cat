package com.cat.system;

import com.cat.model.system.MemoryDTO;

public class MemoryService {
    public native MemoryDTO getMemoryUsage();

    static {
        try {
            System.loadLibrary("native-lib");
        } catch (UnsatisfiedLinkError e) {
            throw new RuntimeException("네이티브 라이브러리 호출 실패: native-lib", e);
        }
    }

    // MemoryDTO 반환
    public MemoryDTO getMemoryUsageSafe() {
        try {
            return getMemoryUsage();
        } catch (UnsatisfiedLinkError | RuntimeException e) {
            System.err.println(e.getMessage());
            return new MemoryDTO(-1, -1); // 기본값 반환
        }
    }
}

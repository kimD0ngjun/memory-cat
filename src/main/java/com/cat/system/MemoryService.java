package com.cat.system;

public class MemoryService {

    public native int getUsedMemory();

    static {
        System.loadLibrary("native-lib");
    }

}

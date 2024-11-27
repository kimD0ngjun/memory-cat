package com.cat.model.system;

public record MemoryDTO(double usedMemory, double totalMemory) {

    public double getPercentUsedMemory() {
        return usedMemory / totalMemory;
    }

}

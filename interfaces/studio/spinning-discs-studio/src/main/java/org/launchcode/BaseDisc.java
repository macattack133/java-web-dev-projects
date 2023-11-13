package org.launchcode;


import java.util.HashMap;

public abstract class BaseDisc {
    private final Integer storageCapacity;
    private final Integer minRPM;
    private final Integer maxRPM;
    private Integer storageUsed;
    private Integer storageLeft;
    public HashMap<String, Integer> storedInformation;

    public BaseDisc(Integer storageCapacity, Integer minRPM, Integer maxRPM, Integer storageUsed) {
        this.storageCapacity = storageCapacity;
        this.minRPM = minRPM;
        this.maxRPM = maxRPM;
        this.storageUsed = storageUsed;
        this.storageLeft = storageCapacity - storageUsed;
    }

    public Integer getStorageCapacity() {
        return storageCapacity;
    }

    public Integer getMinRPM() {
        return minRPM;
    }

    public Integer getMaxRPM() {
        return maxRPM;
    }

    public Integer getStorageUsed() {
        return storageUsed;
    }

    public HashMap<String, Integer> getStoredInformation() {
        return storedInformation;
    }

    public void writeData(String nameOfInfo, Integer spaceRequired) {
        if (storageLeft < spaceRequired) {
            System.out.println("Not enough space");
        } else {
            storedInformation.put(nameOfInfo, spaceRequired);
            storageUsed += spaceRequired;
            storageLeft += spaceRequired;
            System.out.println(storageLeft + "units of storage left");
        }
    }


    public abstract void reportInformation();


}

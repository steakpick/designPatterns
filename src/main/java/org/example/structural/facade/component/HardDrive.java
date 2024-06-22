package org.example.structural.facade.component;

public class HardDrive {
    public byte[] read(long lba, int size) {
        System.out.println("Reading data from Hard Drive...");
        return new byte[size];
    }
}

package org.example.creation.builder;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setHDD("Toshiba")
                .setRAM("Kingston")
                .setWirelessEnabled(true)
                .setCpuEnabled(false)
                .build();

        System.out.println(computer);
    }
}

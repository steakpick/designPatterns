package org.example.creation.builder;

public class Computer {
    private String HDD;
    private String RAM;
    private boolean isCpuEnabled;
    private boolean isWirelessEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD=builder.HDD;
        this.RAM=builder.RAM;
        this.isCpuEnabled =builder.isCpuEnabled;
        this.isWirelessEnabled =builder.isWirelessEnabled;
    }

    public String getHDD() {
        return HDD;
    }

    public String getRAM() {
        return RAM;
    }

    public boolean isCpuEnabled() {
        return isCpuEnabled;
    }

    public boolean isWirelessEnabled() {
        return isWirelessEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "HDD='" + HDD + '\'' +
                ", RAM='" + RAM + '\'' +
                ", isCpuEnabled=" + isCpuEnabled +
                ", isWirelessEnabled=" + isWirelessEnabled +
                '}';
    }

    public static class ComputerBuilder{
        private String HDD;
        private String RAM;
        private boolean isCpuEnabled;
        private boolean isWirelessEnabled;

        public ComputerBuilder(){

        }

        public ComputerBuilder setHDD(String HDD) {
            this.HDD = HDD;
            return this;
        }

        public ComputerBuilder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public ComputerBuilder setCpuEnabled(boolean isGraphicsCardEnabled) {
            this.isCpuEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setWirelessEnabled(boolean isBluetoothEnabled) {
            this.isWirelessEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }

}
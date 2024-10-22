package com.example.deviceapp;

public class Laptop extends  Device {
    protected int ramSize;
    protected String processorType;

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }

    public Laptop(DeviceType type, String name, double weight, double price) {
        super(type, name, weight, price);
    }
    public Laptop() {
        super(DeviceType.LAPTOP, "Default Name", 0.0, 0.0);
        this.ramSize = 0;
        this.processorType = "Unknown Processor";
    }

    // Parameterized constructor
    public Laptop(DeviceType type, String name, double weight, double price, int ramSize, String processorType) {
        super(type, name, weight, price);
        this.ramSize = ramSize;
        this.processorType = processorType;
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", ram size=" + ramSize +
                ", processor type=" + processorType +
                '}';
    }
}

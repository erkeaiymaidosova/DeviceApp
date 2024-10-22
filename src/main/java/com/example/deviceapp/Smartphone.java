package com.example.deviceapp;

public class Smartphone extends Device {
    protected int screenSize;
    protected int resolution;


    public Smartphone() {
        super(DeviceType.SMARTPHONE, "Default Name", 0.0, 0.0);
        this.screenSize = screenSize;
        this.resolution = resolution;
    }
    public Smartphone(DeviceType type, String name, double price, double weight) {
        super(type, name, weight, price);
    }

    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }
    @Override
    public String toString() {
        return "Smartphone{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", screenSize=" + screenSize +
                ", resolution=" + resolution +
                '}';
    }
}

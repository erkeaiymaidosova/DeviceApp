package com.example.deviceapp;

public class Tablet extends Device{

    protected double batteryLife;
    protected boolean hasStylus;

    public double getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(double batteryLife) {
        this.batteryLife = batteryLife;
    }

    public boolean isHasStylus() {
        return hasStylus;
    }

    public void setHasStylus(boolean hasStylus) {
        this.hasStylus = hasStylus;
    }
    public Tablet() {
        super(DeviceType.TABLET, "Default Name", 0.0, 0.0);
        this.batteryLife = 0.0;
        this.hasStylus = false;
    }
    public Tablet(DeviceType type, String name, double weight, double price, double batteryLife, boolean hasStylus) {
        super(type, name, weight, price);
        this.batteryLife = batteryLife;
        this.hasStylus = hasStylus;
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "type=" + type +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", weight=" + weight +
                ", battery life=" + batteryLife +
                ", has stylus=" + hasStylus +
                '}';
    }

}

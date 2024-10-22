package com.example.deviceapp;

public class Device {
    protected DeviceType type;
    protected String name;
    protected double weight;
    protected double price;
    public Device(){}
    public Device(DeviceType type, String name, double weight, double price) {
        this.type = type;
        this.name = name;
        this.weight = weight;
        this.price = price;
    }
    public DeviceType getType() {
        return type;
    }

    public void setType(DeviceType type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}

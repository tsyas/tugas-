package com.dicoding.javafundamental.basic.collectionType;

public class Planet {
    private String name;
    private double mass;
    public Planet(String name, double mass) {
        this.name = name;
        this.mass = mass;
    }
    @Override
    public String toString() {
        return "Planet " + name + ", mass: " + mass;
    }
}

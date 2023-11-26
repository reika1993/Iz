package com.hamburger;

public class Hamburger {
    private String name;
    private String material;
    private int kcal;

    public String getName() {
        return name;
    }

    public String getMaterial() {
        return material;
    }

    public int getKcal() {
        return kcal;
    }

    public Hamburger(String name, String material, int kcal) {
        this.name = name;
        this.material = material;
        this.kcal = kcal;

    }
}

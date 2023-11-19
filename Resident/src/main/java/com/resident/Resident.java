package com.resident;

public class Resident {
    private String name;
    private int month;
    private boolean parking;

    public Resident(String name, int month, boolean parking) {
        this.name = name;
        this.month = month;
        this.parking = parking;

    }
        public String getName () {
            return name;
        }

        public int getMonth () {
            return month;
        }

        public boolean hasParking () {
            return parking;
        }
    }



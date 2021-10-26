package com.company;


public class Player {
    private String name;
    private String race;
    private double health;
    private int cheesewheel;

    public Player(String name, String race, double health, int cheesewheel) {
        this.name = name;
        this.race = race;
        this.health = health;
        this.cheesewheel = cheesewheel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }


    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }


    public int getCheesewheel() {
        return cheesewheel;
    }

    public void setCheesewheel(int i) {
        this.cheesewheel = cheesewheel;
    }
}
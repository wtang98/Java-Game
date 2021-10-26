package com.company;

public class Enemy{
    private static double Health;
    private static double Damage;

    public Enemy(double Health , double Damage) {
        this.Health = Health;
        this.Damage = Damage;
    }

    public static double getHealth() {
        return Health;
    }

    public void setHealth(double health) {
        Health = health;
    }

    public static double getDamage() {
        return Damage;
    }

    public void setDamage(double damage) {
        Damage = damage;
    }

}
package com.company;

public class PlayerWeapons extends Player {
    private String weapon;
    private double weaponDamage;
    private double critChance;
    private double critDamageMuliplier;
    private int missChance;

    public PlayerWeapons(String weapon, double weaponDamage, double critChance, double critDamageMuliplier, int missChance, String name, String race, double health, int cheesewheel) {
        super(name, race, health, cheesewheel);
        this.weapon = weapon;
        this.weaponDamage = weaponDamage;
        this.critChance = critChance;
        this.critDamageMuliplier = critDamageMuliplier;
        this.missChance = missChance;
    }

    public String getWeapon() {
        return weapon;
    }
    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }
    public double getWeaponDamage() {
        return weaponDamage;
    }
    public void setWeaponDamage(double weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public double getCritChance(){
        return critChance;
    }

    public void setCritChance(double critChance){
        this.critChance = critChance;
    }

    public double getCritDamageMuliplier() {
        return critDamageMuliplier;
    }

    public void setCritDamageMuliplier(double critDamageMuliplier) {
        this.critDamageMuliplier = critDamageMuliplier;
    }

    public int getMissChance() {
        return missChance;
    }

    public void setMissChance(int missChance) {
        this.missChance = missChance;
    }
}

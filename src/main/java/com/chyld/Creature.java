package com.chyld;

public abstract class Creature {
    protected int hitPoints; // 0 to 100
    protected String name;
    protected String weapon;
    protected int damage; // 0 to 10

    public Creature(){
        this(1, "Scary Creature", "Slap", 1);
    }

    public Creature(int hitPoints, String name, String weapon, int damage) {
        this.hitPoints = hitPoints;
        this.name = name;
        this.weapon = weapon;
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "hitPoints=" + hitPoints +
                ", name='" + name + '\'' +
                ", weapon='" + weapon + '\'' +
                ", damage=" + damage +
                '}';
    }

    public abstract void fight(Creature c);
    public abstract void heal();
}

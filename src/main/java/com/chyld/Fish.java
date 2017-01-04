package com.chyld;

public class Fish extends Creature {
    public Fish(String name) {
        super(50, name, "Flipper", 1);
    }

    public void fight(Creature c) {
        int damage = (int)(Math.random() * this.damage);
        String s = this + " is fighting " + c + " with damage " + damage;
        System.out.println(s);
        c.hitPoints -= damage;
    }

    public void heal() {
        this.hitPoints += (int)(Math.random() * 10);
    }
}

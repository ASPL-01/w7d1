package com.chyld;

public class Vampire extends Creature {
    public Vampire(String name) {
        super(90, name, "Teeth", 3);
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

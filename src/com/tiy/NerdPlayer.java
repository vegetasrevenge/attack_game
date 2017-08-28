package com.tiy;

public class NerdPlayer implements Player {
    private int healthPoints;
    private String name;

    public NerdPlayer(String name, int healthPoints) {
        this.name = name;
        this.healthPoints = healthPoints;
    }

    @Override
    public void hit(Integer damage) {
        this.healthPoints -= damage * 2;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public Integer getHP() {
        return this.healthPoints;
    }
}

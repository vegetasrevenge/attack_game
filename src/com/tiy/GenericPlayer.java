package com.tiy;

public class GenericPlayer implements Player {
    private String name;
    private Integer HP;

    public GenericPlayer(String name, Integer HP) {
        this.name = name;
        this.HP = HP;
    }

    @Override
    public void hit(Integer damage) {
        HP -= damage;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getHP() {
        return HP;
    }
}

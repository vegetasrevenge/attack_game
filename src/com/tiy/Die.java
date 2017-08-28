package com.tiy;

import java.util.concurrent.ThreadLocalRandom;

public class Die {
    private Integer sides;

    public Die(Integer sides) {
        this.sides = sides;
    }

    public Integer roll() {
        Integer min = 1;
        Integer max = sides;
        return ThreadLocalRandom.current().nextInt(min, max);
    }

    public Integer getSides() {
        return sides;
    }
}

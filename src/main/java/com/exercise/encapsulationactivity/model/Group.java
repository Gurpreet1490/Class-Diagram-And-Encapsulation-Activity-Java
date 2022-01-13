package com.exercise.encapsulationactivity.model;

import java.util.Arrays;

public enum Group {
    ONE(1), TWO(2), THREE(3), FOUR(4), FIVE(5);

    private final int value;

    Group(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static Group getByValue(int value) {
        return Arrays.stream(Group.values())
                .filter(group -> group.getValue() == value)
                .findFirst().orElse(null);
    }
}

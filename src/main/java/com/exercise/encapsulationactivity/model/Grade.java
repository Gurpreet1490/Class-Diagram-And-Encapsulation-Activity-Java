package com.exercise.encapsulationactivity.model;

import java.util.Arrays;

public enum Grade {

    A(1), B(2), C(3), D(4), E(5), F(6);

    final int order;

    Grade(int order) {
        this.order = order;
    }

    public int getOrder() {
        return order;
    }

    public static Grade getByOrder(int order) {
        return Arrays.stream(Grade.values())
                .filter(grade -> grade.getOrder() == order)
                .findFirst().orElse(null);
    }
}

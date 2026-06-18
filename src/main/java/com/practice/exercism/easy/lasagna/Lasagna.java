package com.practice.exercism.easy.lasagna;

public class Lasagna {

    private static final int EXPECTED_OVEN_TIME = 40;
    private static final int PREPARATION_TIME_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return EXPECTED_OVEN_TIME;
    }

    public int remainingMinutesInOven(int actualTime) {
        return expectedMinutesInOven() - actualTime;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * PREPARATION_TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int numberOfLayers, int minutesInOven) {
        return preparationTimeInMinutes(numberOfLayers) + minutesInOven;
    }
}
package com.practice.exercism.easy.carsassemble;

public class CarsAssemble {

    private static final int CARS_PER_HOUR = 221;
    private static final int MINUTES_PER_HOUR = 60;

    public double productionRatePerHour (int speed) {
        double successRate = getSuccessRate(speed);
        return speed * CARS_PER_HOUR * successRate;
    }

    public int workingItemsPerMinute (int speed) {
        return (int) (productionRatePerHour(speed) / MINUTES_PER_HOUR);
    }

    private double getSuccessRate (int speed) {
        double rate = 0.0;

        if (speed >= 1 && speed <= 4) { rate = 1.0; }
        if (speed >= 5 && speed <= 8) { rate = 0.9; }
        if (speed == 9) { rate = 0.8; }
        if (speed == 10) { rate = 0.77; }

        return rate;
    }
}
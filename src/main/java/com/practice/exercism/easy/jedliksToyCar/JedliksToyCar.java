package com.practice.exercism.easy.jedliksToyCar;

public class JedliksToyCar {

    private static final String EMPTY_BATTERY_MESSAGE = "Battery empty";
    private static final int EMPTY_BATTERY = 0;
    private static final int DISTANCE_PER_DRIVE = 20;
    private static final int BATTERY_DRAIN_PER_DRIVE = 1;
    private static final int INITIAL_BATTERY = 100;
    private static final int INITIAL_DRIVEN_DISTANCE = 0;

    private int distanceDriven;
    private int batteryPercentage;

    public JedliksToyCar() {
        this.distanceDriven = INITIAL_DRIVEN_DISTANCE;
        this.batteryPercentage = INITIAL_BATTERY;
    }


    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceDriven);
    }

    public String batteryDisplay() {
        if (batteryPercentage == EMPTY_BATTERY) {
            return EMPTY_BATTERY_MESSAGE;
        }
        return String.format("Battery at %d%%", batteryPercentage);
    }

    public void drive() {
        if (batteryPercentage > EMPTY_BATTERY) {
            distanceDriven += DISTANCE_PER_DRIVE;
            batteryPercentage -= BATTERY_DRAIN_PER_DRIVE;
        }
    }
}
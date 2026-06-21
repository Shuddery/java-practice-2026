package com.practice.exercism.easy.birdWatcher;

import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;
    private static final int[] LAST_WEEK = {0, 2, 5, 3, 7, 8, 4};

    public BirdWatcher(int[] birdsPerDay) {
        if (birdsPerDay == null) {
            throw new IllegalArgumentException("birdsPerDay cannot be null");
        }
        this.birdsPerDay = birdsPerDay.clone();
    }

    private int getLastIndex() {
        return birdsPerDay.length - 1;
    }

    public static int[] getLastWeek() {
        return LAST_WEEK.clone();
    }

    public int getToday() {
        return birdsPerDay[getLastIndex()];
    }

    public void incrementTodaysCount() {
        birdsPerDay[getLastIndex()] += 1;
    }

    public boolean hasDayWithoutBirds() {
        return Arrays.stream(birdsPerDay).anyMatch(day -> day == 0);
    }

    public int getCountForFirstDays(int numberOfDays) {
        int limit = Math.min(numberOfDays, birdsPerDay.length);
        return Arrays.stream(birdsPerDay)
                .limit(limit)
                .sum();
    }

    public int getBusyDays() {
        return (int) Arrays.stream(birdsPerDay)
                .filter(day -> day >= 5)
                .count();
    }
}
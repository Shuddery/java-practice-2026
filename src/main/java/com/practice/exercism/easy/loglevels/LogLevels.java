package com.practice.exercism.easy.loglevels;

public class LogLevels {

    public static String message(String logLine) {
        int separatorIndex = logLine.indexOf(": ");
        String message = logLine.substring(separatorIndex + 2);
        return message.strip();
    }

    public static String logLevel(String logLine) {

        int separatorIndexFirst = logLine.indexOf("[");
        int separatorIndexSecond = logLine.indexOf("]");

        String message = logLine.substring(separatorIndexFirst + 1, separatorIndexSecond);

        return message.toLowerCase();
    }

    public static String reformat(String logLine) {
        return String.format("%s (%s)", message(logLine), logLevel(logLine));
    }
}
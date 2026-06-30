package com.practice.exercism.easy.logslogs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLine {
    private static final Pattern LOG_PATTERN = Pattern.compile("\\[(\\w+)]:\\s*(.*)");

    private final String logLevel;
    private final String message;

    public LogLine(String logLine) {
        Matcher matcher = LOG_PATTERN.matcher(logLine);
        if (matcher.matches()) {
            this.logLevel = matcher.group(1);
            this.message = matcher.group(2);
        } else {
            this.logLevel = "";
            this.message = logLine;
        }
    }

    public LogLevel getLogLevel() {
        return switch (logLevel) {
            case "TRC" -> LogLevel.TRACE;
            case "DBG" -> LogLevel.DEBUG;
            case "INF" -> LogLevel.INFO;
            case "WRN" -> LogLevel.WARNING;
            case "ERR" -> LogLevel.ERROR;
            case "FTL" -> LogLevel.FATAL;
            default -> LogLevel.UNKNOWN;
        };
    }

    public String getOutputForShortLog() {
        return String.format("%d:%s", getLogLevel().getCode(), message);
    }
}
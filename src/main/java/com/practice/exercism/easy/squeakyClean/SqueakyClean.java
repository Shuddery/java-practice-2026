package com.practice.exercism.easy.squeakyClean;

class SqueakyClean {

    static String clean(String identifier) {

        String result = identifier;
        result = cleanFromSpaces(result);
        result = convertKebabToCamelCase(result);
        result = convertLeetspeakToNormalText(result);
        result = keepOnlyLetters(result);
        return result;
    }

    private static String cleanFromSpaces(String identifier) {

        StringBuilder result = new StringBuilder();

        for (char symbol: identifier.toCharArray()) {
            if (symbol == ' ') { symbol = '_'; }
            result.append(symbol);
        }
        return result.toString();
    }

    private static String convertKebabToCamelCase(String identifier) {

        StringBuilder result = new StringBuilder();
        char[] chars = identifier.toCharArray();

        for (int i = 0; i < identifier.length(); i++) {
            if (chars[i] == '-' && i + 1 < chars.length) {
                result.append( Character.toUpperCase(chars[i + 1]) );
                i++;
                continue;
            }
            result.append(chars[i]);
        }
        return result.toString();
    }

    private static String convertLeetspeakToNormalText(String identifier) {

        StringBuilder result = new StringBuilder();

        for (char symbol: identifier.toCharArray()) {
            switch (symbol) {
                case '4' -> result.append('a');
                case '3' -> result.append('e');
                case '0' -> result.append('o');
                case '1' -> result.append('l');
                case '7' -> result.append('t');

                default -> result.append(symbol);
            }
        }
        return result.toString();
    }

    private static String keepOnlyLetters(String identifier) {

        StringBuilder result = new StringBuilder();

        for (char symbol: identifier.toCharArray()) {
            if (Character.isLetter(symbol) || symbol == '_') {
                result.append(symbol);
            }
        }

        return result.toString();
    }
}
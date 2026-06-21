package com.practice.exercism.easy.karlsLanguages;

import java.util.ArrayList;
import java.util.List;

public class LanguageList {
    private final List<String> languages = new ArrayList<>();
    private final static String JAVA_LANGUAGE = "Java";
    private final static String KOTLIN_LANGUAGE = "Kotlin";

    public boolean isEmpty() {
       return languages.isEmpty();
    }

    public void addLanguage(String language) {
        languages.add(language);
    }

    public void removeLanguage(String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return languages.isEmpty() ? null : languages.getFirst();
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.contains(JAVA_LANGUAGE) || languages.contains(KOTLIN_LANGUAGE);
    }
}
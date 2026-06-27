package com.practice.exercism.easy.wizzardsandwarriors;

public class Wizard extends Fighter {

    private boolean spellPrepared = false;

    @Override
    int getDamagePoints(Fighter fighter) {
        return spellPrepared ? 12 : 3;
    }

    void prepareSpell() {
        spellPrepared = true;
    }

    @Override
    boolean isVulnerable() {
        return !spellPrepared;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
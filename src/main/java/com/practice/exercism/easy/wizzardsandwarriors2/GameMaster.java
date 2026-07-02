package com.practice.exercism.easy.wizzardsandwarriors2;

public class GameMaster {

    private static final String HORSEBACK_DESTINATION_MESSAGE = "You're traveling to your destination on horseback.";
    private static final String WALKING_DESTINATION_MESSAGE = "You're traveling to your destination by walking.";

    public String describe(Character character ) {
        return String.format("You're a level %d %s with %d hit points.",
                character.getLevel(),
                character.getCharacterClass(),
                character.getHitPoints());
    }

    public String describe(Destination destination) {
        return String.format("You've arrived at %s, which has %d inhabitants.",
                destination.getName(),
                destination.getInhabitants());
    }

    public String describe(TravelMethod travelMethod) {
        return travelMethod.equals(TravelMethod.HORSEBACK) ? HORSEBACK_DESTINATION_MESSAGE : WALKING_DESTINATION_MESSAGE;
    }

    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character) + " " + describe(travelMethod) + " " + describe(destination);
    }

    public String describe(Character character, Destination destination) {
        return describe(character) + " " + describe(TravelMethod.WALKING) + " " + describe(destination);
    }
}
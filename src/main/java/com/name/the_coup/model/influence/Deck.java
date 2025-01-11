package com.name.the_coup.model.influence;

import java.util.Random;

public class Deck {
    
    static Class<?>[] avaiableClasses = {
        Duque.class, Captain.class, Assassin.class, Condessa.class, Ambassador.class, Inquisitor.class
    };

    public static Class<?> drawInfluence(){
        Random random = new Random();
        int index = random.nextInt(avaiableClasses.length);
        return avaiableClasses[index];
    }
}

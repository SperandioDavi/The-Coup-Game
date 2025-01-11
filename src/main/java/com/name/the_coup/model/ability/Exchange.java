package com.name.the_coup.model.ability;

import java.lang.reflect.Constructor;

import com.name.the_coup.model.Player;
import com.name.the_coup.model.influence.Deck;
import com.name.the_coup.model.influence.Influence;

public class Exchange{

    private final boolean IS_BLOCKABLE = false;

    public static void execute(Player target, Influence[] influences){
        for (int i = 0; i < influences.length; i++){
            try{
                Class<?> newInfluence = Deck.drawInfluence();
                Constructor<?> constructor = newInfluence.getDeclaredConstructor(Player.class);
                influences[i] = (Influence) constructor.newInstance(target);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void execute(Player target, Influence influence){
        Influence[] influences = {influence};
        execute(target, influences);
    }
}

package com.name.the_coup.model.ability;

import java.util.Scanner;

import com.name.the_coup.model.Player;
import com.name.the_coup.model.influence.Influence;

public class Examine {
    private final boolean IS_BLOCKABLE = false;
    
    public static void execute(Player target, Influence chosenInfluence){
        try{
            System.out.println(chosenInfluence);
            Scanner scanner = new Scanner(System.in);
            boolean forceExchange = scanner.nextBoolean();
            if(forceExchange){
                Exchange.execute(target, chosenInfluence);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

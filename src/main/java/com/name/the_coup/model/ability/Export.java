package com.name.the_coup.model.ability;

import com.name.the_coup.model.Player;
import com.name.the_coup.model.influence.Ambassador;
import com.name.the_coup.model.influence.Captain;
import com.name.the_coup.model.influence.Inquisitor;

public class Export {
    private final boolean IS_BLOCKABLE = true;
    private final Class<?>[] BLOCKABLE_BY = {Captain.class, Ambassador.class, Inquisitor.class};
    
    public static void execute(Player target, Player owner){
        if(target.getCoins() >= 2){
            target.setCoins(target.getCoins() - 2);
            owner.setCoins(owner.getCoins() + 2);
        }
    }
}

package com.name.the_coup.model.influence;

import com.name.the_coup.model.Player;
import com.name.the_coup.model.ability.Examine;
import com.name.the_coup.model.ability.Exchange;

import jakarta.annotation.PostConstruct;

public class Inquisitor extends Influence {
    
    private final String name = "Inquisitor";

    public Inquisitor(Player owner){
        super(owner);
    }
    @PostConstruct
    public void init() {
        setAbilities();
    }

    public void exchange(Influence chosenInfluence){
        Player owner = this.getOwner();
        Exchange.execute(owner, chosenInfluence);
    }

    public void setAbilities(){
        Class<?>[] abilities = {Exchange.class, Examine.class};
        super.setAbilities(abilities);
    }
}

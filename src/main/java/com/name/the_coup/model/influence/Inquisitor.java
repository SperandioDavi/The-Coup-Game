package com.name.the_coup.model.influence;

import com.name.the_coup.model.Player;
import com.name.the_coup.model.ability.Exchange;

import jakarta.annotation.PostConstruct;

public class Inquisitor extends Influence {
    
    public Inquisitor(Player owner){
        super(owner);
    }
    @PostConstruct
    public void init() {
        setAbilities();
    }

    public void exchange(Influence chosenInfluence){
        Player owner = this.getOwner();
        Influence[] influence = {chosenInfluence};
        Exchange.execute(owner, influence);
    }

    public void setAbilities(){
        Class<?>[] abilities = {Exchange.class};
        super.setAbilities(abilities);
    }
}

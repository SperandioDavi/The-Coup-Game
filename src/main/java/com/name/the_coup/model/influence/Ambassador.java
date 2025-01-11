package com.name.the_coup.model.influence;

import com.name.the_coup.model.Player;
import com.name.the_coup.model.ability.Exchange;

import jakarta.annotation.PostConstruct;

public class Ambassador extends Influence {
    
    public Ambassador(Player owner){
        super(owner);
        }
    
        @PostConstruct
        public void init() {
            setAbilities();
    }

    public void exchange(){
        Player owner = this.getOwner();
        Influence[] influences = owner.getInfluences();
        Exchange.execute(owner, influences);
    }

    public void setAbilities(){
        Class<?>[] abilities = {Exchange.class};
        super.setAbilities(abilities);
    }
}

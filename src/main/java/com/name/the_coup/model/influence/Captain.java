package com.name.the_coup.model.influence;

import com.name.the_coup.model.Player;
import com.name.the_coup.model.ability.Export;

import jakarta.annotation.PostConstruct;

public class Captain extends Influence {

    private final String name = "Captain";

    public Captain(Player owner){
        super(owner);
    }
    @PostConstruct
    public void init() {
        setAbilities();
    }

    public void setAbilities(){
        Class<?>[] abilities = {Export.class};
        super.setAbilities(abilities);
    }
}

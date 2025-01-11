package com.name.the_coup.model.influence;

import com.name.the_coup.model.Player;

public abstract class Influence {
    private String name;
    protected Class<?>[] abilities;
    private boolean isRevealed;
    private Player owner;

    protected Influence(Player owner){
        this.isRevealed = false;
        this.setOwner(owner);
    }

    public Player getOwner() {
        return owner;
    }

    public void setOwner(Player owner) {
        this.owner = owner;
    }

    public Class<?>[] getAbilities() {
        return abilities;
    }

    public void setAbilities(Class<?>[] abilities) {
        this.abilities = abilities;
    }

    public boolean isRevealed() {
        return isRevealed;
    }

    public void setRevealed(boolean isRevealed) {
        this.isRevealed = isRevealed;
    }

    public boolean isIsRevealed() {
        return isRevealed;
    }

    public void setIsRevealed(boolean isRevealed) {
        this.isRevealed = isRevealed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
       return "Influence:" + this.name;
    }
}

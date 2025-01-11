package com.name.the_coup.model.influence;

import com.name.the_coup.model.Player;

public abstract class Influence {
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
}

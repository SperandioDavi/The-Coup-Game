package com.name.the_coup.model;

import com.name.the_coup.model.influence.Influence;

public class Player {
    private String name;
    private int coins;
    private Influence[] influences;
    private boolean isEliminated;

    public Player(String name){
        this.name = name;
        this.coins = 0;
        this.isEliminated = false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Influence[] getInfluences() {
        return influences;
    }

    public void setInfluences(Influence[] influences) {
        this.influences = influences;
    }

    public boolean isEliminated() {
        return isEliminated;
    }

    public void setEliminated(boolean isEliminated) {
        this.isEliminated = isEliminated;
    }

    public int getCoins() {
        return coins;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public boolean isIsEliminated() {
        return isEliminated;
    }

    public void setIsEliminated(boolean isEliminated) {
        this.isEliminated = isEliminated;
    }
}

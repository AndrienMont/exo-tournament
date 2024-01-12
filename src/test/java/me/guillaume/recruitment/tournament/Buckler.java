package me.guillaume.recruitment.tournament;

public class Buckler {
    private boolean block;
    private int hitpoints;

    public Buckler(){
        block = true;
        hitpoints = 3;
    }

    public void guard(){
        if(hitpoints >0){
            block = true;
        }
    }

    public void takeHit(String weapon){
        block = false;
        if(weapon.equals("axe")){
            hitpoints -= 1;
        }
    }

    public boolean isBlocking(){
        return block;
    }
}

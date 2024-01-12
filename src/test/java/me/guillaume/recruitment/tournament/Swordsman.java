package me.guillaume.recruitment.tournament;

public class Swordsman {
    private int hitPoints;
    private int dmg;

    public Swordsman(){
        this.hitPoints = 100;
        this.dmg = 5;
    }

    public int hitPoints(){
        return hitPoints;
    }

    public void engage(Viking v){
        v.takeDmg(dmg);
        if(v.hitPoints() > 0){
            v.engage(this);
        }
    }

    public void takeDmg(int val){
        if(hitPoints < val){
            hitPoints = 0;
        } else {
            this.hitPoints -= val;
        }

    }
}

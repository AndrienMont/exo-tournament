package me.guillaume.recruitment.tournament;

public class Viking {
    private int hitPoints;
    private int dmg;

    public Viking(){
        this.hitPoints = 120;
        this.dmg = 6;
    }

    public int hitPoints(){
        return this.hitPoints;
    }

    public void engage(Swordsman s){
        s.takeDmg(dmg);
        if(s.hitPoints() > 0){
            s.engage(this);
        }
    }

    public void takeDmg(int val){
        if(hitPoints < val){
            hitPoints = 0;
        }else{
            this.hitPoints -= val;
        }

    }
}

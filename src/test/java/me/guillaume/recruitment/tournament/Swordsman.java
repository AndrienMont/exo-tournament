package me.guillaume.recruitment.tournament;

public class Swordsman extends Duellist{

    public Swordsman(){
        hitPoints = 100;
        dmg = 5;
        weapon = "sword";
    }

    @Override
    public void engage(Duellist d) {
        d.takeDmg(dmg,weapon);
        if(d.hitPoints() > 0){
            d.engage(this);
        }
    }

    @Override
    public Swordsman equip(String equipment) {
        gearUp(equipment);
        return this;
    }

}

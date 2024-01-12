package me.guillaume.recruitment.tournament;

public class Highlander extends Duellist{
    private int remainingHits;

    public Highlander(){
        hitPoints = 150;
        dmg = 12;
        weapon = "great sword";
        remainingHits = 2;
    }
    @Override
    public void engage(Duellist d) {
        if(remainingHits > 0){
            d.takeDmg(dmg,weapon);
            remainingHits--;
        }else if(remainingHits == 0){
            remainingHits = 2;
        }
        if(d.hitPoints() > 0){
            d.engage(this);
        }
    }

    @Override
    public Highlander equip(String equipment) {
        gearUp(equipment);
        return this;
    }
}

package me.guillaume.recruitment.tournament;

public class Viking extends Duellist{

    public Viking(){
        hitPoints = 120;
        dmg = 6;
        weapon = "axe";
    }

    @Override
    public void engage(Duellist d) {
        d.takeDmg(dmg,weapon);
        if(d.hitPoints() > 0){
            d.engage(this);
        }
    }

    @Override
    public Viking equip(String equipment) {
        if(equipment.equals("buckler")){
            shield = new Buckler();
        }
        return this;
    }
}

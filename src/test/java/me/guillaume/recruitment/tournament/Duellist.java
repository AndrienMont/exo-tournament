package me.guillaume.recruitment.tournament;

public abstract class Duellist {
    protected int hitPoints;
    protected int dmg;
    protected String weapon;
    protected Buckler shield;

    public String getWeapon(){
        return weapon;
    }

    public int hitPoints(){
        return hitPoints;
    }

    public abstract void engage(Duellist d);
    public void takeDmg(int val, String weapon){
        if(shield.isBlocking()){
            shield.takeHit(weapon);
        }else{
            if(hitPoints < val){
                hitPoints = 0;
            } else {
                this.hitPoints -= val;
            }
            shield.guard();
        }
    }
    public abstract Duellist equip(String equipment);
}

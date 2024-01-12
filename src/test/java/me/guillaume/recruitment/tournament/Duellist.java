package me.guillaume.recruitment.tournament;

public abstract class Duellist {
    protected int hitPoints;
    protected int dmg;
    protected String weapon;
    protected Buckler shield;
    protected int defense = 0;

    public String getWeapon(){
        return weapon;
    }

    public int hitPoints(){
        return hitPoints;
    }

    public abstract void engage(Duellist d);
    public void takeDmg(int val, String weapon){
        if(shield != null){
            if(shield.isBlocking()){
                shield.takeHit(weapon);
            }else{
                calcDmg(val);
                shield.guard();
            }
        }else{
            calcDmg(val);
        }
    }

    public void calcDmg(int val){
        if((hitPoints + defense) < val){
            hitPoints = 0;
        } else {
            int degats = val - defense;
            if(degats > 0){
                this.hitPoints -= degats;
            }
        }
    }
    public void gearUp(String equipment){
        if(equipment.equals("buckler")){
            shield = new Buckler();
        }else if(equipment.equals("armor")){
            defense = 3;
            dmg -= 1;
        }
    }
    public Duellist equip(String equipment){
        gearUp(equipment);
        return this;
    }
}

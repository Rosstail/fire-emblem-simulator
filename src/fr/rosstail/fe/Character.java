package fr.rosstail.fe;

public class Character {
    protected String name;
    protected int maxHp;
    protected int dexterity;
    protected int strenght;
    protected int power;
    protected int speed;
    protected int defense;
    protected int resistance;
    protected int luck;
    protected String cls = "None";

    public String getCls() {
        return this.cls;
    }

    @Override
    public String toString() {
        return "Name : " + this.name +
                "\nClass : " + this.getCls() +
                "\nHealth : " + this.maxHp +
                "\nDexterity : " + this.dexterity +
                "\nStrenght : " + this.strenght +
                "\nPower : " + this.power +
                "\nSpeed : " + this.speed +
                "\nDefense : " + this.defense +
                "\nResistance : " + this.resistance +
                "\nLuck : " + this.luck
                ;
    }
}

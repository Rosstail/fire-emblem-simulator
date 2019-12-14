package fr.rosstail.fe;

public class Barbarian extends Character{
    protected String cls = "Barbarian";

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

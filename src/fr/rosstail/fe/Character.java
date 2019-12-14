package fr.rosstail.fe;

import java.util.Scanner;

public class Character {
    protected String name;
    protected int maxHp;
    protected int dxt;
    protected int str;
    protected int pow;
    protected int spd;
    protected int def;
    protected int res;
    protected int luck;
    protected String cls = "None";

    public void setName(String name) {
        this.name = name;
    }

    public String getCls() {
        return this.cls;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public void setDxt(int dxt) {
        this.dxt = dxt;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public void setPow(int pow) {
        this.pow = pow;
    }

    public void setSpd(int spd) {
        this.spd = spd;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void setRes(int res) {
        this.res = res;
    }

    public void setLuck(int luck) {
        this.luck = luck;
    }

    public void setAttrib() {
        Scanner scan = new Scanner(System.in);
        int entryInt;
        String entry;
        System.out.println("Type here, the informations of your character...");
        System.out.println("What is his name ?");
        System.out.println(" ");
        entry = scan.nextLine();
        this.setName(entry);
        System.out.println("What is his maximum Health ?");
        System.out.println(" ");
        entryInt = scan.nextInt();
        this.setMaxHp(entryInt);
        System.out.println("What is his Dexterity ?");
        System.out.println(" ");
        entryInt = scan.nextInt();
        this.setDxt(entryInt);
        System.out.println("What is his Strenght ?");
        System.out.println(" ");
        entryInt = scan.nextInt();
        this.setStr(entryInt);
        System.out.println("What is his Power ?");
        System.out.println(" ");
        entryInt = scan.nextInt();
        this.setPow(entryInt);
        System.out.println("What is his Speed ?");
        System.out.println(" ");
        entryInt = scan.nextInt();
        this.setSpd(entryInt);
        System.out.println("What is his Defense ?");
        System.out.println(" ");
        entryInt = scan.nextInt();
        this.setDef(entryInt);
        System.out.println("What is his Resistance ?");
        System.out.println(" ");
        entryInt = scan.nextInt();
        this.setRes(entryInt);
        System.out.println("What is his Luck ?");
        System.out.println(" ");
        entryInt = scan.nextInt();
        this.setLuck(entryInt);
    }

    @Override
    public String toString() {
        return "Name : " + this.name +
                "\nClass : " + this.getCls() +
                "\nHealth : " + this.maxHp +
                "\nDexterity : " + this.dxt +
                "\nStrenght : " + this.str +
                "\nPower : " + this.pow +
                "\nSpeed : " + this.spd +
                "\nDefense : " + this.def +
                "\nResistance : " + this.res +
                "\nLuck : " + this.luck
                ;
    }
}

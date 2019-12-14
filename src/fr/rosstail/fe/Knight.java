package fr.rosstail.fe;

import java.util.Scanner;

public class Knight extends Character {
    protected String cls = "Knight";

    public String getCls() {
        return this.cls;
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

package fr.rosstail.fe;

import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean menuChoice = true;
        Character[] list_character = new Character[0];
        String entry;
        System.out.println("Welcome to my Fire Emblem Arena Simulator !\n");
        helpCommandMenu();
        //Create new scanner
        Scanner scan = new Scanner(System.in);
        while ( menuChoice ) {
            //next text entered by the user will be stored
            entry = scan.nextLine();
            switch(entry) {
                case "help":
                    helpCommandMenu();
                    break;
                case "new character":
                    list_character = Arrays.copyOf(list_character, list_character.length + 1);
                    list_character[list_character.length - 1] = createCharacter();
                    break;
                case "list":
                    listAllCharacters(list_character);
                    break;
                case "details":
                    showOneCharacter(list_character);
                    break;
                case "delete character":
                    deleteCharacter(list_character);
                    break;
                case "fight":
                    startFight();
                    break;
                case "leave":
                    menuChoice = false;
                    break;
                default:
                    System.out.println("Invalid Command. please type \"help\" to get the list of commands.");
            }
        }
    }

    public static void helpCommandMenu() {
        System.out.println(
                "                    HELP\n" +
                        "help : display the list of avaiable commands.\n" +
                        "new character : start creating a new character.\n" +
                        "list : display list and details every existing characters.\n" +
                        "details : display details of one existing character.\n" +
                        "delete character : delete an existing character.\n" +
                        "fight : start a fight between two characters.\n" +
                        "leave : close the program."
        );
    }

    public static Character createCharacter() {
        boolean classMenuChoice = true;
        String entry;
        System.out.println("CREATE NEW CHARACTER");
        Character newCharacter = new Character();
        Scanner scan = new Scanner(System.in);
        System.out.println(
                "What class do you want your character to be?\n" +
                        "Mercenary, Knight, Barbarian\n" +
                        "Type \"classes info\" to get some details on each class."
        );
        while ( classMenuChoice ) {
            entry = scan.nextLine();
            switch (entry) {
                case "None" :
                    newCharacter = new Character();
                    System.out.println("You didn't choosed any class.");
                    classMenuChoice = false;
                    break;
                case "Mercenary":
                    newCharacter = new Mercenary();
                    System.out.println(
                            "You have choosed the Mercenary Class."
                    );
                    classMenuChoice = false;
                    break;
                case "Knight":
                    newCharacter = new Knight();
                    System.out.println(
                            "You have choosed the Knight Class."
                    );
                    classMenuChoice = false;
                    break;
                case "Barbarian":
                    newCharacter = new Barbarian();
                    System.out.println(
                            "You have choosed the Barbarian Class."
                    );
                    classMenuChoice = false;
                    break;
                default:
                    System.out.println(
                            "Invalid command."
                    );
            }
        }
        newCharacter.setAttrib();
        System.out.println(newCharacter.toString());
        return newCharacter;
    }

    public static void listAllCharacters(Character[] list_character) {
        for (int index = 0; index < list_character.length; index++) {
            System.out.println(
                    "ID : " + (index) + "\n" +
                            list_character[index].toString() +
                            "\n"
            );
        }
    }

    public static void showOneCharacter(Character[] list_character) {
        int index;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an ID between 0 and " + ( list_character.length - 1) );
        index = scan.nextInt();
        if (index >= 0 && index < list_character.length) {
            System.out.println("");
            System.out.println(
                    "ID : " + (index) + "\n" +
                            list_character[index].toString() +
                            "\n"
            );
        }
        else
            System.out.println("Unknown number, back to Main menu.");
    }

    public static void deleteCharacter(Character[] list_character) {
        int index;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an ID between 0 and " + (list_character.length -1) );
        index = scan.nextInt();
        if (index >= 0 && index < list_character.length) {
            while (index < (list_character.length - 1) ) {
                list_character[index] = list_character[index + 1];
                index++;
            }
            list_character = Arrays.copyOf(list_character, list_character.length - 1);
            System.out.println(
                    "\n" +
                            "The character has been deleted."
                    );
        }
        else
            System.out.println("\nUnknown number, back to Main menu.");
    }

    public static void startFight() {
        System.out.println("IT'S TIME FOR A DEATHBATTLLLLLLLLLE !!!");
    }
}
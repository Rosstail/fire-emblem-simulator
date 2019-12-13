package fr.rosstail.fe;

import java.lang.invoke.SwitchPoint;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean menuChoice = true;
        Character[] list_character = new Character[0];
        String entry;
        System.out.println("Hello World !");
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
                    listAllCharacters();
                    break;
                case "details":
                    showOneCharacter();
                    break;
                case "delete character":
                    deleteCharacter();
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
        System.out.println("CREATE NEW CHARACTER");
        return "test";
    }

    public static void listAllCharacters() {
        System.out.println("LIST AND DETAILS ALL CHARACTERS");
    }

    public static void showOneCharacter() {
        System.out.println("DISPLAY ONE CHARACTER");
    }

    public static void deleteCharacter() {
        System.out.println("DELETE ONE CHARACTER");
    }

    public static void startFight() {
        System.out.println("IT'S TIME FOR A DEATHBATTLLLLLLLLLE !!!");
    }
}
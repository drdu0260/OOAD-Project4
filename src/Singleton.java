import java.util.Scanner;

//Singleton Pattern
public class Singleton {
    private static Singleton unique;
    public static String name;
    public static Scanner scan = new Scanner(System.in);

    //Allows only one instance 
    public static Singleton getInstance(){
        if(unique == null){unique = new Singleton();}
        return unique;
    }

    // Gets user's name from terminal input
    public static void getNameFromUser(){
        System.out.println("What is your name? ");
        name = scan.nextLine();
    }

    //returns User's name
    public static String getName(){
        return name;
    }

    //Displays the Options Menu
    public static void DisplayMenu(){
        System.out.println("(1) Unlock all of the Vehicles");
        System.out.println("(2) Wash all of the Vehicles");
        System.out.println("(3) Tune Up all of the Vehicles");
        System.out.println("(4) Test Drive all of the Vehicles");
        System.out.println("(5) Lock all of the Vehicles");
        System.out.println("(6) Leave the Garage for the day");
        System.out.println("Which action would you like to perform at this hour? (select an action by typing the number)");
    }

    //Gets the requested Action from User
    public static int getActionFromUser(){
        DisplayMenu();
        int num = scan.nextInt();
        return num;
    }


}

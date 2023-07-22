
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter into The Adventure Game!");
        System.out.println("---------------------------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the Avatar!");
        System.out.println("---------------------------------");
        System.out.println(" 1. Male" +
                "\t\n 2. Female");
        int a = sc.nextInt();
        switch (a) {
            case 1 -> System.out.println("You Choose the Male Avatar");
            case 2 -> System.out.println("You Choose the Female Avatar");
            default -> System.out.println("Choose the Correct Option");
        }

        while (true) {
            System.out.println("---------------------------------");
            System.out.println("Choose the Way to Enter the World:");
            System.out.println(" 1. City" +
                    "\t\n 2. Forest");
            int b = sc.nextInt();
            switch (b) {
                case 1 -> System.out.println("___________You Choose the Map City____________");
                case 2 -> System.out.println("___________You Choose the Map Forest____________");
                case 3 -> System.out.println("Not interested to enter the world!");
            }
            MapCity();

        }
    }

    public static void MapCity() {
        // develop the game in what we were doing in the cities? like shopping.
        System.out.println("Welcome to the Map city");
        Scanner sc = new Scanner(System.in);
        int PlayerHealth = 100;
        System.out.println("PlayerHealth : " + PlayerHealth);
        int cash = 1000;
        System.out.println("Cash : " + cash);
        System.out.println(" 1. Shopping" +
                "\n 2. Drive a car" + "\n 3. Leave the Map City!");
        int a = sc.nextInt();
        int chocolate = 50;
        int biscuits = 60;
        boolean isExit = false;
        while (true) {
            if (a == 1) {
                System.out.println("You have choose to Shopping!");
                System.out.println("Buy the products"
                        + "\n 1. Chocolate" + "\n 2. Biscuits" + "\n 3. Leave from the shopping");
                int b = sc.nextInt();
                switch (b) {
                    case 1 -> {
                        cash -= chocolate;
                        System.out.println("Total :" + cash);
                    }
                    case 2 -> {
                        cash -= biscuits;
                        System.out.println("Total :" + cash);
                    }
                    case 3 -> {
                        System.out.println("You are leaving from the shopping!");
                        isExit = true;
                    }
                    default -> System.out.println("Give the options from 1 and 2 and 3!");
                }
                if (isExit) break;
            }

            if (a == 2) {
                System.out.println("You have choose to Drive a Car!");
                System.out.println("Get a car from the parking lot!");
                System.out.println("Please type ENTER to get inside the car.");
                sc.nextLine();
                String str = sc.nextLine();
                String str1 = "ENTER";
                System.out.println("You were " + str + " into the car:");
                System.out.println("Type a command like UP, DOWN, LEFT, RIGHT, EXIT");


                while (str.equals(str1)) {
                    String n = sc.nextLine().toUpperCase();
                    switch (n) {
                        case "UP" -> System.out.println("Car is moving forward.");
                        case "DOWN" -> System.out.println("Car is slow downing and move backward.");
                        case "LEFT" -> System.out.println("Car is turning left.");
                        case "RIGHT" -> System.out.println("Car is turning right.");
                        case "EXIT" -> System.out.println("Exiting from the car.");
                    }
                    if (isExit) break;
                }
            }
        }
    }

    public static void MapForest() {
        // develop the game in what the person were doing in forest?  like haunting and eating etc.....


    }
}
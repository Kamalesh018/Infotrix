import java.util.Scanner;

public class TextAdventureGame {

        public static void main(String[] args) {
            startGame();
        }

        //	    public static void startGame() {
        // Implement the game's introduction and initial scenario here
        //	    }

        // Define methods for different scenarios and choices as needed


        public static void startGame() {
            System.out.println("You find yourself standing in front of a mysterious haunted house.");
            System.out.println("Will you enter the house and explore its secrets?");
            System.out.println("1. Yes, I'm brave enough!");
            System.out.println("2. No, I better run away!");

            int choice = getUserChoice(1, 2);

            if (choice == 1) {
                enterHouse();
            } else {
                System.out.println("You decide not to enter the house and run away. Game over!");
            }
        }


        public static void enterHouse() {
            System.out.println("You step inside the dark and eerie house.");
            System.out.println("As you move deeper, you encounter two doors.");
            System.out.println("Which door will you choose?");
            System.out.println("1. Door on the left");
            System.out.println("2. Door on the right");

            int choice = getUserChoice(1, 2);

            if (choice == 1) {
                leftDoorScenario();
            } else {
                rightDoorScenario();
            }
        }

        public static void leftDoorScenario() {
            System.out.println("You enter a room with ghostly apparitions floating around.");
            System.out.println("In the corner, you spot a chest.");
            System.out.println("What will you do?");
            System.out.println("1. Open the chest");
            System.out.println("2. Ignore the chest and leave the room");

            int choice = getUserChoice(1, 2);

            if (choice == 1) {
                System.out.println("As you open the chest, a ghost appears and scares you away. Game over!");
            } else {
                System.out.println("You decide to leave the room. As you turn around, you spot a key on the floor.");
                System.out.println("You pick up the key and continue exploring.");
                // Implement the next scenario here or end the game.
            }
        }

        public static void rightDoorScenario() {
            // Implement another scenario based on the right door choice
            // You can continue adding more scenarios and choices to expand the game
            System.out.println("You enter a room with full of Gold and Arguments.");
            System.out.println("What will you do?");
            System.out.println("1. Collect the Gold and Arguments.");
            System.out.println("2. Not Interested to collect. I need more loots");

            int choice = getUserChoice(1,2);

            if (choice == 1){
                System.out.println("Have you collected the all the Gold and Arguments from the room, You may leave the room");
            }else {
                System.out.println("Search around!!! for the lit bit MAP to collect the Treasure!!!!!" );
            }
        }

        public static  void isLitMAp(){
            // search a lit bit of map to collect the treasure.

        }



        // Helper method to get and validate user choices
        public static int getUserChoice(int minChoice, int maxChoice) {
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.print("Enter your choice: ");
                while (!scanner.hasNextInt()) {
                    System.out.println("Invalid input. Please enter a number.");
                    scanner.next();
                }
                choice = scanner.nextInt();
            } while (choice < minChoice || choice > maxChoice);

            return choice;
        }

    }


import java.util.Scanner;

public class City {

    private int cash;
    private int chocolate = 50;
    private int biscuits = 60;
    private Scanner sc = new Scanner(System.in);

    public City(int cash) {
        this.cash = cash;
    }

    public void enterCity() {
        boolean isExit = false;
        while (!isExit) {
            System.out.println(" 1. Shopping" +
                    "\n 2. Drive a car" + "\n 3. Leave the Map City!");
            int a = sc.nextInt();
            if (a == 1) {
                enterShop();
            } else if (a == 2) {
                enterDriving();
            } else if (a == 3){
                System.out.println("You are leaving from the MAP city!");
                isExit = true;
            }
        }
    }

    private void enterDriving() {
        System.out.println("You have choose to Drive a Car!");
        System.out.println("Get a car from the parking lot!");
        System.out.println("Please type ENTER to get inside the car.");
        sc.nextLine();
        String str = sc.nextLine();
        if(str.equals("ENTER")) {
            System.out.println("You were " + str + " into the car:");
            System.out.println("Type a command like UP, DOWN, LEFT, RIGHT, EXIT");
            drive();
        }
        System.out.println("Exiting from the car.");
    }

    private void drive() {
        boolean exitCar = false;
        while (!exitCar) {
            String n = sc.nextLine().toUpperCase();
            exitCar = operateCar(n);
        }
    }

    private boolean operateCar(String n) {
        switch (n) {
            case "UP" -> System.out.println("Car is moving forward.");
            case "DOWN" -> System.out.println("Car is slow downing and move backward.");
            case "LEFT" -> System.out.println("Car is turning left.");
            case "RIGHT" -> System.out.println("Car is turning right.");
            case "EXIT" -> {
                return true;
            }
        }
        return false;
    }

    private void enterShop() {
        System.out.println("You have choose to Shopping!");
        boolean exitShop = false;
        while (!exitShop) {
            System.out.println("Buy the products"
                    + "\n 1. Chocolate -- $" + chocolate + "\n 2. Biscuits -- $" + biscuits + "\n 3. Leave from the shopping");
            int b = sc.nextInt();
            switch (b) {
                case 1 :
                    if(cash<chocolate) System.out.println("Not enough cash");
                    cash -= chocolate;
                    System.out.println("Total cash:" + cash);
                    break;
                case 2 :
                    if(cash<biscuits) System.out.println("Not enough cash");
                    else cash -= biscuits;
                    System.out.println("Total cash:" + cash);
                    break;
                case 3 :
                    System.out.println("You are leaving from the shopping!");
                    exitShop = true;
                    break;
                default :
                    System.out.println("Give the options from 1 and 2 and 3!");
            }
        }
    }

    public int getCash() {
        return this.cash;
    }

    public void setCash(int c) {
        this.cash = c;
    }
}

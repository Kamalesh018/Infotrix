import java.util.Scanner;

public class Forest {
    private int axes = 150;
    private int knife = 100;
    private int hammer = 75;
    private int sheep = 500;
    private int rabbit = 300;
    private int pig = 200;
    private int cash;
    private Scanner sc = new Scanner(System.in);

    public Forest(int cash) {
        this.cash = cash;
    }

    public void enterForest() {
        boolean isExit = false;
        System.out.println("Welcome to the shop!");
        while (!isExit) {
            System.out.println(" 1. Buy the weapons" +
                    "\n 2. Hunt Animals" +
                    "\n 3. Exit from Forest");
            int a = sc.nextInt();
            if (a == 1) {
                buyWeapons();
            } else if (a == 2) {
                huntAnimals();
            } else if (a == 3 ) {
                isExit = true;
                System.out.println("You are leaving from the MAP Forest!");
            }

        }
    }

    private void huntAnimals() {
        boolean exitWeapons = false;
        while (!exitWeapons) {
            System.out.println("Choose the animal to hunt");
            System.out.println(" 1. Sheep -- $500"
                    + "\n 2. Rabbit -- $300" + "\n 3. Pig -- $200" + "\n 4. Leave from the shop");
            int b = sc.nextInt();
            switch (b) {
                case 1 -> {
                    cash += sheep;
                    System.out.println("Hunted and sold Sheep");
                    System.out.println("Total :" + cash);
                }
                case 2 -> {
                    cash += rabbit;
                    System.out.println("Hunted and sold Rabbit");
                    System.out.println("Total :" + cash);
                }
                case 3 -> {
                    cash += pig;
                    System.out.println("Hunted and sold Pig");
                    System.out.println("Total :" + cash);
                }
                case 4 -> {
                    exitWeapons = true;
                    System.out.println("You were leave from the shop");
                }
                default -> {
                    System.out.println("Give the options from 1 and 2 and 3 and 4!");
                }
            }
        }
    }

    private void buyWeapons() {
        boolean exitWeapons = false;
        while (!exitWeapons) {
            System.out.println("Choose the number to buy the weapons");
            System.out.println(" 1. Axes -- $"+
                    axes
                    + "\n 2. Knife -- $"+ knife + "\n 3. Hammer -- $" + hammer + "\n 4. Leave from the shop");
            int b = sc.nextInt();
            switch (b) {
                case 1 -> {
                    if(cash<axes) System.out.println("Not enough cash");
                    else cash -= axes;
                    System.out.println("Total :" + cash);
                }
                case 2 -> {
                    if(cash<knife) System.out.println("Not enough cash");
                    else cash -= knife;
                    System.out.println("Total :" + cash);
                }
                case 3 -> {
                    if(cash<hammer) System.out.println("Not enough cash");
                    else cash -= hammer;
                    System.out.println("Total :" + cash);
                }
                case 4 -> {
                    exitWeapons = true;
                    System.out.println("You were leave from the shop");
                }
                default -> {
                    System.out.println("Give the options from 1 and 2 and 3 and 4!");
                }
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

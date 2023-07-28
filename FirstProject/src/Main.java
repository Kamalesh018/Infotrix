import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private static City city;
    private static Forest forest;

    private static int cash = 1000;
    private static String avatar;

    public static void main(String[] args) {

        city = new City(cash);
        forest = new Forest(cash);
        System.out.println("Enter into The Adventure Game!");
        System.out.println("---------------------------------");
        getAvatar();
        boolean exitGame = false;
        while (!exitGame) {
            System.out.println("---------------------------------");
            System.out.println("Choose the Way to Enter the World:");
            System.out.println(" 1. City" +
                    "\t\n 2. Forest" + "\t\n 3. Not Interested");
            int b = sc.nextInt();
            switch (b) {
                case 1 :
                    System.out.println("___________You Choose the Map City____________");
                    mapCity();
                    break;
                case 2 :
                    System.out.println("___________You Choose the Map Forest____________");
                    mapForest();
                    break;
                case 3 :
                    System.out.println("Try again game it will be more interesting!");
                    exitGame = true;
                    break;
                default:
                    System.out.println("Invalid Choice!");
            }
        }

        System.out.println("Avatar : " + avatar);
        System.out.println("Cash remaining = " + cash);
        System.out.println("Thank you for playing the game!!!");
    }

    private static void getAvatar() {
        System.out.println("Choose the Avatar!");
        System.out.println("---------------------------------");
        System.out.println(" 1. Male" +
                "\t\n 2. Female");
        int a = sc.nextInt();
        switch (a) {
            case 1 -> {
                System.out.println("You Choose the Male Avatar");
                avatar = "MALE";
            }
            case 2 -> {
                System.out.println("You Choose the Female Avatar");
                avatar = "FEMALE";
            }
            default -> System.out.println("Choose the Correct Option");
        }
    }

    private static void mapCity() {
        // develop the game in what we were doing in the cities? like shopping.
        System.out.println("Welcome to the Map city");
        System.out.println("Cash : " + cash);
        city.setCash(cash);
        city.enterCity();
        cash = city.getCash();
        System.out.println();
    }

    private static void mapForest() {
        // develop the game in what the person were doing in forest?  like hunting and eating etc.....
        System.out.println("Welcome to the Map Forest");
        System.out.println("Cash : " + cash);
        forest.setCash(cash);
        forest.enterForest();
        cash = forest.getCash();
    }
}
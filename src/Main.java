import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //intro name
        System.out.println("Welcome to the game...");
        System.out.println("Traveler, what is your name?");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Welcome " + name + ".");
        //intro stats
        System.out.println("Are you aggressive or defensive? (ENTER A OR D)");
        String answer1 = scan.nextLine();
        if (Objects.equals(answer1, "A")) {
            System.out.println("The best strategy is to end the battle faster.");
        } else if (Objects.equals(answer1, "D")) {
            System.out.println("As they say in the lands between, vigor check.");
        } else {
            System.out.println("I don't know what you said.");
        }
    }
}

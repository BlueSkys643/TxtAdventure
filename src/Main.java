import java.util.Objects;
import java.util.Scanner;
import java.util.stream.IntStream;


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
        if (Objects.equals(answer1.toUpperCase(), "A")) {
            System.out.println("The best strategy is to end the battle faster.");
            Character objChar = new Character(name, 5, 5, 2, 1);
        } else if (Objects.equals(answer1.toUpperCase(), "D")) {
            System.out.println("As they say in the lands between, vigor check.");
            Character objChar = new Character(name, 5, 5, 1, 2);
        } else {
            System.out.println("I don't know what you said.");
        }
        String[] locations = {
                "path",
                "river",
                "lake",
                "mine",
                "field"
        };
        System.out.println("You awaken standing in a " + locations[0]);

    }
}

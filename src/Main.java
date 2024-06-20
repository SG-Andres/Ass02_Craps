import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
        boolean again = false;

    do {
        Random rnd = new Random();
        int die1 = rnd.nextInt(6) + 1;
        int die2 = rnd.nextInt(6) + 1;
        int crapsRoll = die1 + die2;
        int point = 0;
        boolean gameOver = false;
        boolean afterPoint = false;

        System.out.println("Roling dice...");
        System.out.println(crapsRoll + " = " + die1 + "+" + die2);

        if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12){
            System.out.println("You crapped out!");
            again = false;
        } else if (crapsRoll == 7 || crapsRoll == 11) {
            gameOver = false;
            System.out.println("You win!");
        } else {
            point = crapsRoll;
            afterPoint = true;
            System.out.println("The point is set to " + point);

            while (afterPoint) {
            System.out.println("Rolling dice...");
                die1 = rnd.nextInt(6) + 1;
                die2 = rnd.nextInt(6) + 1;
                crapsRoll =die1 +die2;
                System.out.println(crapsRoll + " = " + die1 + "+" + die2);

                if (crapsRoll == point){
                    System.out.println("You made point! You win!");
                    gameOver = true;
                    afterPoint = false;
                } else if (crapsRoll == 7){
                    System.out.println("Rolled a 7 You lose");
                    gameOver = true;
                    afterPoint = false;
                } else {
                    System.out.println("Trying for point: " + point);
                }
            }
        }

        if (gameOver == true) {
            System.out.println("Game over!");
            System.out.println("Would you like to play again? (y/n)");
            again = scanner.nextLine().trim().equalsIgnoreCase("Y");
        } else {
            again = false;
        }
    } while (again);
    }
}
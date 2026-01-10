import java.util.Scanner;
import java.util.Random;

public class TASK1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(100) + 1;
        int guess = 0;

        System.out.println("Guess a number between 1 and 100");

        while (guess != randomNumber) {
            guess = sc.nextInt();

            if (guess > randomNumber) {
                System.out.println("Too high, try again");
            } 
            else if (guess < randomNumber) {
                System.out.println("Too low, try again");
            } 
            else {
                System.out.println("Correct! You guessed the number 🎉");
            }
        }

        sc.close();
    }
}



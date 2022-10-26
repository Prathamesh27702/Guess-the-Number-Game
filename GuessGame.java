import java.util.Scanner;




public class GuessGame {

   static  int getNoOfAttempts(int noOfAttempts)
   {
       return noOfAttempts;
   }
    public static void main(String[] args) {
        int noOfAttempts = 0;
        int secretNum;
        int guess;
        boolean correct = false;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("GIVE ME SECRET NUMBER ");
        secretNum = keyboard.nextInt();

        while (!correct) {
            System.out.println("GUESS: ");
            guess = keyboard.nextInt();

            if (guess == secretNum) {
                correct = true;
                System.out.println("CONGRATULATIONS!!! YOU GUESSED THE CORRECT NUMBER ");
                noOfAttempts++;
            } else if (guess < secretNum) {

                System.out.println("YOUR SECRET NUMBER IS BIGGER THAN " + guess);
                noOfAttempts++;
            } else if (guess > secretNum) {
                System.out.println("YOUR SECRET NUMBER IS SMALLER THAN " + guess);
                noOfAttempts++;
            }
        }
        System.out.println("You Guessed the number in "+getNoOfAttempts(noOfAttempts) + " Attempts ");

    }
}


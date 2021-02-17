package Final_Program;
import java.util.Scanner;

public class UserChoice {

    //Scanner object.
    Scanner input = new Scanner(System.in);

    public void Choice() {
        boolean running = true;
        do {
            System.out.print("Do you want to play? [yes/no]: ");
            char Choice = input.next().charAt(0);
            switch (Choice) {
                //if yes or y the program will continue running
                case 'y' -> {
                    System.out.println("Let's play!");
                    running = false;
                }
                //if no or n the program will stop
                case 'n' -> {
                    System.out.println("Goodbye...");
                    System.out.println("Thanks for running the program...");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid Command...!");
                    System.out.println("Do you want to try again...!");
                }
            
            }

             /*
             *if the user type an invalid command like another letter other than yes or nos,
             *the program will ask do you want to try again?
             *if no the program will stop.
             * if yes the program will ask do you want to run the program.
             */

        } while (running);
        System.out.print("What is your name: ");
        input.next();

        System.out.print("What is your age: ");
        int age = input.nextInt();

        // if age is > or = 18 you can play the game.
        if (age >= 18) {
            System.out.println("You are old enough to play!");
            running = false;
        }

        //if not you can't play the game.
        else {
            System.out.println("You are not old enough to play...");
            System.exit(0);
        }
        System.out.println();
        System.out.println("After the selection the program continues");
    }
    
}





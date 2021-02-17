package Final_Program;
import java.util.Random;
import java.util.Scanner;

public class GameAdventure {

    public static void Adventure() {

        Scanner UserInput = new Scanner(System.in);
        Random random = new Random();

        String wants_to_run_the_again;

        do {
            // Game variables
            String[] enemies = {"Darkspawn Ogre", "Zombies", "Frieza", "Assassin", "Dark Ganon", "Reapers", "Murlocs"};
            int Max_Enemy_Health = 75;
            int Enemy_Attack_Damage = 25;
	    String Hello = "You stupid";



            // Player variables
            int Health = 100;
            int AttackDamage = 50;
            int Numb_Of_Health_Potion = 3;
            int Health_Potion_Heal_Amount = 30;
            int Health_Potion_Drop_Chance = 50;


            System.out.println("Welcome!");

            //Game Logic
            GAME:
            while (true) {
                System.out.println("---------------------------------");

                int Enemy_Health = random.nextInt(Max_Enemy_Health);
                String enemy = enemies[random.nextInt(enemies.length)];
                System.out.println("\t# " + enemy + " has appeared' #\n");

                label:
                while (Enemy_Health > 0) {
                    System.out.println("\tYour HP: " + Health);
                    System.out.println("\t" + enemy + " 's HP: " + Enemy_Health);
                    System.out.println("\n\tWhat would you like to do?");
                    System.out.println("\t1. Attack");
                    System.out.println("\t2. Drink Health potion");
                    System.out.println("\t3. Run!");

                    String input = UserInput.nextLine();
                    switch (input) {
                        case "1":
                            int DamageDealt = random.nextInt(AttackDamage);
                            int DamageTaken = random.nextInt(Enemy_Attack_Damage);

                            Enemy_Health -= DamageDealt;
                            Health -= DamageTaken;

                            System.out.println("\t> You strike the " + enemy + " for " + DamageDealt + " damage. ");
                            System.out.println("\t> You receive " + DamageTaken + " in retaliation!");

                            if (Health < 1) {
                                System.out.println("\t> You have taken too much damage");
                                break label;
                            }
                            break;
                        case "2":
                            if (Numb_Of_Health_Potion > 0) {
                                Health += Health_Potion_Heal_Amount;
                                Numb_Of_Health_Potion--;
                                System.out.println("\t> You drink a Health potion, healing yourself for " + Health_Potion_Heal_Amount + " . "
                                        + "\n\t> You now have " + Health + " HP. "
                                        + "\n\t> You have " + Numb_Of_Health_Potion + "Health potions left.\n");
                            }
                            else {
                                System.out.println("\t> You have no Health potions left! Defeat enemies for a chance to get one!\n");
                            }

                            break;
                        case "3":
                            System.out.println("\tYou ran away from the " + enemy + " !");
                            continue GAME;
                        default:
                            System.out.println("\tInvalid command, Please try again...!");
                            break;
                    }
                }

                if (Health < 1) {
                    System.out.println("You are too weak to go on, weak from battle!");
                    break;
                }

                System.out.println("---------------------------------");
                System.out.println(" # " + enemy + " was defeated #");
                System.out.println(" # You have " + Health + "HP left. #");
                if (random.nextInt(100) > Health_Potion_Drop_Chance) {
                    Numb_Of_Health_Potion++;
                    System.out.println("# the " + enemy + "dropped a potions #");
                    System.out.println(" # you now have " + Numb_Of_Health_Potion + "Health potion(s) .");
                }
                System.out.println("---------------------------------");
                System.out.println("What would you like to do now ");
                System.out.println("1. Continue fighting");
                System.out.println("2. Exit");

                String input = UserInput.nextLine();

                while (!input.equals("1") && !input.equals("2")) {
                    System.out.println("Invalid command, Please try again...!");
                    input = UserInput.nextLine();
                }

                if (input.equals("1")) {
                    System.out.println("You continue on your adventure!");
                } else {
                    System.out.println("You exit successfully from your adventure!");
                    break;
                }
            }
            System.out.println("Thanks for playing....");

            System.out.print("Do you wanna play again [yes/no]: ");
            wants_to_run_the_again = UserInput.nextLine();

            for (int i = 0; i < 6; i++) {
                System.out.println("->");
            }

        } while (wants_to_run_the_again.equalsIgnoreCase("yes"));  //if yes game will run again.

        if (wants_to_run_the_again.equalsIgnoreCase("no")) {  //if no the program will not run again.
            System.out.println("\t> Thanks for Playing again....");
        }
        else {
            System.out.println("\t> You entered an invalid command!!"); //else the program break.
        }
        UserInput.close();
    }
}


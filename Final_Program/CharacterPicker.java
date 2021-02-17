package Final_Program;
import java.util.Random;

public class CharacterPicker {

    String[] Characters_Names = {"Kei", "Rin", "Akane", "Makoto", "Naruto", "Shinobu", "Hiro", "Chiharu"};
    String[] Characters_Type = {"mage", "monk", "warrior", "Knight", "ranger", "soldier", "vanguard"};
    String[] Hair_Color = {"Black", "White", "Blue", "Red", "Pink", "Orange"};
    String[] Eye_Color = {"Black", "White", "Blue", "Red", "Pink", "Orange"};

    public void characterPicker() {
        Random random = new Random();
        Random Counter = new Random();

        System.out.println("----------------------");
        System.out.println("THIS PART OF THE PROGRAM IS JUST FOR FUN IT GENERATE A RANDOM CHARACTER FOR YOU....");
        System.out.println();

        //Character Name
        for (int i = 7; i < Characters_Names.length; i++) {
            int rand = random.nextInt(Characters_Names.length);
            System.out.println("Your Character's Name is " + Characters_Names[rand]);
        }

        //Character Type
        for (int i = 6; i < Characters_Type.length; i++) {
            int rand = random.nextInt(Characters_Type.length);
            System.out.println("Your Character's Type is a " + Characters_Type[rand]);
        }

        // Generating age:
        int age;
        age = 7 + Counter.nextInt(25);
        System.out.println("Your character's age is " + age);


        // Generating height:
        double height;
        height = 5 + Counter.nextInt(4);
        System.out.println("Your Character's height is " + height);


        //Character Eye Color
        for (int i = 5; i < Eye_Color.length; i++) {
            int rand = random.nextInt(Eye_Color.length);
            System.out.println("Your Character's Eye Color is a " + Eye_Color[rand]);
        }

        //Character Hair Color
        for (int i = 5; i < Hair_Color.length; i++) {
            int rand = random.nextInt(Hair_Color.length);
            System.out.println("Your Character's Hair Color is a " + Hair_Color[rand]);
        }

        //Stats
        int Strength;
        Strength = 1 + Counter.nextInt(100);
        System.out.println("Your character's strength is " + Strength + "%");

        //Intelligence
        int Intelligence;
        Intelligence = 70 + Counter.nextInt(350);
        System.out.println("Your character's intelligence is " + Intelligence + "IQ\n");

        System.out.println("The real game begin after this line.");
        System.out.println();

    }
}

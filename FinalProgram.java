package Final_Program;
//Omar
//1/27/21
//Final Project

public class FinalProgram {
    public static void main(String[] args) {

        //Title
        System.out.println("-|-----------|-");
        System.out.println("  # WELCOME #");
        System.out.println("-|-----------|-");
        System.out.println();

        //for User choice
        UserChoice Choice  = new UserChoice();
        Choice.Choice();

        //for randomly picking a character
        CharacterPicker Character_Name = new CharacterPicker();
        Character_Name.characterPicker();

        //for the game adventure
        GameAdventure.Adventure();
    }
}

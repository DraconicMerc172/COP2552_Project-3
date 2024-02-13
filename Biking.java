//Justin Trebour
//COP2552
//Workout Tracker - Biking

import javax.swing.JOptionPane;

public class Biking {
    
    public static void Menu() {

        		//Main Menu to provide User with options
        String optionbm = JOptionPane.showInputDialog(null, 
				String.format(
                "Activity Monitor\n\n" + 
                "Press 1 for Moderate\n" +
                "Press 2 for Vigorous\n" +
                "Press 6 for Main Menu\n\n"));        

        switch (optionbm) {

            case "1":
                Biking_Moderate();
                break;

            case "2":
                Biking_Vigorous();
                break;
            
            case "3":
                Main_Menu.main();
        }
    }

}

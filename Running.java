//Justin Trebour
//COP2552
//Workout Tracker - Running

import javax.swing.JOptionPane;

public class Running {
    
    public static void Menu() {

        		//Main Menu to provide User with options
        String optionbm = JOptionPane.showInputDialog(null, 
				String.format(
                "Activity Monitor\n\n" + 
                "Press 1 for Moderate\n" +
                "Press 2 for Vigorous\n" +
                "Press 3 for Main Menu\n\n"));        

        switch (optionbm) {

            case "1":
                Running_Moderate();
                break;

            case "2":
                Running_Vigorous();
                break;
            
            case "3":
                Main_Menu.menu();

            default:
                System.out.println("Please enter a numerical value between 1 - 3.");
        }
    }

    public static float Running_Moderate() {

        //to do - make calculations for moderate biking

        return float;

    }

    public static float Running_Vigorous () {

        //to do - make calculations for vigorous biking

        return float;

    }
    
}

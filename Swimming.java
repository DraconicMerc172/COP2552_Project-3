//Justin Trebour
//COP2552
//Workout Tracker - Swimming

import javax.swing.JOptionPane;

public class Swimming {
    
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
                Swimming_Moderate();
                break;

            case "2":
                Swimming_Vigorous();
                break;
            
            case "3":
                Main_Menu.menu();

            default:
                System.out.println("Please enter a numerical value between 1 - 3.");
        }
    }

    public static float Swimming_Moderate() {

        //to do - make calculations for moderate biking

        return float;

    }

    public static float Swimming_Vigorous () {

        //to do - make calculations for vigorous biking

        return float;

    }

}

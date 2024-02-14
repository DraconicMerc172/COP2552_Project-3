//Justin Trebour
//COP2552
//Workout Tracker - Walking

import javax.swing.JOptionPane;

public class Walking {
    
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
                WalkingMod();
                break;

            case "2":
                WalkingVig();
                break;
            
            case "3":
                MainMenu.menu();

            default:
                System.out.println("Please enter a numerical value between 1 - 3.");
        }
    }

    public static double WalkingMod() {

        //to do - make calculations for moderate biking

        int w_mod = 10;
        
        String optionwalkmod = JOptionPane.showInputDialog(null, 
				String.format(
                "Total Calories\n\n" + 
                "How many minutes did you bike?\n"));        

        int minuteswalkmod = Integer.valueOf(optionwalkmod);

        double totalcalmodwalk = minuteswalkmod * w_mod;

        return totalcalmodwalk;

    }

    public static double WalkingVig () {

        //to do - make calculations for vigorous biking

        double w_vig = 14.3;

        String optionwalkvig = JOptionPane.showInputDialog(null, 
        String.format(
        "Total Calories\n\n" + 
        "How many minutes did you bike?\n"));   
        
        int minuteswalkvig = Integer.valueOf(optionwalkvig);

        double totalcalvigwalk = minuteswalkvig * w_vig;

        return totalcalvigwalk;

    }
    
    public static double TotalCalWalk (double totalcalmodwalk, double totalcalvigwalk) {

        double totalcalwalk = totalcalmodwalk + totalcalvigwalk;
        
        return totalcalwalk;

    }

    public static double TotalMinsWalk (double minuteswalkmod, double minuteswalkvig) {

        double totalminswalk = minuteswalkmod + minuteswalkvig;

        return totalminswalk;
    }


}

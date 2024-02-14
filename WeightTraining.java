//Justin Trebour
//COP2552
//Workout Tracker - Weight Training

import javax.swing.JOptionPane;

public class WeightTraining {
    
    public static void Menu () {

        		//Main Menu to provide User with options
        String optionbm = JOptionPane.showInputDialog(null, 
				String.format(
                "Activity Monitor\n\n" + 
                "Press 1 for Moderate\n" +
                "Press 2 for Vigorous\n" +
                "Press 3 for Main Menu\n\n"));        

        switch (optionbm) {

            case "1":
                WeightMod();
                break;

            case "2":
                WeightVig();
                break;
            
            case "3":
                MainMenu.menu();

            default:
                System.out.println("Please enter a numerical value between 1 - 3.");
        }
    }

    public static double WeightMod () {

        //to do - make calculations for moderate biking

        double we_mod = 3.7;
        
        String optionweimod = JOptionPane.showInputDialog(null, 
				String.format(
                "Total Calories\n\n" + 
                "How many minutes did you bike?\n"));        

        int minutesweimod = Integer.valueOf(optionweimod);

        double totalcalmodwei = minutesweimod * we_mod;

        return totalcalmodwei;

    }

    public static double WeightVig () {

        //to do - make calculations for vigorous biking

        double we_vig = 5.9;

        String optionweivig = JOptionPane.showInputDialog(null, 
        String.format(
        "Total Calories\n\n" + 
        "How many minutes did you bike?\n"));   
        
        int minutesweivig = Integer.valueOf(optionweivig);

        double totalcalvigwei = minutesweivig * we_vig;

        return totalcalvigwei;

    }
    public static double TotalCalWei (double totalcalmodwei, double totalcalvigwei) {

        double totalcalwei = totalcalmodwei + totalcalvigwei;
        
        return totalcalwei;

    }

    public static double TotalMinsWei (double minutesweimod, double minutesweivig) {

        double totalminswei = minutesweimod + minutesweivig;

        return totalminswei;
    }


}

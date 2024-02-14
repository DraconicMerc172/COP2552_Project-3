//Justin Trebour
//COP2552
//Workout Tracker - Biking

import javax.swing.JOptionPane;

public class Biking {
    
    public static void Menu() {

        		//Main Menu to provide User with options
        String optionbm = JOptionPane.showInputDialog(null, 
				String.format(
                "Your Workout Intensity\n\n" + 
                "Press 1 for Moderate\n" +
                "Press 2 for Vigorous\n" +
                "Press 3 for Main Menu\n\n"));        

        switch (optionbm) {

            case "1":
                Biking_Moderate();
                break;

            case "2":
                Biking_Vigorous();
                break;
            
            case "3":
                Main_Menu.menu();

            default:
                System.out.println("Please enter a numerical value between 1 - 3.");
        }
    }

    public static double Biking_Moderate() {

        //to do - make calculations for moderate biking

        int b_mod = 10;
        
        String optionbikmod = JOptionPane.showInputDialog(null, 
				String.format(
                "Total Calories\n\n" + 
                "How many minutes did you bike?\n"));        

        int minutesbik = Integer.valueOf(optionbikmod);

        double totalcalmodbike = minutesbik * b_mod;

        return totalcalmodbike;

    }

    public static double Biking_Vigorous () {

        //to do - make calculations for vigorous biking

        double b_vig = 14.3;

        String optionbikvig = JOptionPane.showInputDialog(null, 
        String.format(
        "Total Calories\n\n" + 
        "How many minutes did you bike?\n"));   
        
        int minutesvig = Integer.valueOf(optionbikvig);

        double totalcalvigbike = minutesvig * b_vig;

        return totalcalvigbike;

    }

}

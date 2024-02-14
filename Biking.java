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
                BikingMod();
                break;

            case "2":
                BikingVig();
                break;
            
            case "3":
                MainMenu.menu();

            default:
                System.out.println("Please enter a numerical value between 1 - 3.");
        }
    }

    public static double BikingMod() {

        //to do - make calculations for moderate biking

        int b_mod = 10;
        
        String optionbikmod = JOptionPane.showInputDialog(null, 
				String.format(
                "Total Calories\n\n" + 
                "How many minutes did you bike?\n"));        

        int minutesbikmod = Integer.valueOf(optionbikmod);

        double totalcalmodbike = minutesbikmod * b_mod;

        return totalcalmodbike;

    }

    public static double BikingVig () {

        //to do - make calculations for vigorous biking

        double b_vig = 14.3;

        String optionbikvig = JOptionPane.showInputDialog(null, 
        String.format(
        "Total Calories\n\n" + 
        "How many minutes did you bike?\n"));   
        
        int minutesbikvig = Integer.valueOf(optionbikvig);

        double totalcalvigbike = minutesbikvig * b_vig;

        return totalcalvigbike;

    }

    public static double TotalCalBik(double totalcalmodbike, double totalcalvigbike) {

        double totalcalbik = totalcalmodbike + totalcalvigbike;
        
        return totalcalbik;

    }

    public static double TotalMinsBik (double minutesbikmod, double minutesbikvig) {

        double totalminsbik = minutesbikmod + minutesbikvig;

        return totalminsbik;

    }

}

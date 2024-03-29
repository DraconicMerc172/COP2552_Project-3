//Justin Trebour
//COP2552
//Workout Tracker - Running

import javax.swing.JOptionPane;

public class Running {
    
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
                RunningMod();
                break;

            case "2":
                RunningVig();
                break;
            
            case "3":
                MainMenu.menu();

            default:
                System.out.println("Please enter a numerical value between 1 - 3.");
        }
    }

    public static double RunningMod() {

        //to do - make calculations for moderate biking

        double r_mod = 12;
        
        String optionrunmod = JOptionPane.showInputDialog(null, 
				String.format(
                "Total Calories\n\n" + 
                "How many minutes did you bike?\n"));        

        int minutesrunbik = Integer.valueOf(optionrunmod);

        double totalcalmodrun = minutesrunbik * r_mod;

        return totalcalmodrun;

    }

    public static double RunningVig () {

        //to do - make calculations for vigorous biking

        double r_vig = 17;

        String optionrunvig = JOptionPane.showInputDialog(null, 
        String.format(
        "Total Calories\n\n" + 
        "How many minutes did you bike?\n"));   
        
        int minutesrunvig = Integer.valueOf(optionrunvig);

        double totalcalvigbike = minutesrunvig * r_vig;

        return totalcalvigbike;

    }

    public static double TotalCalRun (double totalcalmodrun, double totalcalvigrun) {

        double totalcalrun = totalcalmodrun + totalcalvigrun;
        
        return totalcalrun;

    }

    public static double TotalMinsRun (double minutesrunmod, double minutesrunvig) {

        double totalminsrun = minutesrunmod + minutesrunvig;

        return totalminsrun;

    }

    
}

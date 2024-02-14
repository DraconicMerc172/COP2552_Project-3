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
                SwimmingMod();
                break;

            case "2":
                SwimmingVig();
                break;
            
            case "3":
                MainMenu.menu();

            default:
                System.out.println("Please enter a numerical value between 1 - 3.");
        }
    }

    public static double SwimmingMod() {

        //to do - make calculations for moderate biking

        double s_mod = 6.8;
        
        String optionswimmod = JOptionPane.showInputDialog(null, 
				String.format(
                "Total Calories\n\n" + 
                "How many minutes did you bike?\n"));        

        int minutesswimmod = Integer.valueOf(optionswimmod);

        double totalcalmodswim = minutesswimmod * s_mod;

        return totalcalmodswim;

    }

    public static double SwimmingVig () {

        //to do - make calculations for vigorous biking

        double s_vig = 14.8;

        String optionswimvig = JOptionPane.showInputDialog(null, 
        String.format(
        "Total Calories\n\n" + 
        "How many minutes did you bike?\n"));   
        
        int minutesswimvig = Integer.valueOf(optionswimvig);

        double totalcalvigswim = minutesswimvig * s_vig;

        return totalcalvigswim;

    }

    public static double TotalCalSwi (double totalcalmodswim, double totalcalvigswim) {

        double totalcalswim = totalcalmodswim + totalcalvigswim;
        
        return totalcalswim;

    }

    public static double TotalMinsSwi (double minutesswimmod, double minutesswimvig) {

        double totalminsswim = minutesswimmod + minutesswimvig;

        return totalminsswim;
    }

}

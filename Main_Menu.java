//Justin Trebour
//COP2552
//Workout Tracker - Main Menu

import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main_Menu {
    
    public static void main(String[] args) {

		//Main Menu to provide User with options
        String option = JOptionPane.showInputDialog(null, 
				String.format(
                "Activity Monitor\n\n" + 
                "Press 1 for Bicycle\n" +
                "Press 2 for Running/Jogging\n" +
                "Press 3 for Swimming\n" +
                "Press 4 for Walking\n" +
                "Press 5 for Weight Training\n" +
                "Press 6 for Exit\n\n"));        
        
        //Switch statement to call different classes
        switch (option) {

            case "1":
                Biking.Menu();
                break;
            
            case "2":
                Running.Menu();
                break;
            
            case "3":
                Swimming.Menu();
                break;
            
            case "4":
                Walking.Menu();
                break;
            
            case "5":
                Weight_Training.Menu();
                break;
            
            case "6":
                Exit.Menu();
                break;

            default:
                System.out.println("Please enter a numeric value between 1 - 6.");
        }
    }

}

package mvcexample;

/**
 *
 * @author savi
 * Changes to the controller contrustor parameters (X + Y location and the frame title of each instance)
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model,"Controller 1", 40, 140); // Create first controller
        Controller2 c2 = new Controller2(model,"Controller 2",40,180); // Create second controller
        Controller2 c4 = new Controller2(model,"Controller 3",40,320); // Create third controller
        Controller2 c5 = new Controller2(model,"Controller 4",40 ,460); // Create fourth controller
        Controller2 c6 = new Controller2(model,"Controller 5",40,600); // Create fifth controller
        
    } // main
  
} // Main

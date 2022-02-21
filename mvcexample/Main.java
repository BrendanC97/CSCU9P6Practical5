package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model); // Create first controller
        Controller2 c2 = new Controller2(model,40,200); // Create second controller

        Controller2 c4 = new Controller2(model,200,550); // Create third controller
        Controller2 c5 = new Controller2(model,500 ,480); // Create fourth controller
        Controller2 c6 = new Controller2(model,100,400); // Create fifth controller
        
    } // main
  
} // Main

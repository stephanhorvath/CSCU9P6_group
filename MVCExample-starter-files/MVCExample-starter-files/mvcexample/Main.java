package mvcexample;

/**
 *
 * @author savi
 */
// Launcher for application

public class Main {
   
    public static void main(String args[]) {
     
        Model model = new Model();               // Create shared database
        Controller1 c1 = new Controller1(model, "Controller 1"); // Create first controller      

        // Create instances of second controller
        Controller2 c2 = new Controller2(model, "Controller 2A");
        Controller2 c3 = new Controller2(model, "Controller 2B");
        Controller2 c4 = new Controller2(model, "Controller 2C");
        Controller2 c5 = new Controller2(model, "Controller 2D");
    } // main
  
} // Main

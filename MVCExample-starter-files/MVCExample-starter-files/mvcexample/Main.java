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

        // Create instances of second controller
        Controller2 c2 = new Controller2(model);
        Controller2 c3 = new Controller2(model);
        Controller2 c4 = new Controller2(model);
        Controller2 c5 = new Controller2(model);

    } // main
  
} // Main

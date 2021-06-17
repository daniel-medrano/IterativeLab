//Student: Daniel Medrano
package uh.ac.cr;

public class Main {

    public static void main(String[] args) {
        //An instance of the class IterativeControl is created
        IterativeControl loops = new IterativeControl();
        //If the user inserts 4, the program will end
        while (loops.getOption() != 4) {
            //The user selects the loop to be used
            loops.selectLoop();
            //The value is asked and how many times it should be printed
            loops.askUser();
            //According to what has been selected, the switch will run a method.
            switch (loops.getOption()) {
                case 1:
                    loops.forStructure();
                    break;
                case 2:
                    loops.whileStructure();
                    break;
                case 3:
                    loops.doWhileStructure();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("\n" + "ERROR: Not in the range of options" + "\n");
                    break;
            }
        }
    }
}

/*
INSTRUCTIONS:
Create a new class and call it IterativeControl.
Do the next operation on the new class created.

1. Ask user how many time he wants to print hello world on screen.
    1.1- Print Hello world as many times as user defined. Use a while structure.
    1.2- Print Hello world as many times as user defined. Use a for structure.
2. Print hello world and ask the user if he wants to print hello again using a Do while structure.
3. Ask the user if he wants to print hello using a while structure to keep printing until user wants to stop.

Do all the code needed for the previous items on the class created. Use main just to call the methods.
*/

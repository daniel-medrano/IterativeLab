package uh.ac.cr;
import java.util.Scanner;

public class IterativeControl {
    Scanner scanner = new Scanner(System.in);
    private int times;
    private String text;
    int option = 0;
    //It displays the options and saves the answer
    public void selectLoop() {
        try {
            System.out.println("""
                    Enter the loop you would like to use:\s
                    1: For
                    2: While
                    3: Do while
                    4: Exit
                    Enter answer:""");
            option = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("\nERROR: Not a number!\n");
        }
    }
    //It is to get the option selected in the method selectLoop()
    public int getOption() {
        return option;
    }
    //It asks the user the string and the amount of times to print it
    public void askUser() {
        try {
            if (option >= 1 && option < 4) {
                System.out.println("Enter what you would like to print: ");
                text = scanner.nextLine();

                System.out.println("How many times would you like to print it: ");
                times = Integer.parseInt(scanner.nextLine());

                System.out.println();
            }
        } catch (NumberFormatException e) {
            System.out.println("\nERROR: Not a number!\n");
        }
    }
    //Methods to print the string
    //For structure
    public void forStructure() {
        for (int i = 0; i < times; i++) {
            System.out.println(i + 1 + ": " + text);
        }
        times = 0;
    }
    //While structure
    public void whileStructure() {
        int counter = 0;
        while (counter < times) {
            System.out.println(counter + 1 + ": " + text);
            counter++;
        }
        times = 0;
    }
    //Do while structure
    public void doWhileStructure() {
        int counter = 0;
        do {
            System.out.println(counter + 1 + ": " + text);
            counter++;
        } while (counter < times);
        times = 0;
    }
}

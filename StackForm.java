/*
* This program uses the MrCoxallStack class.
*
* @author  Jay Lee
* @version 1.3
* @since   2020-05-21
*/
// package ca.mths.unit2.unit04.java.stackForm;

import java.util.Scanner;

public final class StackForm {
    private StackForm() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * This method gets some string input and shows the stack.
    * @param args
    */
    public static void main(final String[] args) {
        Scanner myObj = new Scanner(System.in);
        MrCoxallStack aStack = new MrCoxallStack();

        while (true) {
            String toPop;
            System.out.print("Enter the number to push on the stack: ");
            String inputString = myObj.nextLine();
            if (inputString.toUpperCase().equals("END")) {
                break;
            } else if (inputString.toUpperCase().equals("CLEAR")) {
                aStack.clear();
                System.out.println("\nThe stack is cleared.");
            } else {
                aStack.push(inputString);
            }
            do {
                if (aStack.peek() == null) {
                    System.out.println("\nThe Stack is empty.");
                    break;
                }
                System.out.print("\nDo you want to pop (the top element : "
                                 + aStack.peek() + ")? ");
                toPop = myObj.nextLine().toUpperCase();
                if (toPop.equals("Y") || toPop.equals("YES")) {
                    System.out.println("\nThe top element : " + aStack.pop()
                                       + " is popped.");
                }
            } while (toPop.equals("Y") || toPop.equals("YES"));
            System.out.println("");
        }
        System.out.println("\nStack:");
        aStack.showStack();

        System.out.println("\nDone.");
    }
}

/*
* This class creates an integer stack.
*
* @author  Jay Lee
* @version 1.3
* @since   2020-05-21
*/
// package ca.mths.unit2.unit04.java.mrCoxallStack;

import java.util.Stack;

public final class MrCoxallStack {
    // private MrCoxallStack() {
    //     // Prevent instantiation
    //     // Optional: throw an exception e.g. AssertionError
    //     // if this ever *is* called
    //     throw new IllegalStateException("Cannot be instantiated");
    // }

    /** create the stack as an ArrayList (array that grows as I need it!). */
    private static Stack<Integer> stack = new Stack<Integer>();

    /**
    * This method push an integer to the stack.
    * @param pushInput
    */
    public void push(final String pushInput) {
        try {
            int pushNumber = Integer.parseInt(pushInput);
            this.stack.push(pushNumber);
        } catch (Exception ex) {
            System.out.println("\nInvalid input.");
        }
    }

    /**
    * This method returns the last integer in the stack.
    * @return lastIntegerOfStack
    */
    public Integer peek() {
        if (this.stack.size() < 1) {
           return null;
        }
        return this.stack.get(this.stack.size() - 1);
    }

    /**
    * This method pops the top integer from the stack.
    * @return lastIntegerOfStack
    */
    public Integer pop() {
        if (this.stack.size() < 1) {
            return null;
        }
        int element = this.peek();
        this.stack.remove(this.stack.size() - 1);
        return element;
    }

    /**
    * This method clears the stack.
    */
    public void clear() {
        for (int counter = this.stack.size(); counter > 0; counter--) {
            this.stack.remove(counter - 1);
        }
    }

    /**
    * This method prints out the list of items in the stack.
    */
    public void showStack() {
        System.out.print("\n");
        for (int index = 0; index < this.stack.size(); index++) {
            System.out.println(this.stack.get(index));
        }
        System.out.println("\n");
    }
}

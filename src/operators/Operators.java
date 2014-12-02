/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author diegocantu
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        incrementAndModulus();
        compoundAssignemntTest();
        toggleValueTest();
    }

    private static void incrementAndModulus() {
        int i = 10;
        int n = i++ % 5;
        System.out.println("n = " + n);
        System.out.println("i = " + i);
        // post increment changes after the line of code

        i = 10;
        int m = ++i % 5;
        System.out.println("m = " + m);
        System.out.println("i = " + i);
        // pre-increment changes before the line of code
    }

    private static void compoundAssignemntTest() {
        int result = 1 + 2; // result is now 3
        System.out.println(result);

//          result = result - 1; // result is now 2
        result -= 1;
        System.out.println(result);

//          result = result * 2; // result is now 4
        result *= 2;
        System.out.println(result);

//          result = result / 2; // result is now 2
        result /= 2;
        System.out.println(result);

//          result = result + 8; // result is now 10
        result += 8;
        System.out.println(result);

//          result = result % 7; // result is now 3
        result %= 7;
        System.out.println(result);

    }

    public static boolean toggleValue(boolean myValue) {
        return !myValue;
    }

    public static void toggleValueTest() {

          //write your code here
        //declare a boolean variable called "bValue", and assign the value "false" to it
        boolean bValue = false;
        //print out the value of "bValue"
        System.out.println("bValue = " + bValue);
        //call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue" 
        bValue = toggleValue(bValue);
        //print out the value of "bValue" (note: this should now be "true")
        System.out.println("bValue = " + bValue);
        //again call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue" 
        bValue = toggleValue(bValue);
        //print out the value of "bValue" (note: this should now be "false")
        System.out.println("bValue = " + bValue);
    }

}

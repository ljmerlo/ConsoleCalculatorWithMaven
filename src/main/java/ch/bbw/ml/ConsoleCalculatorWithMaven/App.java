package ch.bbw.ml.ConsoleCalculatorWithMaven;

import java.util.Scanner;

/**
 * App
 * @author Lenny
 * @version 3.0.1
 */

public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner = new Scanner(System.in);
    	
        Calculator calculator = new Calculator();
        String what;
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("=======================================================");
        System.out.println();
        
        System.out.println("What would you like to do?");
        System.out.println();
        
        System.out.println("plus");
        System.out.println("minus");
        System.out.println("times");
        System.out.println("through");
        System.out.println();
        
        System.out.print("please enter the whole word: ");
        what = scanner.nextLine().toLowerCase();
        
        System.out.println();
        System.out.println("=======================================================");
        
        System.out.println();
        System.out.print("Please enter the first value: ");
        valueA = scanner.nextInt();
        
        System.out.print("Please enter the second value: ");
        valueB = scanner.nextInt();
        
        System.out.println();
        System.out.println("=======================================================");
        System.out.println();
        
        if(what.equals("plus")) {
            System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.addition(valueA, valueB));
        }
        
        else if(what.equals("minus")) {
        	System.out.println("Differenz " + valueA + " - " + valueB + " = " + calculator.subtraction(valueA, valueB));
        }
        
        else if(what.equals("times")) {
        	System.out.println("Quotient " + valueA + " / " + valueB + " = " + calculator.division(valueA, valueB));
        }
        
        else if(what.equals("through")) {
        	System.out.println("Product " + valueA + " * " + valueB + " = " + calculator.multiplicationTesting(valueA, valueB));
        }
        
        else {
        	System.out.println("I didn't understand you. There is no " + what + ". The System will now exit.");
        	System.exit(0);
        }
    }
}
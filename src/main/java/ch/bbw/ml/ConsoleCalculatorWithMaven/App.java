package ch.bbw.ml.ConsoleCalculatorWithMaven;

/**
 * App
 * @author Lenny
 * @version 0.0.1
 */

public class App 
{
    public static void main( String[] args )
    {
        Calculator calculator = new Calculator();
        int valueA = 0;
        int valueB = 0;

        System.out.println("Console Calculator");
        System.out.println("==================");
        System.out.println();

        valueA = 50;
        valueB = 10;
        System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.addition(valueA, valueB));
        System.out.println("Differenz " + valueA + " - " + valueB + " = " + calculator.subtraction(valueA, valueB));
        System.out.println("Quotient " + valueA + " / " + valueB + " = " + calculator.division(valueA, valueB));
    }
}
package spe.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Scanner;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("Starting calculator");
        Scanner reader = new Scanner(System.in);
        int operation, flag = 0;
        double num1, num2, exp;
        int num_;

        do{
            System.out.println("------------Calculator------------");
            System.out.println("Please choose an operation:");
            System.out.println("");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("");
            System.out.print("Your choice: ");
            operation = reader.nextInt();
            System.out.println("");
            if(operation == 5) flag = 1;
            else{
                switch (operation) {
                    case 1: //Addition
                        System.out.println("---Addition---");
                        System.out.print("");
                        System.out.print("Enter the first number: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter the second number: ");
                        num2 = reader.nextDouble();
                        addition(num1, num2);
                        break;
                    
                    case 2: //Subtraction
                        System.out.println("---Subtraction---");
                        System.out.print("");
                        System.out.print("Enter the first number: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter the second number: ");
                        num2 = reader.nextDouble();
                        System.out.println("");
                        subtraction(num1, num2);
                        break;
                    
                    case 3: //Multiplication
                        System.out.println("---Multiplication---");
                        System.out.print("");
                        System.out.print("Enter the first number: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter the second number: ");
                        num2 = reader.nextDouble();
                        System.out.println("");
                        multiplication(num1, num2);
                        break;

                    case 4: //Division
                        System.out.println("---Division---");
                        System.out.print("");
                        System.out.print("Enter the first number: ");
                        num1 = reader.nextDouble();
                        System.out.print("Enter the second number: ");
                        num2 = reader.nextDouble();
                        System.out.println("");
                        division(num1, num2);
                        break;
                    
                    default:
                        System.out.println("Exited due to invalid operation!");
                        flag = 1;
                        break;
                }
            }
        }while(flag==0);
        reader.close();
    }

    public static double addition(double num1, double num2){
        double result = num1 + num2;
        System.out.println("");
        System.out.println("Result: " + result);
        System.out.println("");
        logger.info("Executing addition function.");
        return result;
    }

    public static double subtraction(double num1, double num2){
        double result = num1 - num2;
        System.out.println("");
        System.out.println("Result: " + result);
        System.out.println("");
        logger.info("Executing subtractionn function.");
        return result;
    }

    public static double multiplication(double num1, double num2){
        double result = num1 * num2;
        System.out.println("");
        System.out.println("Result: " + result);
        System.out.println("");
        logger.info("Executing multiplication function.");
        return result;
    }

    public static double division(double num1, double num2){
        if (num2 == 0) {
            System.out.println("");
            System.out.println("Result: Undefined. Cannot divide by zero!");
            System.out.println("");
            logger.info("Executing division function.");
            return Double.POSITIVE_INFINITY;
        }
        double result = num1 / num2;
        System.out.println("");
        System.out.println("Result: " + result);
        System.out.println("");
        logger.info("Executing division function.");
        return result;
    }
}

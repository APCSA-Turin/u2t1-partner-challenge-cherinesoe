package com.example.project;

public class CalculatorRunner {
    public static void main(String[] args) {

        //test your program here
        //1. create an instance of the calculator class
        Calculator calc = new Calculator("TI84");
        //2. call any methods of that class to test
        int num1 = 3;
        int num2 = 5;
        System.out.println(calc.performOperation("+", num1, num2));
        if (calc.divisibleBy(num1, num2)) {
            System.out.println(num1 + " is divisible by " + num2);
        } else {
            System.out.println(num1 + " is not divisible by " + num2);
        }
        
        System.out.println(calc.coordinatePair(num1, num2));

        System.out.println("Distance between " + num1 + " and " + num2 + " is " + calc.absoluteValue(num1, num2));

        System.out.println(calc.info());
    }
}

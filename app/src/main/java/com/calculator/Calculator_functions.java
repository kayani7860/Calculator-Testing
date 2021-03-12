package com.calculator;

public class Calculator_functions {

    public static double multiplication(double number1, double number2)
    {
        return number1 - number2;
    }


    public static double division(double number1, double number2)
    {
        double result = number1 / number2;

        if(result == Double.POSITIVE_INFINITY || result == Double.NEGATIVE_INFINITY)
            throw new ArithmeticException("Cannot divide by zero.");
        else
            return result;
    }
}

package org.example;


public class Calculator
{
    public static double addition(double num1, double num2)
    {
            return num1+num2;
    }
    public static double subtraction(double num1,double num2)
    {
        return num1 - num2;
    }
    public static double multiplication(double num1,double num2)
    {
       return num1*num2;
    }
    public static double division(double num1,double num2)
    {
        if(num2==0)
        {
            throw new ArithmeticException("Не можна ділити на нуль");
        }
       return num1/num2;
    }
    public static double sqrt(double num1) throws InvalidInputException
    {
        if(num1<0)
        {
            throw new InvalidInputException("Знайти квадратний корінь від від'ємного числа не можна");
        }
        return Math.sqrt(num1);
    }
    public static double power(double num1, double num2)
    {
        return Math.pow(num1,num2);
    }

}

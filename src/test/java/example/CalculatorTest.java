package example;

import org.example.Calculator;
import org.example.InvalidInputException;
import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    Scanner sc = new Scanner(System.in);
    @Test
    public void testAddition()
    {
        assertEquals(2, Calculator.addition(1,1));
    }
    @Test
    public void testSubtraction()
    {
        assertEquals(2, Calculator.subtraction(3,1));
        assertEquals(2, Calculator.subtraction(1,-1));
    }
    @Test
    public void testMultiplication()
    {
        assertEquals(45, Calculator.multiplication(4.5,10));
    }
    @Test
    public void testDivision()
    {
        assertEquals(2.5, Calculator.division(5,2));
    }
    @Test
    public void testPower()
    {
        assertEquals(81, Calculator.power(3,4));
    }
    @Test
    public void testSqrtNegative()
    {
        try {
            assertEquals(11, Calculator.sqrt(-121));
        } catch (InvalidInputException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    public void testSqrt()
    {
        try {
            assertEquals(11, Calculator.sqrt(121));
        }catch (InvalidInputException e) {
            throw new RuntimeException(e);
        }
    }


}

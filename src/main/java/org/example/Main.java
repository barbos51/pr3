package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {

            System.out.print("Оберіть операцію:\n" +
                    "1 - додавання\n" +
                    "2 - віднімання\n" +
                    "3 - множення\n" +
                    "4 - ділення\n" +
                    "5 - квадратний корінь\n" +
                    "6 - піднесення до степення (друге число - степінь)\n" +
                    "0 - вихід з програми\n");



            try{
                int input = sc.nextInt();
                if(input == 0)
                {
                    System.out.println("Дякуємо за використання калькулятора");
                    break;
                }

                System.out.println("Напишіть перше число");
                double num1 = sc.nextDouble();



                double num2 = 0;
                if (input != 5) {
                    System.out.println("Напишіть друге число");
                    num2 = sc.nextDouble();

                }
                switch(input) {
                    case 1: {
                        System.out.println("Результат: " + Calculator.addition(num1, num2));
                        break;
                    }
                    case 2: {
                        System.out.println("Результат: " + Calculator.subtraction(num1, num2));
                        break;
                    }
                    case 3: {
                        System.out.println("Результат: " + Calculator.multiplication(num1, num2));
                        break;
                    }
                    case 4: {
                        System.out.println("Результат: " + Calculator.division(num1, num2));
                        break;
                    }
                    case 5: {
                        System.out.println("Результат: " + Calculator.sqrt(num1));
                        break;
                    }
                    case 6: {
                        System.out.println("Результат: " + Calculator.power(num1, num2));
                        break;
                    }
                }
            }catch (InputMismatchException e) {
                System.out.println("Некоректне введення! Потрібно вводити число");
                sc.nextLine();
            }catch (InvalidInputException e) {
                System.out.println("Некоректне введення! "+ e.getMessage());
            }
            catch (ArithmeticException e) {
                System.out.println("Некоректне введення! " + e.getMessage());
            }catch (Exception e) {
                System.out.println("Помилка: " + e.getMessage());
            }
            finally {
                System.out.println("Обробка дії завершена");
            }

        }

    }
}
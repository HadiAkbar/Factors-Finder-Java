/*********************************************************
 *  A simple java program which finds the factors of
 *  any positive integer between 1 and 9223372036854775807
 *
 *  Input : User inputs a number within the given range
 *  Output: Prints the factors of the number to the screen
 *
 *  Author : Hadi Akbar
 *  Date   : 14/April/2024
 **********************************************************/
import java.util.Scanner;
public class FactorsFinder
{
    public static void main(String[] args)
    {

        System.out.println("******************************************************************************************************");
        System.out.println("* Factors Finder                                                                                     *");
        System.out.println("* Enter a positive integer between 1 and 9223372036854775807 to see its factors                      *");
        System.out.println("* Programmed by Hadi Akbar                                                                           *");
        System.out.println("******************************************************************************************************");
        System.out.print("\n");

        do
        {
            Scanner input = new Scanner(System.in);
            System.out.format("Enter the number you want to find factors of => ");

            try
            {
                long number = input.nextLong();
                if (number < 0)
                {
                    throw new Exception();
                }
                else
                {
                    System.out.format("The factors of " + number + " are => ");
                    factor(number);
                    System.out.println("\n");
                }
            }
            catch (Exception wrongInput)
            {
                System.out.format("Invalid input! This program only accepts a positive integer from 1 to 9223372036854775807");
                System.out.println("\n");
            }
        }while (true);
    }

    //method for factoring the number
    public static void factor(long number)
    {
        for (long i = 1; i <= number; i++)
        {
            if (number % i == 0)
            {
                System.out.format("%d ", i);
            }
        }
    }
}
package eolymp.homeworkConditionsLoops;

import java.util.Scanner;
public class MaximumAmongFourNumbers{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int number3 = sc.nextInt();
        int number4 = sc.nextInt();
        if(number1 > number2)
        {
            if(number1 > number3)
            {
                if(number1 > number4)
                {
                    System.out.println(number1);
                }
                else
                {
                    System.out.println( number4);
                }
            }
        }
        else if(number2 > number3)
        {
            if(number2 > number4)
            {
                System.out.println( number2);
            }
            else
            {
                System.out.println(number4);
            }
        }
        else if(number3 > number4)
        {
            System.out.println(number3);
        }
        else
        {
            System.out.println(number4);
        }
    }
}
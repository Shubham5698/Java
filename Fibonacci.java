package com.Day1;

import java.util.Scanner;

public class Fibonacci {
    public static int fibonnaci(int count)
    {
        if (count<=1)
        {
            return count;
        }
        return fibonnaci(count-1)+fibonnaci(count-2);
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter no for Fibonacci: ");
        int seq= scan.nextInt();
        //System.out.println(seq);
        for(int i=0;i<seq;i++)
        {
            System.out.print(fibonnaci(i)+" ");
        }
    }
}

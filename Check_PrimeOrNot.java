package com.Day1;

import java.util.Scanner;

public class Check_PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int num=scan.nextInt();
        int count=0;
        for(int i=1;i<=num;i++)
        {
            if(num%i==0)
                count++;
        }
        if(count==2)
            System.out.println("Prime No");
        else
            System.out.println("Not Prime");

    }
}

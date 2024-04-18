package com.Day1;

import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a integer value: ");
        int num= scan.nextInt();

        int sum1=0;
        int sum2=0;

        for(int i=0;i<=num;i++)
        {
            if(i%2==0)
                sum1=sum1+i;
            else
                sum2=sum2+i;
        }
        System.out.println("Even No Sum: "+sum1);
        System.out.println("Odd No Sum: "+sum2);
    }

}

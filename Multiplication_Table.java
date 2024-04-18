package com.Day1;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number <10:");
        int num= scan.nextInt();
        for(int i=0;i<=num;i++)
        {

                System.out.println(num+" * "+i+" = "+(num*i));

        }
    }
}

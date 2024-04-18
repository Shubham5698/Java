package com.Day1;

import java.util.Scanner;

public class Min_No {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter  5  Nos: ");
        int min= scan.nextInt();

        for(int i=1;i<5;i++)
        {
            int num= scan.nextInt();
            if(num<min)
            {
                min=num;
            }
        }
        System.out.println("Min No:"+min);
    }
}

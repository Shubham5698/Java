package com.Day1;

import java.util.Scanner;

public class Max_No {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter  5  Nos: ");
        int max= scan.nextInt();

        for(int i=1;i<5;i++)
        {
            int num= scan.nextInt();
            if(num>max)
            {
                max=num;
            }
        }
        System.out.println("Max No:"+max);
    }
}

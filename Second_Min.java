package com.Day1;

import java.util.Scanner;

public class Second_Min {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter  5  Nos: ");
        int min= scan.nextInt();
        int min2=scan.nextInt();
        if(min2<min)
        {
            int tmp=min;
            min=min2;
            min2=tmp;
        }

        for(int i=0;i<3;i++)
        {
            int num= scan.nextInt();
            if(num<min)
            {
                min2=min;
                min=num;
            }
            else if(num<min2 && num!=min) {
                  min2=num;
            }
        }
        System.out.println("Second Min No:"+min2);
    }
}

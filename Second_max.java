package com.Day1;

import java.util.Scanner;

public class Second_max {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter  5  Nos: ");
        int max= scan.nextInt();
        int max2=scan.nextInt();
        if(max2>max)
        {
            int tmp=max;
            max=max2;
            max2=tmp;
        }

        for(int i=0;i<3;i++)
        {
            int num= scan.nextInt();
            if(num>max)
            {
              max2=max;
              max=num;
            }
//            else if(num>max && num!=max) {
//                  max2=num;
//            }
        }
        System.out.println("Second Max No:"+max2);
    }
}

package com.Day1;

import java.util.Scanner;

public class GCD_HCF {
    public static int greatestDigit(int a, int b) {
        while (b != 0) {
            int tmp = b;
            b = a % b;
            a = tmp;
        }
        return a;
    }
//     public static int highestCommonDigit(int a,int b)
//     {
//         int hcf=1;
//         for(int i=1;i<=a && i<=b;i++)
//         {
//             if( a %i==0 && b%i ==0)
//             {
//                 hcf=i;
//             }
//         }
//         return hcf;
//     }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter 1st no: ");
        int num1= scan.nextInt();
        System.out.println("Enter 2nd no:");
        int num2=scan.nextInt();

        int greatest=greatestDigit(num1,num2);
        System.out.println("GCD or HCF: "+greatest);

//        int highest=highestCommonDigit(num1, num2);
//        System.out.println("Highest Common Factor:"+highest);
    }
}

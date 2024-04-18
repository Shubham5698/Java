package com.Day1;

import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a number");
        int num=scan.nextInt();
        System.out.println("Prime nos. "+num);
        for(int i=2;i<=num;i++)
        {
          int count=0;
          for(int j=1;j<=i;j++)
          {
              if(i%j==0)
              {
                  count++;
              }
          }
          if(count==2)
          {
              System.out.print(i+" ");
          }
        }
    }
}

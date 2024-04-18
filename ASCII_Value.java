package com.Day1;

import java.util.Scanner;

public class ASCII_Value {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a character: ");
        char ch=scan.next().charAt(0);

        int ascii=(int) ch;
        System.out.println("ASCII value:"+ascii);
    }
}

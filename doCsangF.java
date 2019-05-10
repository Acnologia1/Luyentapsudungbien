package com.company;
import  java.util.Scanner;

public class doCsangF {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ C:");
        int doC = scanner.nextInt();
        float doF =(doC*9/5)+32;
        System.out.println("Độ F ="+ doF);
    }
}

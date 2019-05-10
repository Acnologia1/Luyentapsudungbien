package com.company;
import  java.util.Scanner;

public class dthinhtron {
    public static void main(String[] args)
    {
        final double pi = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập bán kính hình tròn: ");
        double r = scanner.nextInt();
        double dientich = pi*r*r;
        double chuvi = 2*pi*r;
        System.out.println("Chu vi hình tròn = "+ chuvi);
        System.out.println("Diện tích hình tròn ="+ dientich);
    }
}

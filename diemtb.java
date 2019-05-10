package com.company;
import java.util.Scanner;

public class diemtb {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập điểm môn vật lý: ");
        int ly = scanner.nextInt();
        System.out.println("Nhập điểm môn hóa học: ");
        int hoa = scanner.nextInt();
        System.out.println("Nhập điểm môn sinh học: ");
        int sinh = scanner.nextInt();
        float diemtb = (ly+hoa+sinh)/3;
        int tong = ly+sinh+hoa;
        System.out.println("Điểm trung bình 3 môn: "+diemtb);
        System.out.println("Tổng điểm: "+tong);
    }
}

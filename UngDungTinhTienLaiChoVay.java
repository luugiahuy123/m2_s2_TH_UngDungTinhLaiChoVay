package ss2.ThucHanh.UngDungTinhTienLaiChoVay;

import java.util.Scanner;

public class UngDungTinhTienLaiChoVay {
    public static void main(String[] args) {
        double money = 0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so tien");
        money = input.nextDouble();
        System.out.println("nhap so thang");
        month = input.nextInt();
        System.out.println("nhap ty le lai xuat hang nam");
        interestRate = input.nextDouble();
        double total = 0;
        for (int i = 0; i < month ; i++) {
            total = money * (interestRate/100/12) * month;
        }
        System.out.println("total of interest" + total);
    }
}

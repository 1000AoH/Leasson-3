package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Kích thước mảng
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập kích thước mảng: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        // Nhập các phần tử và in ra

        String[] x = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập phần tử thứ #" + (i + 1));
            x[i] = scanner.nextLine();
        }
        for (String i : x) {
            System.out.print(i + "\t");
        }

        // Đếm các phần tử chứa "Java"

        System.out.println();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (x[i].equals("Java")) {
                count++;
            }
        }
        System.out.println("Số lần \"Java\" xuất hiện: " + count);

        // Nhập từ bàn phím chuỗi bất kỳ, kiểm tra vị trí:

        int contain = 0;
        boolean isCheck = true;
        while (isCheck) {
            System.out.println("Nhập phần tử cần kiểm tra vị trí: ");
            String y = scanner.nextLine();
            for (int i = 0; i < x.length; i++) {
                if (x[i].equals(y)) {
                    System.out.println("Vị trí của phần tử vừa nhập là: " + i);
                    contain++;
                    isCheck = false;
                }
            }
            if (contain == 0) {
                System.out.println("Mảng không chứa phần tử được nhập");
            }
        }
    }


}

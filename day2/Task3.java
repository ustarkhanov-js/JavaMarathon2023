package day2;

import java.util.Scanner;

public class Task3 {
    // 3. Реализовать программу №2, используя цикл while.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int i = a + 1;
        if (a >= b) {
            System.out.println("Некорректный ввод");
        } else {
            while(i < b) {
                if (i % 5 == 0 && i % 10 != 0) {
                    System.out.print(i + " ");
                }
                i++;
            }
        }
    }
}

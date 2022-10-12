package codeup;

import java.util.Scanner;

public class CodeUp1045 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long first = sc.nextLong();
        long second = sc.nextLong();
        System.out.println(first+second);
        System.out.println(first-second);
        System.out.println(first*second);
        System.out.println(first/second);
        System.out.println(first%second);
        double A = (double) first;
        System.out.printf("%.2f\n", A/second);
    }
}

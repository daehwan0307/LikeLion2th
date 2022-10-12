package codeup;

import java.util.Scanner;

public class CodeUp1048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        a = a<<b;
        System.out.println(a);
    }
}

package codeup2;

import java.util.Scanner;

public class CodeUp1054 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc. nextInt();
        int c = (a&b);

        if(c== 1)
            System.out.println("1");
        else
            System.out.println("0");
    }
}

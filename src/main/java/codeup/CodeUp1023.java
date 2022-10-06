package codeup;

import java.util.Scanner;

public class CodeUp1023 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] value = sc.next().split("[.]");
        int a = Integer.valueOf(value[0]);
        int b = Integer.valueOf(value[1]);

        System.out.println(a);
        System.out.println(b);
    }
}

package codeup2;

import java.util.Scanner;

public class CodeUp1082 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        int b = Integer.valueOf(a,16);

        for (int i = 1; i < 16 ; i++) {
            System.out.printf("%s*%X=%X\n",a,i,b*i);
        }

    }
}

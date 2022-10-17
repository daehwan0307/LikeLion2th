package codeup2;

import java.util.Scanner;

public class CodeUp1081 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("%d %d\n",i+1,j+1);
            }
        }
    }
}

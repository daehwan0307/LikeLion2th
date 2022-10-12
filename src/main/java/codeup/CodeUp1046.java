package codeup;

import java.util.Scanner;

public class CodeUp1046 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a+b+c);
        double avg = (a+b+c)/3f; //3f로 나누는 이유..?
        System.out.printf("%.1f",avg);
    }
}

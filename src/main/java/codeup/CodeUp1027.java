package codeup;

import java.util.Scanner;

public class CodeUp1027 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String arr = sc.next();
        String[] ar = arr.split("\\.");
        System.out.printf("%s-%s-%s",ar[2],ar[1], ar[0]);
    }
}

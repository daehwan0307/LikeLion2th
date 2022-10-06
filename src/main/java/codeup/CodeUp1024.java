package codeup;

import java.util.Scanner;

public class CodeUp1024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String [] str1= str.split("");

        for(int i = 0; i<str1.length;i++){
            System.out.println(str1[i]);
        }
    }
}

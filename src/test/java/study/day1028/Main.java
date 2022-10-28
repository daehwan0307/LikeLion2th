package study.day1028;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if(i==j){
                    System.out.printf("#");
                }
                else
                    System.out.printf("+");
            }
            System.out.println("\n");
        }
    }
}

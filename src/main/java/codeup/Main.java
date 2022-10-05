package codeup;
//code up 1010번 문제

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final char[][] arr = {
                {'\u250C', '\u252C', '\u2510'},
                {'\u251C', '\u253C', '\u2524'},
                {'\u2514', '\u2534', '\u2518'}
        };

        final StringBuilder sb = new StringBuilder();
        for(char[] cs : arr) {
            for (char c : cs) {
                sb.append(c);
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}


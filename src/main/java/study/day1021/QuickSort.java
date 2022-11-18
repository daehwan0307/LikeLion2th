package study.day1021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[]  args) {

    String s = "AB";
    int n = 1;


    }

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')){
                int theta = 64;
                if ((int) s.charAt(i) >= 97) theta = 96;
                int r = ((int) s.charAt(i) - theta) % 26 + n;
                sb.append((char)(theta + r));
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }

}



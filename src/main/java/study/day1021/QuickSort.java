package study.day1021;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickSort {

    public static void main(String[]  args) {

    String s = "AB";
    int n = 1;

    QuickSort qs = new QuickSort();

    System.out.printf(Arrays.toString(qs.solution(s,n)) );
    }

    public String[] solution(String s, int n){
        String answer = "";
        String[] strArr = answer.split("");

        for (int i = 0; i < strArr.length; i++) {
            int ch = s.charAt(i)+n;
           strArr[i] = Integer.toString(ch);
        }
        return strArr;
    }

}



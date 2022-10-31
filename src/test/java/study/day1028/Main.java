package study.day1028;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*
         1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
         2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
         3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
       */
    public int[] solution(int[] answers) {
            int[] answer = {};
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};
        int firstAnswer = 0;
        int secondAnswer = 0;
        int thirdAnswer = 0;

        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == first[i % 5]) {
                firstAnswer++;
            }
            if(answers[i] == second[i % 8]) {
                secondAnswer++;
            }
            if(answers[i] == third[i % 10]) {
                thirdAnswer++;
            }
        }
        int max = Math.max(Math.max(firstAnswer, secondAnswer), thirdAnswer);
            return answer;
    }

    public static void main(String[] args) {


    }
}

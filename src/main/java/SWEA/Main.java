package SWEA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileInputStream;
public class Main {
    class Solution {
        public String solution(String[] participant, String[] completion) {

            HashMap<String,Integer> hm = new HashMap<>(100000);

            for (int i = 0; i < participant.length; i++) {
                hm.put(participant[i],i);
            }
            for (int i = 0; i < completion.length; i++) {
                hm.remove(participant[i]);
            }

            System.out.println(hm);

            System.out.println();

            return "";
        }


    }

    public static void main(String[] args) {
        String[] participant = {"leo", "kiki", "eden"};
        String[] completion = {"eden", "kiki"};
        Solution solution = new Solution;

    }
}

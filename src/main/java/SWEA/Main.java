package SWEA;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileInputStream;
public class Main {

        public static void main(String args[]) throws Exception
        {

            Scanner sc = new Scanner(System.in);
            int T;
            T=sc.nextInt();


            for(int test_case = 1; test_case <= T; test_case++)
            {
                int size =  sc.nextInt();
                int [] numArr = new int[size];
                for (int i = 0; i < size; i++) {
                    numArr[i]=sc.nextInt();
                }

                Arrays.sort(numArr);

                System.out.printf("#%d ",test_case);

                for (int i = 0; i < size; i++) {
                    System.out.printf("%d ",numArr[i]);
                }
                System.out.println("hi");


            }

        }

}

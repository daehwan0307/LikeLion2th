package SWEA;
import java.util.Arrays;
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
            String str = sc.next();
            for (int j = 2; j < 10; j++) {
                if(str.substring(0,j).equals(str.substring(j,2*j))){
                    System.out.printf("#%d %d\n",test_case,j);
                    break;
                }
            }

        }

    }
}

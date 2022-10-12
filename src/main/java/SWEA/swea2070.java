package SWEA;

import java.util.Scanner;

public class swea2070 {
    public static void main(String args[]) throws Exception
    {

        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.printf("#%d ",test_case);
            if(a>b)
                System.out.println(">");
            else if(a==b)
                System.out.println("=");
            else
                System.out.println("<");
        }
}
}


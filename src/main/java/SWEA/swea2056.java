package SWEA;

import java.util.Scanner;

public class swea2056 {
    public static void main(String args[]) throws Exception
    {
        int[] dayNum = {31,28,31,30,31,30,31,31,30,31,30,31};  // 1월~12월까지 각 날짜 수

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String A = sc.next();  //연원일 순으로 구성된 8자리 날짜 입력

            String Year = A.substring(0, 4);  //년도 저장
            String Month = A.substring(4, 6); //달 저장
            String Day = A.substring(6, 8); //일 저장

            if (Integer.parseInt(Month) > 12 || Integer.parseInt(Month) <= 0) {
                System.out.printf("#%d -1\n",i);
            } else if (Integer.parseInt(Day) > dayNum[Integer.parseInt(Month) - 1] || Integer.parseInt(Day) <= 0) {
                System.out.printf("#%d -1\n",i);
            } else {
                System.out.printf("#%d %s/%s/%s\n",i, Year, Month, Day);
            }

        }

    }
}


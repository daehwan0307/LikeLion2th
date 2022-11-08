package codeup;

import java.util.Scanner;

public class CodeUp3001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numArr = new int[size];

        for (int i = 0; i < size; i++) {
            numArr[i]=sc.nextInt();
        }
        int answer = sc.nextInt();

        for (int i = 0; i < numArr.length; i++) {
            if(answer==numArr[i])
            {System.out.printf("%d",i+1);
                return ;
            }

        }
        System.out.printf("-1");
    }

}

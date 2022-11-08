package programmers;

import java.util.*;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numArr = {};

        for (int i = 0; i < size; i++) {
            numArr[i]=sc.nextInt();
        }
        int answer = sc.nextInt();

        for (int i = 0; i < numArr.length; i++) {
            if(answer==numArr[i])
                System.out.printf("%d",i);
        }
    }

}

package codeup;

import java.util.Scanner;

public class CodeUp1019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        String[] arr = a.split("\\.");
        int A = Integer.parseInt(arr[0]);
        int B = Integer.parseInt(arr[1]);
        int C = Integer.parseInt(arr[2]);
        System.out.printf("%04d.%02d.%02d", A, B, C);
    }
}

/*
str.split(".");
split() 메소드는 파라미터로 정규식을 입력 받는데,
정규식에서 마침표(.)는 임의의 한 문자를 의미합니다.

따라서, 문자열을 마침표(.)로 구분하고 싶다면 아래와 같은 방법을 사용해야 합니다.

str.split("[.]");
또는
str.split("\\.");

*/
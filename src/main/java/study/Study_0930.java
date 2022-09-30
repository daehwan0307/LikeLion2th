package study;

import java.util.Scanner;

public class Study_0930 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        String str = new String();
        str=sc.nextLine();


        for(int i=0; i<str.length();i++){
            System.out.println(str.substring(i) + str.substring(0, i));
        }




        /*
        StringBuilder sb = new StringBuilder("123");
        sb.append(4567);
        sb.delete(0,2);

        System.out.println(sb);
        sb.replace(0,3,"AB");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        */

    }
}

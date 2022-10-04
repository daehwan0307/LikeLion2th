package algorithm;

import java.util.Scanner;

public class CurrencyCnt {


    public static void main(String[] args) {
        //현금으로 돈을 받고 25000원을 거슬러 주어야 합니다.
        //
        int a ;
        System.out.println("금액을 입력하세요");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        int b = a/50000;
        int c = (a%50000)/10000;
        int d = ((a%50000)%10000)/5000;
        int e = a%50000%10000%5000/1000;
        int f = a%50000%10000%5000%1000/500;
        int g = a%50000%10000%5000%1000%500/100;
        int h = a%50000%10000%5000%1000%500%100/50;
        int i = a%50000%10000%5000%1000%500%100%50/10;
        System.out.println("50000원"+b+"개");
        System.out.println("10000원"+c+"개");
        System.out.println("5000원"+d+"개");
        System.out.println("1000원"+e+"개");
        System.out.println("500원"+f+"개");
        System.out.println("100원"+g+"개");
        System.out.println("50원"+h+"개");
        System.out.println("10원"+i+"개");
    }
}

package algorithm;

import java.util.Scanner;

public class CurrencyCnt {


    public static void main(String[] args) {
        //현금으로 돈을 받고 25000원을 거슬러 주어야 합니다.

        int a ;
        System.out.println("금액을 입력하세요");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        int b = a/50000;
        int c = a%50000/10000;
        int d = a%50000%10000/5000;
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

        /*
         int curr50000 = 50000;
        int curr10000 = 10000;
        int curr5000 = 5000;
        int curr1000 = 1000;
        int curr500 = 500;
        int curr100 = 100;
        int curr50 = 50;
        int curr10 = 10;

        System.out.printf("5만원권 %d장, 나머지: %d\n", refund / curr50000, refund % curr50000);
        refund = refund % curr50000;
        System.out.printf("1만원권 %d장, 나머지: %d\n", refund / curr10000, refund % curr10000);
        refund = refund % curr10000;
        System.out.printf("5천원권 %d장, 나머지: %d\n", refund / curr5000, refund % curr5000);
        refund = refund % curr5000;
        System.out.printf("1천원권 %d장, 나머지: %d\n", refund / curr1000, refund % curr1000);
        refund = refund % curr1000;
        System.out.printf("5백원 %d개, 나머지: %d\n", refund / curr500, refund % curr500);
        refund = refund % curr500;
        System.out.printf("1백원 %d개, 나머지: %d\n", refund / curr100, refund % curr100);
        refund = refund % curr100;
        System.out.printf("5십원 %d개, 나머지: %d\n", refund / curr50, refund % curr50);
        refund = refund % curr50;
        System.out.printf("1십원 %d개, 나머지: %d\n", refund / curr10, refund % curr10);
         */


    }
}

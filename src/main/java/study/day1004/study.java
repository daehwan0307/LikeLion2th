package study.day1004;

import java.util.Scanner;

public class study {


    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        try {
            System.out.print("a/b... a?");
            int n1 = kb.nextInt();

            System.out.print("a/b ... b?");
            int n2 = kb.nextInt();
            System.out.printf("%d / %d = %d \n", n1, n2, n1 / n2);
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }finally {
            System.out.println("무조건 실행");
        }

        System.out.println("good bye");
    }
}

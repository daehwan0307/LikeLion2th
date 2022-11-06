package codeup;

import java.util.Scanner;

public class CodeUp1080 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int sum = 0;
        for(int i=1; i<=num; i++){
            sum += i;
            if(sum >= num){
                System.out.print(i);
                break;
            }
        }

    }
}

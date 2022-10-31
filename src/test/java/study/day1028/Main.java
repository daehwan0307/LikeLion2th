package study.day1028;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        for (int i = 1; i < T; i++) {
            int N = sc.nextInt();
            int M = sc. nextInt();
            int[] sizeArr = new int[(N-M+1)*(N-M+1)];
            int[][] pari = new int[N][N];
            int pariMax = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    pari[j][k]=sc.nextInt();
                }
            }

            for (int j = 0; j <= N-M; j++) {
                for (int k = 0; k <= N-M; k++) {
                    int sum= 0;
                    for (int l = 0; l < M; l++) {
                        for (int m = 0; m < M; m++) {
                            sum +=pari[j+l][k+m];
                        }
                    }
                    if(pariMax<sum){
                        pariMax=sum;
                    }

                }

            }
            System.out.println("#"+i+" " + pariMax);

        }
    }

}

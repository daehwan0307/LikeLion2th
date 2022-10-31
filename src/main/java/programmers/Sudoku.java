package programmers;
import java.util.HashSet;
import java.util.Scanner;

public class Sudoku {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
        int[][] sudoku = new int[9][9];
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int answer= 1;
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    sudoku[i][j]= sc.nextInt();
                }
            }
            for (int i = 0; i < 9; i++) {
                int colsum=0;
                int rowsum=0;
                for (int j = 0; j < 9; j++) {
                    colsum+=sudoku[i][j];
                    rowsum+=sudoku[j][i];
                }
                if(colsum!=45|| rowsum!=45){
                    answer = 0;
                    break;
                }
            }
            if (answer == 0) {
                System.out.println("#" + test_case + " 0");
                continue;
            }

            for (int i = 0; i < 9; i+=3) {
                for (int j = 0; j < 9; j+=3) {
                    int sum = 0;
                    for (int x = 0; x < 3; x++)
                        for (int y = 0; y < 3; y++)
                            sum += sudoku[i+x][j+y];
                    if (sum != 45) {
                        answer = 0;
                        break;
                    }
                }
                if (answer == 0) break;
            }
            System.out.println("#" + test_case + " " + answer);
        }
    }
}

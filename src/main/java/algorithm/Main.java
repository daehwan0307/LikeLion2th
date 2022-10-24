package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands ={{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        Main main = new Main();
        main.solution(array,commands);
        System.out.println(Arrays.toString( main.solution(array,commands)));


    }

    public int[] solution(int[] array, int[][] commands){
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] slicedArray = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            Arrays.sort(slicedArray);
            answer[i]=slicedArray[commands[i][2]-1];
        }
        return answer;
    }
}

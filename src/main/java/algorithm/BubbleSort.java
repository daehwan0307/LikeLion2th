package algorithm;

import java.lang.reflect.Array;
import java.util.Arrays;
//버블 소트 연습
public class BubbleSort {

    public static int[] bubbleSort(int n, int[] arr){
        for(int i = 0; i < n; i++) {
            for(int j = 0 ; j < n - i - 1 ; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
            int[] a = {5,1,3,8,2,7,6};

            System.out.println(Arrays.toString(a));
            bubbleSort(7,a);
            System.out.println(Arrays.toString(a));

    }

}

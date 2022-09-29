package algorithm;


import java.util.Arrays;

public class SelectionSort {

    public static int[] selectionsort(int n, int[] arr){
        int minIndex, temp;

        for(int i = 0; i < n - 1; i++) {
            minIndex = i;

            // 최솟값을 갖고있는 인덱스 찾기
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 4. 자리바꿈
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] a = {5,1,3,8,2,7,6};

        System.out.println(Arrays.toString(a));
        selectionsort(7,a);
        System.out.println(Arrays.toString(a));
    }
}

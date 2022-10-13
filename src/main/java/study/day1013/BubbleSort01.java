package study.day1013;

import algorithm.BubbleSort;

public class BubbleSort01 {

    public int[] sort(int[] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1 ; j<arr.length; j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
            System.out.print(arr[i]);
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{7,2,3,9,28,11};

        BubbleSort01 bubbleSort01 = new BubbleSort01();
        bubbleSort01.sort(arr);


    }


}



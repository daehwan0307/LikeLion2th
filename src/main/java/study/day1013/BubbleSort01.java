package study.day1013;

public class BubbleSort01 {


    public static void main(String[] args) {
        int[] arr = new int[]{7,2,3,9,28,11};
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
        }

    }


}



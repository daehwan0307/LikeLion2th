package codeup3;

public class CodeUp2081 {
    public int getMax(int[] arr){
        int maxValue = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[maxValue]<arr[i]) {
                maxValue = i;
            }
        }
            return maxValue;
    };

    public static void main(String[] args) {



    }
}

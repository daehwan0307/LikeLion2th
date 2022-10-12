package codeup;

public class CodeUp2081 {

    public static void main(String[] args) {
        int[] arr = new int[]{3,29,38,12,57,74,40,85,61};

        int maxValue = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[maxValue]<arr[i]) {
                maxValue = i;
            }

        }
        System.out.println(arr[maxValue]);
        System.out.println(maxValue+1);

    }
}

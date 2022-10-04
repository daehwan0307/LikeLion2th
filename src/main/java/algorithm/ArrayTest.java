package algorithm;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        System.out.println("hello");
        int[] a = new int[10];

        for(int i=0;i<a.length;i++){
            a[i]= i;

        }
        System.out.print(Arrays.toString(a));
    }
}

package study.day1021;

import java.util.ArrayList;
import java.util.List;

public class QuickSort {
    public static void main(String[] args) {
        var arr = new int[]{20, 18, 5, 19, 5, 25, 40, 50}; // size = 8

        // 1. 기준값 뽑는 로직 구현
        int pivot = arr[arr.length / 2]; // 5
        System.out.println(pivot);
        // 2. 기준값 기준으로 왼쪽 오른쪽으로 나누어 담는 로직 구현
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(pivot > arr[i]) left.add(arr[i]);
            else if (pivot < arr[i]) right.add(arr[i]);
        }
        System.out.println(left); //
        System.out.println(right); // 20, 18, 19, 25, 40, 50

    }
}

package study;

import java.util.Arrays;

public class Day1129 {

        public static void main(String[] args) {
            int[] arr = new int[]{7, 4, 5, 9, 1, 0};

            // 10개 생성
            int[] redixArr = new int[10];
            Arrays.fill(redixArr, -1); // -1로 채우기

            // 배열에서 꺼내서 넣기
            for (var i : arr) {
                redixArr[i] = i;
            }

            System.out.println(Arrays.toString(redixArr));

            // 1개씩 꺼내서 arr에 다시 넣기
            int cnt = 0;
            for (int i = 0; i < redixArr.length; i++) {
                if(redixArr[i] != -1) {
                    arr[cnt++] = redixArr[i];
                }
            }
            System.out.println(Arrays.toString(arr));
        }
    }


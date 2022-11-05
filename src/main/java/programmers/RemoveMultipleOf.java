package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMultipleOf {
    public int solution(int N) {
        if (N == 2) return 1;
        int[] nums = new int[N-1]; // N-1개만큼 2~50까지 총 49개
        boolean[] checks = new boolean[nums.length]; // nums만큼 checks생성
        Arrays.fill(checks, true); // checks를 true로 초기화 cuz 기본값 false
        for (int i = 0; i < nums.length; i++) nums[i] = i + 2; // 2~49까지 nums에 채우기

        for (int j = 0; j * j <= N; j++) {// N == 49
            int multipleOf = nums[j]; // j=0 nums[0] = 2
            // 초항이 2 2n인 2 4 6 8 10
            for (int i = nums[j] + j; i < nums.length; i+=multipleOf) {
                checks[i] = false;
            }
//            printNums(nums, checks);
        }
        int cnt = 0;
        for (int i = 0; i < checks.length; i++) {
            if(checks[i]) cnt++;
        }
        return cnt;
    }


    public static void main(String[] args) {

//        List<Integer> primeNumList = new ArrayList<>();
//        for (int i = 2; i <= 50; i++) {
//            primeNumList.add(i);
//        }

        int N = 50;
        int[] nums = new int[N-1];
        boolean[] checks = new boolean[nums.length];
        Arrays.fill(checks,true);

        for (int i =0; i < nums.length; i++) {
            nums[i] =i+2;
            //checks[i] = true;
        }

        //2의 배수 삭제
        //0 1 2 3 4 5 6 7 8   9 10 11 12 13 14 15 16 17 18 ...
        //2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20  ... 50
        for (int i = 2; i < checks.length ; i+=2) {
            checks[i]=false;
        }

        for (int i = 0; i < checks.length; i++) {
            if(checks[i]==true){
                System.out.printf("%d ",nums[i]);
            }
        }




//        for (int i = 0; i < primeNumList.size(); i++) {
//            if (primeNumList.get(i) % 2 == 0 && primeNumList.get(i) > 2) nums.remove(i);
//        }


//        primeNumList.removeIf(integer -> integer%2==0 && integer!=2);
//        primeNumList.removeIf(integer -> integer%3==0 && integer!=3);
//        primeNumList.removeIf(integer -> integer%5==0 && integer!=5);
//        primeNumList.removeIf(integer -> integer%7==0 && integer!=7);
//
//
//
//
//        System.out.println(primeNumList.size());
//        System.out.println(primeNumList);



    }
}

package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveMultipleOf {
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
                System.out.println(nums[i]);
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

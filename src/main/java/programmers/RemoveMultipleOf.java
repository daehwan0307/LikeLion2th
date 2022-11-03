package programmers;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {
    public static void main(String[] args) {

//        List<Integer> primeNumList = new ArrayList<>();
//        for (int i = 2; i <= 50; i++) {
//            primeNumList.add(i);
//        }
            int[] nums = new int[100];
            int[] checks = new int[100];

        for (int i = 1; i <= nums.length; i++) {
            nums[i] =i;
            checks[i] = 1;
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

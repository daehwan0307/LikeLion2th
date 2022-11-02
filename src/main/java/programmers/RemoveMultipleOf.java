package programmers;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {
    public static void main(String[] args) {

        List<Integer> primeNumList = new ArrayList<>();
        for (int i = 2; i <= 50; i++) {
            primeNumList.add(i);
        }



//        for (int i = 3; i <50; i++) {
//            if(i%2==0)
//                primeNumList.remove(i);
//        }

        primeNumList.removeIf(integer -> integer%2==0 && integer!=2);

        System.out.println(primeNumList.size());
        System.out.println(primeNumList);


    }
}

package programmers;

import java.util.ArrayList;
import java.util.List;

public class RemoveMultipleOf {
    public static void main(String[] args) {

        List<Integer> primeNumList = new ArrayList<>();
        for (int i = 2; i <= 50; i++) {
            primeNumList.add(i);
        }

        System.out.println(primeNumList.size());



    }
}

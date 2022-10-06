package study.day3.collection;

import java.util.HashSet;
import java.util.Set;

public class RndNumbersWithoutDuplicated {
    public static void main(String[] args) {
    RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();

        Set<Integer> set1 = new HashSet<>();

    for(int i = 0 ; i<10;i++){
        set1.add(randomNumberGenerator.generate(20));

    }
        System.out.println(set1);
        System.out.println(set1.size());

    }
}

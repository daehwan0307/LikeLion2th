package study.day1006.collection;

import java.util.HashSet;

public class AlphabetGenerator{

    public static void main(String[] args) {

        HashSet<Character> setChar = new HashSet<>();
        for (int i =0; i < 100; i++) {
            int randNum = (int)(Math.random()*26);
            char randChar = (char) (randNum + 65);
            setChar.add(randChar);
        }

        System.out.println(setChar);
        System.out.println(setChar.size());

    }
}

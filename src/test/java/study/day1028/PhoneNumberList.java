package study.day1028;

import java.util.HashSet;
import java.util.Set;

public class PhoneNumberList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        HashSet<String> hs = new HashSet<>();

        for (int i = 0; i < phone_book.length; i++) {
          hs.add(phone_book[i]);
        }
        for (int i = 0; i < phone_book.length; i++) {
            if(hs.contains(phone_book[i]))
                return false;
            else
                return true;
        }
        return answer;
    }

    public static void main(String[] args) {

    }
}

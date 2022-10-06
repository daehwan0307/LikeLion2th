package study.day1006.collection;

import java.util.HashMap;

public class AlphbetCnt {
    public static void main(String[] args) {
        String address = "https://github.com/Kyeongrok/like-lion-java".toLowerCase();
        HashMap<String, Integer> addressMap = new HashMap<>();
        int count = 0;

        for (int i = 0; i < address.length(); i++) {

            if (Character.isAlphabetic(address.charAt(i))) {
                for (int j = 1; j < address.length(); j++) {
                    if (address.charAt(i) == address.charAt(j)) {
                        count ++;
                    }
                }

                addressMap.put(String.valueOf(address.charAt(i)), count);
                count = 0;
            }

        }

        System.out.println(addressMap.get("a"));
        System.out.println(addressMap);

    }
}

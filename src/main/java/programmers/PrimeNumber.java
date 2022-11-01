package programmers;

public class PrimeNumber {
    
    boolean isPrime(int num) {
        // num = 13이니까 12까지 나누어 봅니다.
        for (int i = 2; i < num; i++) {
            if(num % i != 0) return false;
        }
        return true;
    }


}

package study;

public class fac {
    public static void main(String[] args) {

    }
    public static int factorial(int num) {
        if(num == 1) return num; // 1일때 1을 리턴함
        return num * factorial(num - 1);
    }
}

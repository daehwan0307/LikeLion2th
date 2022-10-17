package study.day1017;

public class Pyramid {
    public static void main(String[] args) {
            Pyramid pyramid = new Pyramid();
            pyramid.printStar(5);
    }
    public  void printStar(int num){
        for (int i = 1; i <= num; i++) {
            // 공백 출력
            for (int j = 1; j <= (num-i); j++) {
                System.out.print(" ");

            }
            for (int ii = 1; ii <= i; ii++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

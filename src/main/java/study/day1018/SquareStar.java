package study.day1018;

public class SquareStar {
    public static void main(String[] args) {

        SquareStar ss = new SquareStar();
        ss.printRecStar(3,4);
    }

    public void printSquareStar(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("*");
            }
            System.out.println("\n");
        }
    }
    public void printRecStar(int a, int b){
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.printf("*");
            }
            System.out.println("\n");
        }
    }
}

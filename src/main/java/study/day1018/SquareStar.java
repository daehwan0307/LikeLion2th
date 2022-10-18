package study.day1018;

public class SquareStar {
    public static void main(String[] args) {

        SquareStar ss = new SquareStar();
        ss.printSquareStar(3);
    }

    public void printSquareStar(int size){
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("*");
            }
            System.out.println("\n");
        }
    }
}

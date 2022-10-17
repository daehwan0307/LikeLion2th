package study;

public class day1017 {
    public static void main(String[] args) {

        day1017 day = new day1017();
        day.makeT(5);
    }

    public void makeT(int num){
        for(int i = 0; i<num;i++){
            for(int j= 0; j<=i;j++){
                System.out.printf("*");
            }
            System.out.println("\n");
        }
    }
}


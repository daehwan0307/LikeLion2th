package programmers;


interface StatementStrategy {
    boolean compare(int a, int b);
}





public class PrimeNumber {

    //i<num
    //i<num / 2
    // i*i <num
    boolean someOperation(int a , int b){
        return a<b;
    }


    boolean isPrime(int num, StatementStrategy stmt) {
        for (int i = 2; stmt.compare(i, num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

        boolean isPrime2(int num) {

        for (int i = 2; i<num / 2; i++) {
            if(num % i != 0) return false;
        }
        return true;
    }
    boolean isPrime3(int num) {

        for (int i = 2; i*i <num; i++) {
            if(num % i != 0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        PrimeNumber pn = new PrimeNumber();
        boolean r = pn.isPrime(17, new StatementStrategy() {
            @Override
            public boolean compare(int a, int b) {
                return a * a <= b;
            }
        });
        System.out.println(r);
    }




}

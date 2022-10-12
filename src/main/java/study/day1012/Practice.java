package study.day1012;

public class Practice {

    public void Mul(int num){

        for(int i=0; i<10;i++){
            System.out.printf("%d*%d=%d\n",num,i,num*i);
        }
    }

    public static void main(String[] args) {
        Practice practice = new Practice();
        practice.Mul(3); //n단 출력
        
    }
}

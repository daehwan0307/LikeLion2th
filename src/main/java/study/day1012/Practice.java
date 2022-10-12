package study.day1012;

interface Operation{
    int operation(int a, int b);
}
public class Practice {

    public void template(int num,String operator,Operation operation){

        for(int i=0; i<10;i++){
            System.out.printf("%d %s %d = %d\n",num,operator,i,operation.operation(num,i));
        }
    }
    public void printPlusGugu(int num){

        template(num,"+",(a,b)->a+b);
    }
    public void printMulGugu(int num){

        template(num,"+",(a,b)->a*b);
    }

    public static void main(String[] args) {
        Practice practice = new Practice();


    }
}

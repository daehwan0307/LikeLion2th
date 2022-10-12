package programmers;

public class SubakSubak {

    public String solution(int n){
        String answer="";
        if(n%2==0){
            for(int i =0;i<n/2;i++)
                answer+="수박";
        }else {
            for(int i =0;i<n/2;i++)
            {  answer+="수박";}
            answer+="수";
        }
        return answer;
    }

    public static void main(String[] args) {

        SubakSubak subakSubak = new SubakSubak();
        System.out.println(subakSubak.solution(5));
    }
}


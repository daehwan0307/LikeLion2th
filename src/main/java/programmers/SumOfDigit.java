package programmers;

public class SumOfDigit {
    public int solution(int n){
        // n을 string으로 변경
        int result = 0;
        String str = String.valueOf(n);
        for(int i = 0; i<str.length();i++){
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        // string을 loop돌면서 parseInt후 더한다.
        return result;
    }

    public static void main(String[] args) {
        SumOfDigit sod = new SumOfDigit();
        int result1 = sod.solution(1234);
        
        if(result1 ==10){
            System.out.println("성공");
        }else System.out.println("실패");
    }
}

package study;

public class PrintAtoZCombination {
    public static void printAlphabet(char c) {
        if (c > 'Z') return; // 탈출 조건
        System.out.println(c); // c를 출력
        printAlphabet((char)(c + 1)); // 숫자 1개를 늘림
    }
    public static void main(String[] args) {
        printAlphabet('A');
    }

}

package programmers;

import java.util.Stack;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer = {};

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=arr[i+1]){
                st.pop();
            }
        }

            return answer;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};


        Stack<Integer> st = new Stack<>();

        st.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {

            if(arr[i]!=arr[i+1]){
                st.push(arr[i]);
            }
        }


        System.out.println(st.peek());
    }
}

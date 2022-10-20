package study.day1020;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.EmptyStackException;
import java.util.Stack;



class Stack02Test {

    @BeforeEach
    void setUp() {
        // ex) db에서 데이터를 지우는 코드
        // ex) db에 데이터를 넣는 콛
        System.out.println("before each");
    }

    @Test
    @DisplayName("push가 잘 되는지")
    void pushAndPop(){
        Stack02 stack02 = new Stack02();
        stack02.push(10);
        stack02.push(20);
        Integer[] arr= stack02.getArr();

        // Assertions.assertEquals()
        assertEquals(20, arr[1]); // 이것만 써도 Assertions가 자동으로 import 됨
        assertEquals(10, arr[0]);
        assertEquals(20, stack02.pop());
        assertEquals(10, stack02.pop());

        // exception의 검증: assertionThrows와 람다 표현식을 사용해서 구현
        // stack이 비어있을 때 EmptyStackException이 잘 나는지 확인
        assertThrows(EmptyStackException.class, () -> {
            stack02.pop(); // stack pop을 했을 때 이 error가 나는지?
        });
    }


    @Test
    void isEmpty(){
        Stack02 stack02 = new Stack02();
        assertTrue(stack02.isEmpty());
        stack02.push(10);
        assertFalse(stack02.isEmpty());
        stack02.pop();
        assertTrue(stack02.isEmpty());
    }

    @Test
    void realStack(){
        Stack<Integer> st= new Stack<>();
        assertThrows(EmptyStackException.class, ()-> {
            st.pop();
        });
    }
}
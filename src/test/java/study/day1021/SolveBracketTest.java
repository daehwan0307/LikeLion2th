package study.day1021;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolveBracketTest {
    @Test
    @DisplayName("괄호가 잘 풀리는지")
    void bracket(){ //한글을 --> 영어로
        SolveBracket sb = new SolveBracket();
        assertTrue(sb.solution("()()"));

    }

}
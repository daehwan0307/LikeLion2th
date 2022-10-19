package study.day1019;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {
    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);

        stack01.push(20);
        Assertions.assertEquals(20,stack01.pop());
        Assertions.assertEquals(10,stack01.pop());

        stack01.push(30);
        Assertions.assertEquals(30,stack01.pop());


    }
}
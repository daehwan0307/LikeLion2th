package study.day1019;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Stack01Test {
    @Test
    void pushTest() {
        Stack01 stack01 = new Stack01();
        stack01.push(10);
        int[] arr = stack01.getArr();
        stack01.push(20);
        Assertions.assertEquals(10,arr[0]);
        Assertions.assertEquals(20,arr[1]);
    }
}
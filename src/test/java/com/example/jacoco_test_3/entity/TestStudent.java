package com.example.jacoco_test_3.entity;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TestStudent {
    @Test
    void testStudent(){
        Student student = new Student();
        assertEquals("Student", student.getStudent());
    }
}

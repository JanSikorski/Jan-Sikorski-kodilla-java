package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class BoardTestSuite {

    @Autowired
    private Board board;

    @Test
    void testTaskAdd() {
        //Given & When
        board.addToDoList("ExampleToDoList");
        board.addInProgressList("ExampleInProgressList");
        board.addDoneList("ExampleDoneList");
        //Then
        assertEquals("ExampleToDoList", board.getToDoList().toString());
        assertEquals("ExampleInProgressList", board.getInProgressList().toString());
        assertEquals("ExampleDoneList", board.getDoneList().toString());
    }
}

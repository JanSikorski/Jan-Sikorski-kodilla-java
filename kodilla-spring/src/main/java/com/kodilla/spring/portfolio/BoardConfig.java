package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    @Autowired
    @Qualifier("toDoList")
    private TaskList toDoList;

    @Autowired
    @Qualifier("inProgressList")
    private TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    private TaskList doneList;

    @Bean
    public Board board() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean
    public TaskList inProgressList() {
        return new TaskList();
    }

    @Bean
    public TaskList doneList() {
        return new TaskList();
    }
}

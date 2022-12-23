package com.kodilla.spring.portfolio;

import jdk.jfr.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Configuration
public class BoardConfig {

    private TaskList taskList;

    @Bean(name = "toDoList")
    public Board getToDoList() {
        return new Board(taskList);
    }

    @Bean(name = "inProgressList")
    public Board getInProgressList() {
        return new Board(taskList);
    }
}

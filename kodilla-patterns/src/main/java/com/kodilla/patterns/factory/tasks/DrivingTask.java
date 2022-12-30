package com.kodilla.patterns.factory.tasks;

import java.util.IllegalFormatCodePointException;

public class DrivingTask implements Task {

    private String taskName;
    private String where;
    private String using;
    private boolean isTaskFinished = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("Driving " + using + " to " + where + " while executing " + taskName);
        isTaskFinished = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskFinished;
    }
}

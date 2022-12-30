package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task {

    private String taskName;
    private String color;
    private String whatToPaint;
    private boolean isTaskFinished = false;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("Painting " + whatToPaint + " using " + color + " while executing " + taskName);
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

package com.kodilla.patterns.factory.tasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskFactoryTestSuite {

    @Test
    void testFactoryShoppingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task shoppingTask = factory.makeTask(TaskFactory.SHOPPTING_TASK);
        boolean taskStateBeforeExecution = shoppingTask.isTaskExecuted();
        shoppingTask.executeTask();
        boolean taskStateAfterExecution = shoppingTask.isTaskExecuted();

        //Then
        assertEquals("Example shopping task", shoppingTask.getTaskName());
        assertEquals(false, taskStateBeforeExecution);
        assertEquals(true, taskStateAfterExecution);
    }

    @Test
    void testFactoryPaintingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task paintingTask = factory.makeTask(TaskFactory.PAINTING_TASK);
        boolean taskStateBeforeExecution = paintingTask.isTaskExecuted();
        paintingTask.executeTask();
        boolean taskStateAfterExecution = paintingTask.isTaskExecuted();

        //Then
        assertEquals("Example painting task", paintingTask.getTaskName());
        assertEquals(false, taskStateBeforeExecution);
        assertEquals(true, taskStateAfterExecution);
    }

    @Test
    void testFactoryDrivingTask() {
        //Given
        TaskFactory factory = new TaskFactory();

        //When
        Task drivingTask = factory.makeTask(TaskFactory.DRIVING_TASK);
        boolean taskStateBeforeExecution = drivingTask.isTaskExecuted();
        drivingTask.executeTask();
        boolean taskStateAfterExecution = drivingTask.isTaskExecuted();

        //Then
        assertEquals("Example driving task", drivingTask.getTaskName());
        assertEquals(false, taskStateBeforeExecution);
        assertEquals(true, taskStateAfterExecution);
    }
}

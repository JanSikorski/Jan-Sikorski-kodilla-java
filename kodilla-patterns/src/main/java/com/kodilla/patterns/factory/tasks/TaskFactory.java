package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPTING_TASK = "SHOPPTING_TASK";
    public static final String PAINTING_TASK = "PAINTING_TASK";
    public static final String DRIVING_TASK = "DRIVING_TASK";

    public final Task makeTask(final String task) {
        return switch (task) {
            case SHOPPTING_TASK -> new ShoppingTask("Example shopping task", "Stuff, lots of it", 2137);
            case PAINTING_TASK -> new PaintingTask("Example painting task", "bloody red", "river bank");
            case DRIVING_TASK -> new DrivingTask("Example driving task", "Warsaw", "Fiat Multipla");
            default -> null;
        };
    }
}

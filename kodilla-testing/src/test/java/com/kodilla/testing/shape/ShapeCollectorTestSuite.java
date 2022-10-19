package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Shape colector test suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

    private ShapeCollector shapeCollector;

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("Starting collection tests");
    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Finished all colection tests");
    }

    @BeforeEach
    public void beforeEveryTest() {
        shapeCollector = new ShapeCollector();
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Shape collector tests")
    class ShapeCollectorTests {

        @Test
        @DisplayName("Testing addFigure and getFigure methods")
        void addFigureTest() {
            //Given When
            shapeCollector.addFigure(new Triangle(2, 3));
            shapeCollector.addFigure(new Square(2));
            //Then
            assertEquals(shapeCollector.getFigure(0), new Triangle(2,3));
            assertEquals(shapeCollector.getFigure(1), new Square(2));
        }


        @Test
        @DisplayName("Testing removeFigure method")
        void removeFigureTest() {
            //Given When
            shapeCollector.addFigure(new Circle(2));
            shapeCollector.addFigure(new Triangle(2, 3));

            shapeCollector.removeFigure(new Circle(2));
            //Then
            assertEquals(shapeCollector.getFigure(0), new Triangle(2,3));
        }

        @Test
        @DisplayName("Testing showFigures method")
        void showFigureTest() {
            //Given When
            shapeCollector.addFigure(new Triangle(2,3));
            shapeCollector.addFigure(new Square(4));
            shapeCollector.addFigure(new Circle(23));
            //Then
            String expectedResult = new Triangle(2,3) + ", " + new Square(4) + ", " + new Circle(23);
            assertEquals(shapeCollector.showFigures(), expectedResult);
        }
    }
}
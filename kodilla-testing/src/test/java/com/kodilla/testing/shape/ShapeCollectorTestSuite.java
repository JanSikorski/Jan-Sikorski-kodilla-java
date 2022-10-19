package com.kodilla.testing.shape;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Shape colector test suite")
public class ShapeCollectorTestSuite {

    private static int testCounter = 0;

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
        testCounter++;
        System.out.println("Preparing to execute test #" + testCounter);
    }

    @Nested
    @DisplayName("Shape collector tests")
    class ShapeCollectorTests {

        @Test
        @DisplayName("Testing addFigure method")
        void addFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            //When
            shapeCollector.addFigure(new Triangle(2, 3));
            shapeCollector.addFigure(new Square(2));
            //Then
            assertEquals(shapeCollector.getFigure(0), "Triangle");
        }
/*

        @Test
        @DisplayName("Testing removeFigure method")
        void removeFigureTest() {
            //Given
            ShapeCollector shapeCollector = new ShapeCollector();
            Circle circle;
            shapeCollector.addFigure(circle= new Circle(2));
            //When
            shapeCollector.removeFigure(circle);
            //Then
            assertEquals(shapeCollector.getFigure(0), null);
        }
*/


    }
}
//"Triangle(2.0, 3.0)\nSquare(2.0)", shapeCollector.showFigures()
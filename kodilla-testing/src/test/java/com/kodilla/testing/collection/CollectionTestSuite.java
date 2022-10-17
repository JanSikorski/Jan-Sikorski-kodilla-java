package com.kodilla.testing.collection;

import com.kodilla.testing.user.OddNumbersExterminator;
import org.junit.jupiter.api.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@DisplayName("Collection test suite test")
public class CollectionTestSuite {

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Collection test suite: begin");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Collection test suite: end");
    }

    @BeforeEach
    public void beforeEach() {
        System.out.println("Test case: begin");
    }

    @AfterEach
    public void after() {
        System.out.println("Test Case: end");
    }

    @DisplayName("When provided empty list to extermainte method, then it should return empty list")
    @Test
    void testOddNumbersExterminatorEmptyList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> emptyList = oddNumbersExterminator.exterminate(new LinkedList<>());
        //Then
        Assertions.assertEquals(Arrays.asList(), emptyList);
    }

    @DisplayName("When created new list with numbers, then exterminate method should return only odd numbers")
    @Test
    void testOddNumbersExterminatorNormalList() {
        //Given
        OddNumbersExterminator oddNumbersExterminator = new OddNumbersExterminator();
        //When
        List<Integer> filteredNumbers =  oddNumbersExterminator.exterminate(Arrays.asList(1,2,3,4,5,6,7));
        //Then
        Assertions.assertEquals(Arrays.asList(2, 4, 6), filteredNumbers);
    }
}

package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = new int[]{1, 2, 5, 12, 40, 0};
        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(10, average);
    }
}

package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.Random;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayOperationsTestSuite {
    private static Random RANDOM = new Random();

    @Test
    void testGetAverage() {
        //Given
        int[] numbers = IntStream.range(0, 20)
                .toArray();
        //When
        double average = ArrayOperations.getAverage(numbers);

        //Then
        assertEquals(9.5, average);
    }
}

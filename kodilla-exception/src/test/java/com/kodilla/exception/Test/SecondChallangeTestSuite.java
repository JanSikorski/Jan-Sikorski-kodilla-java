package com.kodilla.exception.Test;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallangeTestSuite {

    @Test
    void testProbablyWillThrow() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(5, 10));
    }

    @Test
    void testEdgeCasesInProbablyWillThrow() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When Then
        assertAll(
                () -> assertThrows(NumberFormatException.class, () ->secondChallenge.probablyIWillThrowException(Double.parseDouble("args"), 6)),
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(Long.MAX_VALUE, Long.MIN_VALUE)),
                () -> assertThrows(ArithmeticException.class, () -> secondChallenge.probablyIWillThrowException(2/0, 2))
        );
    }
}

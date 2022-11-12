package com.kodilla.exception.Test;

import com.kodilla.exception.test.SecondChallenge;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SecondChallangeTestSuite {

    @DisplayName("x = 5, y = 10; Throws exception")
    @Test
    void testProbablyWillThrow() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();
        //When Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(5, 10));
    }

    @DisplayName("x = 2.01, y = 0; Throws exception")
    @Test
    void testEdgeCaseXHigherThan2() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.01, 0));
    }

    @DisplayName("x = 1, y = 1.5; Throws exception")
    @Test
    void testEdgeCaseXEqual1AndYEqual1AndAHalf() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1, 1.5));
    }

    @DisplayName("x = 1, y = 2; Doess not throw exception")
    @Test
    void notThrowEdgeCaseXEqual1YYEqual2() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When Then
        assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1, 2));
    }

    @DisplayName("x = 0.99, y = 0; Throws exception")
    @Test
    void testEdgeCaseXELowerThan2() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When Then
        assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.99, 0));
    }
}

package com.kodilla.spring.Calculator;

import com.kodilla.spring.calculator.Calculator;
import com.kodilla.spring.calculator.Display;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class CalculatorTestSuite {

    @Autowired
    private Calculator calculator;

    @Test
    void testCalculations() {
        //Given
        //When
        //Then
        assertAll(
                () -> assertEquals(4, calculator.add(2, 2)),
                () -> assertEquals(3, calculator.sub(6, 3)),
                () -> assertEquals(144, calculator.mul(12, 12)),
                () -> assertEquals(3, calculator.div(9, 3))
        );
    }
}

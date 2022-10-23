package com.kodilla.testing.user;

import java.util.LinkedList;
import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate(List<Integer> numbers) {
        List<Integer> filteredNumbers = new LinkedList<>();

        for (int number: numbers) {
            if (number % 2 == 0) {
                filteredNumbers.add(number);
            }
        }
        return filteredNumbers;
    }
}

package com.kodilla.testing;

import com.kodilla.testing.claculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        String input = "the user";
        SimpleUser simpleUser = new SimpleUser(input);

        String result = simpleUser.getUserName();

        if (result.equals(input)) {
            System.out.println("test OK");
        } else {
            System.out.println("error!");
        }

        //test - calculator

        if (Calculator.add(1, 2) == 3 && Calculator.subtract(2, 2) == 0) {
            System.out.println("Calculations OK!!!");
        } else {
            System.out.println("Error!");
        }
    }
}

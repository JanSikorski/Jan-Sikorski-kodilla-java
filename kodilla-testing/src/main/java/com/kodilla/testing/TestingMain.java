package com.kodilla.testing;

import com.kodilla.testing.claculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {

        String input = "the user";
        SimpleUser simpleUser = new SimpleUser(input);

        String result = simpleUser.getUserName();

        if (result.equals(input)) {
            System.out.println("test OK (SimpleUser class)");
        } else {
            System.out.println("error (SimpleUser class)!");
        }

        //test - calculator

        if (Calculator.add(1, 2) == 3) {
            System.out.println("Adding OK (Calculator class)");
        } else if (Calculator.subtract(2, 2) == 0) {
            System.out.println("Subtraction OK (Calculator class");
        } else {
            System.out.println("Error! Both wrong (Calculator class");
        }
    }
}

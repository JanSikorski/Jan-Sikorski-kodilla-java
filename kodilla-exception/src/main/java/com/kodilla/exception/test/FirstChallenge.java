package com.kodilla.exception.test;

public class FirstChallenge {
    public double divide(double a, double b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException();
        }

        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        doDivide(3,0);
    }

    private static void doDivide(double a, double b) {
        FirstChallenge firstChallenge = new FirstChallenge();
        try {
            System.out.println(firstChallenge.divide(a, b));
        } catch (ArithmeticException e) {
            System.out.println("Your Exception: " + e);
        } finally {
            System.out.println("End task");
        }
    }
}

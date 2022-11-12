package com.kodilla.exception.test;

public class ExceptionHandling {

    public void handleSecondChalange(double a, double b) {
        SecondChallenge secondChallenge = new SecondChallenge();
        try {
            System.out.println(secondChallenge.probablyIWillThrowException(a, b));
        } catch (Exception e){
            System.out.println("Your exception: " + e);
        } finally {
            System.out.println("End task");
        }
    }
}

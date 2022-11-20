package javabasics._10;

public class Main {
    public static void main(String[] args) {
        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFourBonus();
    }


    /**
     * 1: Using an if statement, print: "Comfortable clothes"
     *
     *    if the following conditions are met:
     *    isWarm is true and wearingShorts is true
     *    isWarm is false and wearingShorts is false
     *
     *    If these conditions are not met, print: "Uncomfortable clothes"
     */
    private static void exerciseOne() {
        System.out.println("\nExercise 1 - Comfortable clothes:");

        double temperatureInCelsius = 25;
        double isWarmTemperatureInCelsius = 20;
        boolean isWarm = temperatureInCelsius >= isWarmTemperatureInCelsius;
        boolean wearingShorts = true;

        // Write your code here
    }

    /**
     * 2: We are going to automate the club bouncer, write a condition with and statements
     *    to check if someone is able to enter the club.
     *
     *    Their shoeType must be "fancy", they must be over 18, and they must have at least 10 euros
     *
     *    Write 1 if statement that checks all of these, print "Come in" if they meet the condition
     *    or "stay out" if they don't.
     */
    private static void exerciseTwo() {
        System.out.println("\nExercise 2 - Club Bouncer:");
        String shoeType = "fancy";
        int age = 30;
        double eurosInPocket = 7.5;

        // Write your code here
    }

    /**
     * 3: Write an if else statement to calculate our grade
     *
     *    If our grade is 90%+ of the total, we print "A"
     *    If our grade is 80%+ of the total, we print "B"
     *    If our grade is 70%+ of the total, we print "C"
     *    If our grade is 60%+ of the total, we print "D"
     *    If our grade is under 60% of the total, we print "F"
     *
     *    If 'isTestRetry' we cap the maximum grade at C
     *
     *    Remember was can use ! to invert the value of a boolean, i.e. true -> false
     */
    private static void exerciseThree() {
        System.out.println("\nExercise 3 - Test Grader:");
        double ourTestScore = 8;
        double maxTestScore = 12;
        boolean isTestRetry = false;
        //Write your code here
    }


    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     *    Write a XOR condition, print "safe" if only one car is driving down the road,
     *    print "unsafe" if not.
     */
    private static void exerciseFourBonus() {
        System.out.println("\nExercise 4 (Optional) - One way road:");
        boolean carIsDrivingFromLeftToRight = true;
        boolean carIsDrivingFromRightToLeft = false;

        //Write your code here
    }
}

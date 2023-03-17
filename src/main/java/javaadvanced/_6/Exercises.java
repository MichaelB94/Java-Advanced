package javaadvanced._6;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) throws InterruptedException {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        enum Days {MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY}

        for (Days day : Days.values()) {
            System.out.println(day);
        }


    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        enum Seasons {
            SPRING("March,April,May"),
            SUMMER("June,July,August"),
            FALL("September,October,November"),
            WINTER("December,January,February");
            private String months;
            Seasons(String months) {
                this.months=months;
            }
            public String getMonths() {
                return months;
            }
        }
        System.out.println(Seasons.SUMMER.getMonths());
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input
     * and return the next state.
     */
    private static void exercise3() throws InterruptedException {
        System.out.println("\nExercise 3: ");
        // Your code here
        enum TrafficLight {
            RED, YELLOW, GREEN;

            public TrafficLight next() {
                return this.equals(RED) ? GREEN : this.equals(GREEN) ? YELLOW : this.equals(YELLOW) ? RED: null;
            }
        }
        TrafficLight current =TrafficLight.RED;
        System.out.println("Current state: " + current);

        for (int i = 0; i < 10; i++) {
            current = current.next();
            System.out.println("current state: " + current);
        }
    }

    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        enum Days {
            MONDAY(false), TUESDAY(false), WEDNESDAY(false), THURSDAY(false),
            FRIDAY(false), SATURDAY(true), SUNDAY(true);

            private final boolean isWeekend;

            Days(boolean isWeekend) {
                this.isWeekend = isWeekend;
            }
            public boolean isWeekend() {
                return isWeekend;
            }
        }

        Days day = Days.SATURDAY;
        if (day.isWeekend()) {
            System.out.println("Weekend: Party hard!");
        }else {
            System.out.println("It's not weekend!We had to work..");
        }

    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers,
     * and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");

        enum Operator {
            ADD {
                public double apply(double a, double b) {
                    return a + b;
                }
            },
            SUBTRACT {
                public double apply(double a, double b) {
                    return a - b;
                }
            },
            MULTIPLY {
                public double apply(double a, double b) {
                    return a * b;
                }
            },
            DIVIDE {
                public double apply(double a, double b) {
                    return a / b;
                }
            };

            public double apply(double a, double b){
                throw new AbstractMethodError("This method should not be overridden!");
            }
        }

        Operator operator = Operator.ADD;

        double num1 = 5;
        double num2 = 2;

        double result = operator.apply(num1, num2);
        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }


}

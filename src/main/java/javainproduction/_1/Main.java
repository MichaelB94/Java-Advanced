package javainproduction._1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nExercise 1: ");
        // Your code here
        int x = (int) (Math.random()*100);
        String greaterOrLesser = x >= 50 ? "is greater than 50" : "is less than 50";
        System.out.println(greaterOrLesser);

        System.out.println("\nExercise 2: ");
        Person p1 = new Person("John",18,"Via Colosseo");
        System.out.println(p1);

        System.out.println("\nExercise 3: ");

        BigInteger bigInteger = new BigInteger("30000000000000000");
        BigInteger bigIntegerDivide = bigInteger.divide(new BigInteger("3"));

        BigDecimal bigDecimal = new BigDecimal("0.00000000000000000000000000000000000000001");
        System.out.println("Big decimal value=" + bigDecimal);
        bigDecimal.divide(new BigDecimal("0.000000000000000000000000000000000000000000001"));
        System.out.println("Big decimal value=" + bigDecimal);
        System.out.println(bigInteger);
        System.out.println(bigIntegerDivide);
        BigDecimal bigDecimalDivide = bigDecimal.divide(new BigDecimal(Math.PI), RoundingMode.HALF_UP);
        System.out.println(bigDecimalDivide);

    }

}

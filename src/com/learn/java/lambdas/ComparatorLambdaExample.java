package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

    public static void main(String[] args) {
        /**
         * prior to java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer> () {
            @Override
            public int compare(Integer num1, Integer num2) {
                return num1.compareTo (num2); // 0 -> num1 == num2  // 1 -> num1 > num2  // -1 -> num1 < num2 
            }
        };

        System.out.println ("Result of the comparator is, comparator.compare (34,56) = " + comparator.compare (34,56));


        /**
         * Comparator Using Lambda
         */
        Comparator<Integer> comparatorLambda = (Integer num1, Integer num2) -> num1.compareTo (num2);
        System.out.println ("Result of the comparator using Lambda is, comparatorLambda.compare = " + comparatorLambda.compare (55,45));

        /**
         * We can do this way also:
         */
        Comparator<Integer> comparatorLambda1 = (num1, num2) -> num1.compareTo (num2);
        System.out.println ("Result of the comparator using Lambda is, comparatorLambda1.compare = " + comparatorLambda1.compare (23, 23));
    }
}



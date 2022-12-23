package com.learn.java.functionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

    static Predicate<Integer> isEven = (a) -> {return a%2==0;};
    static Predicate<Integer> isEvenAnother = (a) -> a%2==0;
    static Predicate<Integer> isNumberDivisibleBy5 = (a) -> a%5==0;

    /**
     * Here we need to used predicateAnd:
     */
    public static void predicateAnd(){
        System.out.println ("The predicate and result is: " + isEven.and(isNumberDivisibleBy5).test (20)); // this is known as predicate chaining.
        System.out.println ("The predicate and result is: " + isEven.and(isNumberDivisibleBy5).test (9)); // this is known as predicate chaining.
    }

    /**
     * Here we need to used predicateOr:
     */
    public static void predicateOr(){
        System.out.println ("The predicate or result is: " + isEven.or(isNumberDivisibleBy5).test (12)); // this is known as predicate chaining.
        System.out.println ("The predicate or result is: " + isEven.or(isNumberDivisibleBy5).test (9)); // this is known as predicate chaining.
    }

    /**
     * Here we need to used predicateNegate :
     */
    public static void predicateNegate (){
        System.out.println ("The predicate negate result is: " + isEven.and (isNumberDivisibleBy5).negate ().test (20)); // this is known as predicate chaining.
        System.out.println ("The predicate negate result is: " + isEven.or(isNumberDivisibleBy5).negate ().test (9)); // this is known as predicate chaining.
    }


    public static void main(String[] args) {

        /**
         * Check whether the number is Even or Not:
         */
        System.out.println (isEven.test (7));


        /**
         * We can do this way also only single line statement:
         */
        System.out.println (isEvenAnother.test (57));


        /**
         * Here we need to call the predicateAnd:
         */
        predicateAnd ();

        /**
         * Here we need to call the predicateOr:
         */
        predicateOr();

        /**
         * Here we need to call the predicateNegate:
         */
        predicateNegate ();

    }
}

package com.learn.java.lambdas;

public class RunnableLambdaExample {

    public static void main(String[] args) {

        /**
         * ()-> Single Statement or Expression; // Curly Braces are not needed.
         * ()->{<Multiple Statement>}; // Curly braces are needed for multiple statements.
         */



        /**
         * prior java 8
         */

        Runnable runnable = new Runnable () {

            @Override
            public void run() {
                System.out.println ("Inside Runnable 1");
            }
        };

        new Thread (runnable).start ();


        /**
         * java 8 Lambda syntax:
         */

        Runnable runnableLambda = () -> {
            System.out.println ("Inside Runnable 2");
        };
        new Thread (runnableLambda).start ();


        /**
         * Doing Simpler Ways:
         */
        Runnable runnableLambda1 = () -> System.out.println ("Inside Runnable 3");
        new Thread (runnableLambda1).start ();


        /**
         * In Legacy way:
         */
        new Thread(new Runnable(){
            @Override
            public void run() {
                System.out.println ("Inside Runnable 4");
            }
        }).start ();

        /**
         * We can do this way also:
         */
        new Thread (()-> System.out.println ("Inside Runnable 5")).start ();

        /**
         * If we have multiple line of statement write:
         */
        new Thread(()->{
            System.out.println ("Here multiple Statement is present.");
            System.out.println ("Like this!");
        }).start ();

    }
}

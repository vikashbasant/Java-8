package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerExample {

    public static void nameAndActivities(){
        BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println (name + " : " + activities);
        List<Student> studentList = StudentDataBase.getAllStudent ();
        studentList.forEach ((student) -> biConsumer.accept (student.getName (), student.getActivities ()));
    }


    public static void main(String[] args) {

        /**
         * Here we want print both the number:
         */
        BiConsumer<String, String> biConsumer = (a, b) -> {
            System.out.println ("Here we need to print both the number a = " + a + ", b = " + b);
        };
        biConsumer.accept ("java7", "java8");


        /**
         * Here We want multiplication of two number:
         */
        BiConsumer<Integer, Integer> multiply = (num1, num2) -> {
            System.out.println ("Multiplication of " + num1 + " * " + num2 + " = " + num1*num2);
        };
        multiply.accept (3,4);


        /**
         * Here We want division of two number:
         */
        BiConsumer<Integer, Integer> division = (num1, num2) -> {
            System.out.println ("Division of " + num1 + " / " + num2 + " = " + num1/num2);
        };
        division.accept (3,4);


        /**
         * At one go we need to call the both multiply and division method:
         */
        multiply.andThen(division).accept (5,4);

        nameAndActivities ();

    }
}

package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> c2 = (student) -> System.out.println (student);
    static Consumer<Student> c3 = (student) -> System.out.print (student.getName () + " ");
    static Consumer<Student> c4 = (student) -> System.out.println (student.getActivities ());


    public static void printName(){
        System.out.println ("================PrintName Done==================");
        List<Student> allStudent = StudentDataBase.getAllStudent ();
        allStudent.forEach (c2);
    }


    public static void printNameAndActivities(){
        System.out.println ("=================PrintNameAndActivities=================");
        List<Student> allStudent = StudentDataBase.getAllStudent ();
        allStudent.forEach (c3.andThen(c4)); // this concept is know as consumer chaining.
    }

    public static void printNameAndActivitiesUsingCondition(){
        System.out.println ("==================printNameAndActivitiesUsingCondition==================");
        List<Student> allStudent = StudentDataBase.getAllStudent ();
        allStudent.forEach ((student) -> {
            if(student.getGradeLevel () >= 3 && student.getGpa () >= 3.9){
                c3.andThen (c4).accept (student);
            }
        });
    }


    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println (s.toUpperCase());
        c1.accept ("vikash basant");

        printName ();
        printNameAndActivities ();
        printNameAndActivitiesUsingCondition ();
    }
}

package com.learn.java.functionalInterface;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static List<Student> allStudent = StudentDataBase.getAllStudent ();

    static Predicate<Student> isGradeLevel = (student) -> student.getGradeLevel () >= 3;

    static Predicate<Student> isGpa = (student) -> student.getGpa () >= 3.9;

    public static void filterStudentsByGradeLevel(){
        System.out.println ("==================filterStudentsByGradeLevel==========");

        // Now we can iterate over the allStudent:
        allStudent.forEach (student -> {
            if(isGradeLevel.test (student)) {
                System.out.println (student);
            }
        });
    }

    public static void filterStudentsByGpa(){
        System.out.println ("===============filterStudentsByGpa============");
        allStudent.forEach ((student) ->{
            if(isGpa.test (student)){
                System.out.println (student);
            }
        });
    }

    public static void filterStudentsUsingAnd(){
        System.out.println ("===============filterStudentsUsingAnd===========");
        allStudent.forEach (student -> {
            if(isGradeLevel.and(isGpa).test (student)){
                System.out.println (student);
            }
        });
    }


    public static void filterStudentsUsingOr(){
        System.out.println ("=============filterStudentsUsingOr==============");
        allStudent.forEach(student -> {
            if(isGradeLevel.or(isGpa).test (student)){
                System.out.println (student);
            }
        });
    }

    public static void filterStudentsUsingNegate(){
        System.out.println ("==========filterStudentsUsingNegate============");
        allStudent.forEach (student -> {
            if(isGradeLevel.and(isGpa).negate ().test (student)){
                System.out.println (student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentsByGradeLevel();
        filterStudentsByGpa();
        filterStudentsUsingAnd();
        filterStudentsUsingOr();
        filterStudentsUsingNegate();
    }
}

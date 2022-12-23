package com.learn.java.data;

import java.util.Arrays;
import java.util.List;

public class StudentDataBase {

    /**
     * There are total 6 students in database:
     * @return
     */

    public static List<Student> getAllStudent(){

        /**
         * 2nd grade students
         */
        Student student1 = new Student ("Vikas", 2, 3.5, "male", Arrays.asList ("cricket", "basketball", "ballyhoo"));
        Student student2 = new Student ("Rama", 2, 3.8, "male", Arrays.asList ("Racing", "chess", "ballyhoo"));

        /**
         * 3rd grade students
         */
        Student student3 = new Student("Emily", 3, 4.0, "female", Arrays.asList("swimming", "gymnastics","aerobics"));
        Student student4 = new Student("Dave",3,4.0,"male", Arrays.asList("swimming", "gymnastics","soccer"));

        /**
         * 4th grade students
         */
        Student student5 = new Student("Sophia",4,3.5,"female",Arrays.asList("swimming", "dancing","football"));
        Student student6 = new Student("James",4,3.9,"male", Arrays.asList("swimming", "basketball","baseball","football"));

        List<Student> students = Arrays.asList(student1, student2, student3, student4, student5, student6);
        return students;
    }
}

package com.university.students;

import com.university.students.domain.Graduate;
import com.university.students.domain.UndergraduateStudent;

public class Main {
    public static void main(String[] args) {

        UndergraduateStudent student1 = new UndergraduateStudent.Builder()
                .setStudentId("U01")
                .setName("Lethabo Makhura")
                .setEmail("lethabo467@mycput.ac.za")
                .setDepartment("informatics and design")
                .setCreditHours(10)
                .setScholarshipAmount(70000)
                .build();

        UndergraduateStudent student2 = new UndergraduateStudent.Builder()
                .copy(student1)
                .setName("lesego lebese")
                .build();


        Graduate grad1 = new Graduate.Builder()
                .setStudentId("S01")
                .setName("Mathebe Letago")
                .setEmail("mathebe@mycput.ac.za")
                .setDepartment("fashion Design")
                .setResearchAssistant(true)
                .setStipend(8000)
                .build();

        student1.displayStudentDetails();
        student2.displayStudentDetails();
        grad1.displayStudentDetails();
    }
}


package com.university.students.domain;

public abstract class Student {

    protected String studentId;
    protected String name;
    protected String email;
    protected String department;


    public Student(String studentId, String name, String email, String department) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.department = department;
    }

    public abstract double calculateTuition();
    public abstract String getStudentType();
    public abstract void displayStudentDetails();

    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getDepartment() {
        return department;
    }
}
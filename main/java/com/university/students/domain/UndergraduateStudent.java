package com.university.students.domain;


public class UndergraduateStudent extends Student {

    private int creditHours;
    private double scholarshipAmount;

    private UndergraduateStudent(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.creditHours = builder.creditHours;
        this.scholarshipAmount = builder.scholarshipAmount;
    }

    @Override
    public double calculateTuition() {
        double tuition = creditHours * 1500;
        double finalAmount = tuition - scholarshipAmount;
        return (finalAmount < 0) ? 0 : finalAmount;
    }

    @Override
    public String getStudentType() {
        return "Undergraduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Student Type: " + getStudentType());
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Credit Hours: " + creditHours);
        System.out.println("Scholarship: R" + scholarshipAmount);
        System.out.println("Tuition Fee: R" + calculateTuition());
        System.out.println("--------------------------------");
    }


    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private int creditHours;
        private double scholarshipAmount;

        public Builder setStudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setCreditHours(int creditHours) {
            this.creditHours = creditHours;
            return this;
        }

        public Builder setScholarshipAmount(double scholarshipAmount) {
            this.scholarshipAmount = scholarshipAmount;
            return this;
        }


        public Builder copy(UndergraduateStudent student) {
            this.studentId = student.studentId;
            this.name = student.name;
            this.email = student.email;
            this.department = student.department;
            this.creditHours = student.creditHours;
            this.scholarshipAmount = student.scholarshipAmount;
            return this;
        }

        public UndergraduateStudent build() {
            return new UndergraduateStudent(this);
        }
    }
}
package com.university.students.domain;


public class Graduate extends Student {

    private boolean researchAssistant;
    private double stipend;

    private Graduate(Builder builder) {
        super(builder.studentId, builder.name, builder.email, builder.department);
        this.researchAssistant = builder.researchAssistant;
        this.stipend = builder.stipend;
    }

    @Override
    public double calculateTuition() {
        double baseTuition = 25000;
        double finalAmount = researchAssistant ? baseTuition - stipend : baseTuition;
        return (finalAmount < 0) ? 0 : finalAmount;
    }

    @Override
    public String getStudentType() {
        return "Graduate Student";
    }

    @Override
    public void displayStudentDetails() {
        System.out.println("Student Type: " + getStudentType());
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Department: " + department);
        System.out.println("Research Assistant: " + researchAssistant);
        System.out.println("Stipend: R" + stipend);
        System.out.println("Tuition Fee: R" + calculateTuition());
        System.out.println("--------------------------------");
    }


    public static class Builder {
        private String studentId;
        private String name;
        private String email;
        private String department;
        private boolean researchAssistant;
        private double stipend;

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

        public Builder setResearchAssistant(boolean researchAssistant) {
            this.researchAssistant = researchAssistant;
            return this;
        }

        public Builder setStipend(double stipend) {
            this.stipend = stipend;
            return this;
        }


        public Builder copy(Graduate student) {
            this.studentId = student.studentId;
            this.name = student.name;
            this.email = student.email;
            this.department = student.department;
            this.researchAssistant = student.researchAssistant;
            this.stipend = student.stipend;
            return this;
        }

        public Graduate build() {
            return new Graduate(this);
        }
    }
}//

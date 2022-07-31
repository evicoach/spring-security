package com.columnhack.springsecurity.student;

public record Student(Integer studentId, String studentName) {
    public Integer getStudentId() {
        return studentId;
    }

    public String getStudentName() {
        return studentName;
    }

}

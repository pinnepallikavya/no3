package com.example.school.repository;

import java.util.List;

import com.example.school.model.Student;

public interface StudentRepository {
    List<Student> getAllStudents();

    Student getStudentById(int studentId);

    Student addStudent(Student student);

    int addStudents(List<Student> students);

    Student updateStudent(int studentId, Student updatedStudent);

    void deleteStudent(int studentId);
}

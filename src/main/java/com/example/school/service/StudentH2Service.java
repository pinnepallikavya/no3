package com.example.school.service;

import com.example.school.model.Student;
import com.example.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentH2Service {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public Student getStudentById(int studentId) {
        return studentRepository.getStudentById(studentId);
    }

    public Student addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    public int addStudents(List<Student> students) {
        return studentRepository.addStudents(students);
    }

    public Student updateStudent(int studentId, Student updatedStudent) {
        return studentRepository.updateStudent(studentId, updatedStudent);
    }

    public void deleteStudent(int studentId) {
        studentRepository.deleteStudent(studentId);
    }
}



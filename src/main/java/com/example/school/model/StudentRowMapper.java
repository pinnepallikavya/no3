package com.example.school.repository;

import com.example.school.model.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {

    @Override
    public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
        int studentId = resultSet.getInt("studentId");
        String studentName = resultSet.getString("studentName");
        String gender = resultSet.getString("gender");
        int standard = resultSet.getInt("standard");

        return new Student(studentId, studentName, gender, standard);
    }
}

package com.example.mvcexamples.FirstMvcproject.service;

import java.util.List;

import com.example.mvcexamples.FirstMvcproject.entity.Student;

public interface StudentService {
    List<Student> getAllStudents();
    Student saveStudent(Student student);
    Student getStudent(int id);
    Student updateStudent(Student student);
    void deleteStuById(int id);
}

package com.example.mvcexamples.FirstMvcproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.mvcexamples.FirstMvcproject.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}

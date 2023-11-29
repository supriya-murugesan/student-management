package com.example.mvcexamples.FirstMvcproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.mvcexamples.FirstMvcproject.entity.Student;
import com.example.mvcexamples.FirstMvcproject.repository.StudentRepository;
@Service
public class StudentServiceimpl implements StudentService{
          private StudentRepository studentrepo;
 
	public StudentServiceimpl(StudentRepository studentrepo) {
			super();
			this.studentrepo = studentrepo;
		}
	@Override
	public List<Student> getAllStudents() {
		return studentrepo.findAll();
	}
	
	public Student saveStudent(Student student) {
		return studentrepo.save(student);
	}
	@Override
	public Student getStudent(int id) {
		return studentrepo.findById(id).get();
	}
	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentrepo.save(student);
	}
	@Override
	public void deleteStuById(int id) {
		studentrepo.deleteById(id);
		
	}

}
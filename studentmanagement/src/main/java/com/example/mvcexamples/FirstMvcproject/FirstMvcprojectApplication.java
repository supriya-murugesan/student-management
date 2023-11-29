package com.example.mvcexamples.FirstMvcproject;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.mvcexamples.FirstMvcproject.entity.Student;
import com.example.mvcexamples.FirstMvcproject.repository.StudentRepository;



@SpringBootApplication
public class FirstMvcprojectApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(FirstMvcprojectApplication.class, args);
	}
   @Autowired
      private StudentRepository studentrepo;
	@Override
	public void run(String... args) throws Exception {
		/*Student s1=new Student("Riya", "M", "rm@gmail.com");
		studentrepo.save(s1);
		Student s2=new Student("Sarah", "K", "sara123@gmail.com");
		studentrepo.save(s2);
		Student s3=new Student("Priya", "D", "rm@gmail.com");
		studentrepo.save(s3);*/
		
	}
	

	
	
}

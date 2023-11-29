package com.example.mvcexamples.FirstMvcproject.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.mvcexamples.FirstMvcproject.entity.Student;
import com.example.mvcexamples.FirstMvcproject.service.StudentService;

@Controller
public class StudentController {
      private StudentService studentService;
	public StudentController(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
   @GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("Students",studentService.getAllStudents());
		return "students";
		
	}
   @GetMapping("/students/new")
   public String createStudentForm(Model model) {
	   Student student=new Student();
	   model.addAttribute("student",student);
	   return "create_stu";
}
   @PostMapping("/students")
   public String saveStudent(@ModelAttribute("student") Student student) {
	   studentService.saveStudent(student);
	   return "redirect:/students";
   }
   @GetMapping("/students/edit/{id}")
   public String editForm(@PathVariable int id,Model model) {
	   model.addAttribute("student",studentService.getStudent(id));
	   return "edit-stu";
}
   @PostMapping("/students/{id}")
   public String updateStudent(@PathVariable int id ,
		   @ModelAttribute("student") Student student){
	   Student eStudent =studentService.getStudent(id);
	    eStudent.setId(id);
	   eStudent.setfName(student.getfName());
	   eStudent.setlName(student.getlName());
	    eStudent.seteMail(student.geteMail());
	    studentService.updateStudent(eStudent);
	    return "redirect:/students";
	   
   }
   @GetMapping("/students/{id}")
   public String deleteStudent(@PathVariable int id) {
	   studentService.deleteStuById(id);
	   return "redirect:/students";
   }
}

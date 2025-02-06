package com.jsp.springmvc.studentdb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springmvc.studentdb.entity.Student;
import com.jsp.springmvc.studentdb.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping(value = "/add-student" , method = RequestMethod.POST)
	public ModelAndView addStudent(Student student) {
		return studentservice.addStudent(student);
		
	}

	@RequestMapping(value = "/diplay-student" , method = RequestMethod.GET)
	public ModelAndView displayAllStudent() {
		return studentservice.displayAllStudent();
		
	}
	
	@RequestMapping(value = "/delete-student-id" , method = RequestMethod.GET)
	public ModelAndView deleteStudentById(@RequestParam int studentId) {
		return studentservice.deleteStudent(studentId);
		
	}
	@RequestMapping(value = "/find-student-id" , method = RequestMethod.GET)
	public ModelAndView findStudentById(@RequestParam int studentId) {
		return studentservice.findStudentById(studentId);
		
	}
	
	@RequestMapping(value = "/update-student" , method = RequestMethod.POST)
	public ModelAndView updateStudent(Student student) {
		return studentservice.updateStudent(student);
		
	}


}

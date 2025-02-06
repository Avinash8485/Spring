package com.jsp.springmvc.studentdb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.springmvc.studentdb.entity.Student;
import com.jsp.springmvc.studentdb.repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;


	public ModelAndView addStudent(Student student) {

		//ADDING DATA TO THE DATABASE 
		studentRepository.addStudent(student);


		ModelAndView mav=new ModelAndView();
		mav.setViewName("Index.jsp");

		return mav;  // return new ModelAndView("Index.jsp");  (overloaded constructor is present in the ModelAndView class to invoke the page directly by using constructor)
	}



	public ModelAndView displayAllStudent() {
		List<Student> students = studentRepository.displayAllStudent();

		ModelAndView mav=new ModelAndView();
		mav.setViewName("DisplayAllStudent.jsp");
		mav.addObject("studentList",students);

		return mav;    // return new ModelAndView("DisplayAllStudent.jsp").addObject("studentList",students);  

	}


	public ModelAndView findStudentById(int studentId) {

		Student student = studentRepository.findStudentById(studentId);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("UpdateStudentView.jsp");
		mav.addObject("studentObject",student);

		return mav;			// return new ModelAndView("UpdateStudentView.jsp").addObject("studentObject",student);
	}




	public ModelAndView deleteStudent(int studentId) {

		studentRepository.deleteStudent(studentId);

		//      this is the manual way to fetch
		//		
		//		List<Student> students = studentRepository.displayAllStudent();
		//
		//		ModelAndView mav=new ModelAndView();
		//		mav.setViewName("DisplayAllStudent.jsp");
		//		mav.addObject("studentList",students);


		//		to make more automated
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:diplay-student");

		return mav;
	}



	public ModelAndView updateStudent(Student student) {

		studentRepository.updateStudent(student);


		//      this is the manual way to fetch
		//		
		//		List<Student> students = studentRepository.displayAllStudent();
		//
		//		ModelAndView mav=new ModelAndView();
		//		mav.setViewName("DisplayAllStudent.jsp");
		//		mav.addObject("studentList",students);


		//		to make more automated
		ModelAndView mav=new ModelAndView();
		mav.setViewName("redirect:diplay-student");


		return mav;     // return new ModelAndView("redirect:diplay-student");
	}



}

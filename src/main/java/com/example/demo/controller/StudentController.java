package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.StudentData;
import com.example.demo.model.Student;

@Controller
public class StudentController {
	@Autowired
	StudentData data;
	
	@RequestMapping("/")
	public String displayHome() {
		return "index.jsp";
	}
	@PostMapping("/addStudent")
	public String addStudent(Student student) {
		data.save(student);
		return "index.jsp";
	}
	@GetMapping("/getStudent")
	public ModelAndView getStudent(@RequestParam("id") int id) {
		ModelAndView mv = new ModelAndView("student-view.jsp");
		Student student = data.findById(id).orElse(new Student());
		mv.addObject("student",student);
		
		System.out.println(data.findByBranch("HM"));
		System.out.println(data.findByidGreaterThan(102));
		System.out.println(data.findByBranchSorted("HM"));
		
		return mv;
	}
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entitiy.Student;
import com.example.demo.repository.StudentRepository;


@Controller
public class StudentController {
	
	@Autowired
    private  StudentRepository repo; 
	
	@GetMapping("/")
	public String loadForm(org.springframework.ui.Model model) {
		model.addAttribute("student", new Student());
	     return "index";	
	}
	
	@PostMapping("/save")
	public String saveStudent(@ModelAttribute("student") Student s) {
		repo.save(s);
		return "redirect:/";
	} 
	
	
}

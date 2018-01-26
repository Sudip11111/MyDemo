package com.matic.project;

import java.util.Map;


import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.matic.project.model.Students;
import com.matic.project.service.StudentsService;


@Controller
public class StudentsController {
	
	private StudentsService studentService;
	
	
	
	

	public void setStudentService(StudentsService studentService) {
		this.studentService = studentService;
	}

	@RequestMapping("/index1")
	public String setupForm(Map<String, Object> map) {
		Students student = new Students();
		map.put("student", student);
		map.put("studentList", studentService.getAllStudents());
		return "student-form";
	}

	@RequestMapping(value = "/student.do", method = RequestMethod.POST)
	public String doActions(@ModelAttribute Students student, BindingResult result, @RequestParam String action,
			Map<String, Object> map) {
		Students studentResult = new Students();
		switch (action.toLowerCase()) {
		// only in Java7 you can put String in switch
		case "add":
			studentService.add(student);
			studentResult = student;
			break;
		case "edit":
			studentService.edit(student);
			studentResult = student;
			break;
		case "delete":
			studentService.delete(student.getId());
			studentResult = new Students();
			break;
		case "search":
			Students searchedStudent = studentService.getStudents(student.getId());
			studentResult = searchedStudent != null ? searchedStudent : new Students();
			break;
		}
		map.put("student", studentResult);
		map.put("studentList", studentService.getAllStudents());
		return "student-form";
	}
}

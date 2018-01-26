package com.matic.project.service.impl;



import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.matic.project.dao.StudentsDao;
import com.matic.project.model.Students;


public class StudentsServiceImpl {
	
	private StudentsDao studentDAO;
	
	public void setStudentDAO(StudentsDao studentDAO) {
		this.studentDAO = studentDAO;
	}
	
	@Transactional
	public void add(Students student) {
		studentDAO.add(student);
	}

	@Transactional
	public void edit(Students student) {
		studentDAO.edit(student);
	}

	@Transactional
	public void delete(int id) {
		studentDAO.delete(id);
	}

	@Transactional
	public Students getStudents(int id) {
		return studentDAO.getStudents(id);
	}

	@Transactional
	public List<?> getAllStudents() {
		return studentDAO.getAllStudents();
	}

}

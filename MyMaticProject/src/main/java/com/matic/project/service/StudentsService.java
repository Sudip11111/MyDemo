package com.matic.project.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.matic.project.model.Students;
@Service
public interface StudentsService {
	public void add(Students student);
	public void edit(Students student);
	public void delete(int id);
	public Students getStudents(int id);
	public List<?> getAllStudents();

}

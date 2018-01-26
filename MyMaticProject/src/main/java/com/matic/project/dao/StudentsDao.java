package com.matic.project.dao;

import java.util.List;

import com.matic.project.model.Students;

public interface StudentsDao {
	public void add(Students student);
	public void edit(Students student);
	public void delete(int id);
	public Students getStudents(int id);
	public List<?> getAllStudents();

}

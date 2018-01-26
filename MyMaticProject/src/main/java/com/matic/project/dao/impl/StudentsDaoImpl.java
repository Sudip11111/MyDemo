package com.matic.project.dao.impl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import com.matic.project.dao.StudentsDao;
import com.matic.project.model.Students;

@Repository
public class StudentsDaoImpl implements StudentsDao {

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void add(Students student) {
		sessionFactory.getCurrentSession().save(student);
		// TODO Auto-generated method stub

	}

	@Override
	public void edit(Students student) {
		sessionFactory.getCurrentSession().update(student);
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(int id) {
		sessionFactory.getCurrentSession().delete(getStudents(id));
		// TODO Auto-generated method stub

	}

	@Override
	public Students getStudents(int id) {
		return (Students) sessionFactory.getCurrentSession().get(Students.class, id);
		// TODO Auto-generated method stub

	}

	@Override
	public List<?> getAllStudents() {
		return sessionFactory.getCurrentSession().createQuery("from students").list();

		// TODO Auto-generated method stub

	}

}

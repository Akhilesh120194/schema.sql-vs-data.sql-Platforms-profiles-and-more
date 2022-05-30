package com.akhilexpress.demo.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.akhilexpress.demo.entities.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {

	/*
	 * @Autowired SessionFactory sessionFactory;
	 */
	
	@Autowired
	EntityManager entityManager;
	
	@Override
	public void saveStudent(Student student) {

	//	Session session = sessionFactory.openSession();
		Session session = entityManager.unwrap(Session.class);
		session.save(student);
		
	}

}

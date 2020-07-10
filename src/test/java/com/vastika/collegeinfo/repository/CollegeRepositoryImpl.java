package com.vastika.collegeinfo.repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vastika.collegeinfo.model.College;
import com.vastika.collegeinfo.util.HibernateUtil;

@Repository
public class CollegeRepositoryImpl implements CollegeRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void createCollege(College college) {
		Session session = HibernateUtil.getSession(sessionFactory);
		session.save(college);
	}

	@Override
	public List<College> getAllCollege() {
		return null;
	}

	@Override
	public College getCollegeById(Long id) {
		return null;
	}

	@Override
	public College updateById(Long id) {
		return null;
	}

	@Override
	public void deleteById(Long id) {

	}
}

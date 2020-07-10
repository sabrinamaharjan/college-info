package repository;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.vastika.smd.model.User;
import com.vastika.smd.util.HibernateUtil;

public class CollegeRepositoryImpl implements CollegeRepository {

	@Override
	public College createCollege(College College) {
		Session session = HibernateUtil.getSession(sessionFactory);
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

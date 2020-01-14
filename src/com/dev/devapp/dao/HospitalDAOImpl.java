package com.dev.devapp.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dev.devapp.dto.HospitalDTO;

public class HospitalDAOImpl implements HospitalDAO {

	public HospitalDAOImpl() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void saveHospital(HospitalDTO dto) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(HospitalDTO.class);
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(dto);
		tx.commit();
		session.close();
		sessionFactory.close();

	}

}

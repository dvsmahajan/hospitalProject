package com.dev.devapp.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.dev.devapp.HibernateUtil;
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

	@Override
	public HospitalDTO getHos(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public HospitalDTO getHospitalById(int id) {

		String hql = "select hdto from HospitalDTO hdto where hdto.hospitalId='" + id + "' ";
		Session session = HibernateUtil.getFactory().openSession();
		// preparing the query
		Query query = session.createQuery(hql);
		//processing the query
		HospitalDTO hospitalDTO = (HospitalDTO) query.uniqueResult();
		return hospitalDTO;
	}

	@Override
	public List<HospitalDTO> getAllHospital() {
		String hql = "from HospitalDTO ";
		Session session = HibernateUtil.getFactory().openSession();
		// preparing the query
		Query query = session.createQuery(hql);
		//processing the query
		List hospitalDTO =  query.list();
		return hospitalDTO;
	}

	@Override
	public List<Object[]> getHospitalNameAndLocationById() {
		String hql = "select hospitalName,hospitalLocation from HospitalDTO ";
		Session session = HibernateUtil.getFactory().openSession();
		// preparing the query
		Query query = session.createQuery(hql);
		//processing the query
		List<Object[]> objects =  query.list();
		return objects;
	}
	
	//update HospitalDTO set hospitalWebsite='' where hospitalName=''
	//delete from HospitalDTO where hospitalId=''

	/*
	 * @Override public HospitalDTO getHos(int id) { Configuration configuration
	 * = new Configuration(); configuration.configure();
	 * configuration.addAnnotatedClass(HospitalDTO.class); SessionFactory
	 * sessionFactory = configuration.buildSessionFactory(); Session session =
	 * sessionFactory.openSession(); HospitalDTO hospitalDTO=
	 * session.get(HospitalDTO.class, id); System.out.println(hospitalDTO);
	 * hospitalDTO =session.load(HospitalDTO.class, id);
	 * System.out.println(hospitalDTO.getHospitalLocation()); session.close();
	 * sessionFactory.close(); return hospitalDTO; }
	 */

}

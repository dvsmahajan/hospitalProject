package com.dev.devapp.test;

import java.util.List;

import com.dev.devapp.dao.HospitalDAO;
import com.dev.devapp.dao.HospitalDAOImpl;
import com.dev.devapp.dto.HospitalDTO;

public class Tester {
	
	public static void main(String[] args) {
		
		HospitalDTO dto = new HospitalDTO();
		dto.setHospitalId(90);
		dto.setHospitalName("Columbia Asia");
		dto.setHospitalWebsite("www.columbia.com");
		dto.setHospitalLocation("Hebbal");
		
		HospitalDAO hospitalDAO = new HospitalDAOImpl() ;
	//	hospitalDAO.saveHospital(dto);
	//HospitalDTO dto2=	hospitalDAO.getHos(1);	
	//System.out.println(dto2.getHospitalLocation());
	//HospitalDTO dto7=	hospitalDAO.getHos(1);	
		HospitalDTO hospitalDTO=	hospitalDAO.getHospitalById(1);
		System.out.println(hospitalDTO);
		List hospitalDTO1=	hospitalDAO.getAllHospital();
	//	System.out.println(hospitalDTO1);
	//java 8	
		//hospitalDTO1.forEach(System.out::println);
		for (Object object : hospitalDTO1) {
			System.out.println(object);
			
		}
		
	List<Object[]> objects=	hospitalDAO.getHospitalNameAndLocationById();
	/*System.out.println(objects.);*/
	for (Object[] objects2 : objects) {
		
		for (Object object : objects2) {
			System.out.println(object);
		}
	}
		
	}

}

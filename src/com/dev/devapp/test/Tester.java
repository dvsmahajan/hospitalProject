package com.dev.devapp.test;

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
		hospitalDAO.saveHospital(dto);
			
		
		
		
		
	}

}

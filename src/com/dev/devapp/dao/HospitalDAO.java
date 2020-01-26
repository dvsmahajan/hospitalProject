package com.dev.devapp.dao;

import java.util.List;

import com.dev.devapp.dto.HospitalDTO;

public interface HospitalDAO {
	
	
	public void saveHospital(HospitalDTO dto);
	public HospitalDTO getHos(int id);
	public HospitalDTO getHospitalById(int id);
	public List<HospitalDTO> getAllHospital();
	public List<Object[]> getHospitalNameAndLocationById(); 
	public HospitalDTO getHospitalByIdNamedParamter(int id);
	public void updateHospitalWebsiteByHospitalName(String website,String hospitalName);
	

}

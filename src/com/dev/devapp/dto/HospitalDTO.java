package com.dev.devapp.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "hospital_tble")
@NamedQuery(name="updatehospitalWebsiteByName",query="update HospitalDTO hdto set hdto.hospitalWebsite=? where hdto.hospitalName=?")
@NamedQuery(name="",query)
public class HospitalDTO implements Serializable {

	@Id
	@Column(name = "hospital_id")
	private int hospitalId;
	@Column(name = "hospital_name")
	private String hospitalName;
	@Column(name = "hospital_location")
	private String hospitalLocation;
	@Column(name = "hospital_website")
	private String hospitalWebsite;

	public HospitalDTO() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public String getHospitalLocation() {
		return hospitalLocation;
	}

	public void setHospitalLocation(String hospitalLocation) {
		this.hospitalLocation = hospitalLocation;
	}

	public String getHospitalWebsite() {
		return hospitalWebsite;
	}

	public void setHospitalWebsite(String hospitalWebsite) {
		this.hospitalWebsite = hospitalWebsite;
	}

	@Override
	public String toString() {
		return "HospitalDTO [hospitalId=" + hospitalId + ", hospitalName=" + hospitalName + ", hospitalLocation="
				+ hospitalLocation + ", hospitalWebsite=" + hospitalWebsite + "]";
	}

}

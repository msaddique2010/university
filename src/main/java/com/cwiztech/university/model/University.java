package com.cwiztech.university.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBLACADEMICSUNIVERSITY")
public class University {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long UNIVERSITY_ID;

	@Column(name = "UNIVERSITY_CODE")
	private String UNIVERSITY_CODE;

	@Column(name = "UNIVERSITY_NAME")
	private String UNIVERSITY_NAME;

	@Column(name = "UNIVERSITY_DESCRIPTION")
	private String UNIVERSITY_DESCRIPTION;

	public long getUNIVERSITY_ID() {
		return UNIVERSITY_ID;
	}

	public void setUNIVERSITY_ID(long uNIVERSITY_ID) {
		UNIVERSITY_ID = uNIVERSITY_ID;
	}

	public String getUNIVERSITY_CODE() {
		return UNIVERSITY_CODE;
	}

	public void setUNIVERSITY_CODE(String uNIVERSITY_CODE) {
		UNIVERSITY_CODE = uNIVERSITY_CODE;
	}

	public String getUNIVERSITY_NAME() {
		return UNIVERSITY_NAME;
	}

	public void setUNIVERSITY_NAME(String uNIVERSITY_NAME) {
		UNIVERSITY_NAME = uNIVERSITY_NAME;
	}

	public String getUNIVERSITY_DESCRIPTION() {
		return UNIVERSITY_DESCRIPTION;
	}

	public void setUNIVERSITY_DESCRIPTION(String uNIVERSITY_DESCRIPTION) {
		UNIVERSITY_DESCRIPTION = uNIVERSITY_DESCRIPTION;
	}
	
}

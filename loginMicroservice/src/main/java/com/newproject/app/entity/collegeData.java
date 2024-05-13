package com.newproject.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class collegeData {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long universityId;
	
	private String universityName;
	
	private String course;
	
	private long fees;
	
	private String location;
	
	private float xthCutoffPercent;
	
	private float xiithCutoffPercent;
	
	private String admissionLink;
	
	public collegeData() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public long getUniversityId() {
		return universityId;
	}

	public void setUniversityId(long universityId) {
		this.universityId = universityId;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public long getFees() {
		return fees;
	}

	public void setFees(long fees) {
		this.fees = fees;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getXthCutoffPercent() {
		return xthCutoffPercent;
	}

	public void setXthCutoffPercent(float xthCutoffPercent) {
		this.xthCutoffPercent = xthCutoffPercent;
	}

	public float getXiithCutoffPercent() {
		return xiithCutoffPercent;
	}

	public void setXiithCutoffPercent(float xiithCutoffPercent) {
		this.xiithCutoffPercent = xiithCutoffPercent;
	}


	public String getAdmissionLink() {
		return admissionLink;
	}


	public void setAdmissionLink(String admissionLink) {
		this.admissionLink = admissionLink;
	}


	public collegeData(long universityId, String universityName, String course, long fees, String location,
			float xthCutoffPercent, float xiithCutoffPercent, String admissionLink) {
		super();
		this.universityId = universityId;
		this.universityName = universityName;
		this.course = course;
		this.fees = fees;
		this.location = location;
		this.xthCutoffPercent = xthCutoffPercent;
		this.xiithCutoffPercent = xiithCutoffPercent;
		this.admissionLink = admissionLink;
	}


	@Override
	public String toString() {
		return "collegeData [universityId=" + universityId + ", universityName=" + universityName + ", course=" + course
				+ ", fees=" + fees + ", location=" + location + ", xthCutoffPercent=" + xthCutoffPercent
				+ ", xiithCutoffPercent=" + xiithCutoffPercent + ", admissionLink=" + admissionLink + "]";
	}

	


}

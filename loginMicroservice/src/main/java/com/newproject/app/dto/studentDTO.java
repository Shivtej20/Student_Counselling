package com.newproject.app.dto;

public class studentDTO {
	
	private String name;

	private String email;
	
	private String locaion;
	
	private String xthPercent;
	
	private String xiithPercent;
	
	

	
	
	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocaion() {
		return locaion;
	}

	public void setLocaion(String locaion) {
		this.locaion = locaion;
	}

	public String getXthPercent() {
		return xthPercent;
	}

	public void setXthPercent(String xthPercent) {
		this.xthPercent = xthPercent;
	}

	public String getXiithPercent() {
		return xiithPercent;
	}

	public void setXiithPercent(String xiithPercent) {
		this.xiithPercent = xiithPercent;
	}

	@Override
	public String toString() {
		return "studentDTO [name=" + name + ", email=" + email + ", locaion=" + locaion + ", xthPercent=" + xthPercent
				+ ", xiithPercent=" + xiithPercent + "]";
	}
	
	

}

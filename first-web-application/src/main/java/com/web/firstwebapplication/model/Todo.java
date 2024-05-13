package com.web.firstwebapplication.model;

import java.util.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Todo {
	
	@Id
	@GeneratedValue
    private int sno;
    private String user;

    @Size(min=10, message="Enter at least 10 Characters...")
    private String StudentName;
    
    private long rollNumber;
    private Date checkingDate;
    private long phno;

  //  private String   securityName;
  
   
	
    public Todo() {
    	super();
    }



	public int getSno() {
		return sno;
	}



	public void setSno(int sno) {
		this.sno = sno;
	}



	public String getUser() {
		return user;
	}



	public void setUser(String user) {
		this.user = user;
	}



	public String getStudentName() {
		return StudentName;
	}



	public void setStudentName(String studentName) {
		StudentName = studentName;
	}



	public long getRollNumber() {
		return rollNumber;
	}



	public void setRollNumber(long rollNumber) {
		this.rollNumber = rollNumber;
	}



	public Date getCheckingDate() {
		return checkingDate;
	}



	public void setCheckingDate(Date checkingDate) {
		this.checkingDate = checkingDate;
	}



//	public String getSecurityName() {
//		return securityName;
//	}
//
//
//
//	public void setSecurityName(String securityName) {
//		this.securityName = securityName;
//	}



	public long getPhno() {
		return phno;
	}



	public void setPhno(long phno) {
		this.phno = phno;
	}



	public Todo(int sno, String user, @Size(min = 10, message = "Enter at least 10 Characters...") String studentName,
			long rollNumbere,  long phno, Date checkingDate) {
		super();
		this.sno = sno;
		this.user = user;
		StudentName = studentName;
		this.rollNumber = rollNumber;
		this.checkingDate = checkingDate;
		//this.securityName = securityName;
		this.phno = phno;
	}



	



	@Override
	public int hashCode() {
		return Objects.hash(StudentName, checkingDate, phno, rollNumber, sno, user);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		return Objects.equals(StudentName, other.StudentName) && Objects.equals(checkingDate, other.checkingDate)
				&& phno == other.phno && rollNumber == other.rollNumber && sno == other.sno
				&& Objects.equals(user, other.user);
	}



	@Override
	public String toString() {
		return "Todo [sno=" + sno + ", user=" + user + ", StudentName=" + StudentName + ", rollNumber=" + rollNumber
				+ ", checkingDate=" + checkingDate +  ", phno=" + phno + "]";
	}
   
   
}

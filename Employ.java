package com.java.model;

public class Employ {

	private int empno;
	private String name;
	private Gender gender;
	private Department dept;
	private Designation desig;
	private double basic;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public Designation getDesig() {
		return desig;
	}
	public void setDesig(Designation desig) {
		this.desig = desig;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public Employ(int empno, String name, Gender gender, Department dept, Designation desig, double basic) {
		super();
		this.empno = empno;
		this.name = name;
		this.gender = gender;
		this.dept = dept;
		this.desig = desig;
		this.basic = basic;
	}
	public Employ() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employ [empno=" + empno + ", name=" + name + ", gender=" + gender + ", dept=" + dept + ", desig="
				+ desig + ", basic=" + basic + ", getEmpno()=" + getEmpno() + ", getName()=" + getName()
				+ ", getGender()=" + getGender() + ", getDept()=" + getDept() + ", getDesig()=" + getDesig()
				+ ", getBasic()=" + getBasic() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
}

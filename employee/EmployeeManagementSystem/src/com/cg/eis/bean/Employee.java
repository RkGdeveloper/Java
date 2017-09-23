package com.cg.eis.bean;

public class Employee {

	private int eId;
	private String eName;
	private String eDesign;
	private String eInsuraceScheme;
	private double eSalary;
	
	public int geteId() {
		return eId;
	}
	public void seteId(int eId) {
		this.eId = eId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String geteDesign() {
		return eDesign;
	}
	public void seteDesign(String eDesign) {
		this.eDesign = eDesign;
	}
	public String geteInsuraceScheme() {
		return eInsuraceScheme;
	}
	public void seteInsuraceScheme(String eInsuraceScheme) {
		this.eInsuraceScheme = eInsuraceScheme;
	}
	public double geteSalary() {
		return eSalary;
	}
	public void seteSalary(double eSalary) {
		this.eSalary = eSalary;
	}
	
	
}

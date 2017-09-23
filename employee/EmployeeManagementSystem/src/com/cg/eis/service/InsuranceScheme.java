package com.cg.eis.service;

import com.cg.eis.bean.Employee;

interface EmployeeServiceInterface{
	
	void calculateInsuranceScheme(Employee e);
	
}


public class InsuranceScheme implements EmployeeServiceInterface {

	private String insuranceScheme; 
	@Override
	public void calculateInsuranceScheme(Employee e) {
		// TODO Auto-generated method stub
		if(e.geteSalary() < 5000 && e.geteDesign().equals("Clerk"))
		{
			e.seteInsuraceScheme("No Scheme");
		}
		
		else if(e.geteSalary() < 20000 && e.geteDesign().equals("System Associate"))
		{
			e.seteInsuraceScheme("Scheme C");
		}
		else if(e.geteSalary() < 40000 && e.geteDesign().equals("Programmer"))
		{
			e.seteInsuraceScheme("Scheme B");
		}
		else if(e.geteDesign().equals("Manager"))
			e.seteInsuraceScheme("Scheme A");
		else
			e.seteInsuraceScheme("No Scheme");
				
		
	}
	public String getInsuranceScheme() {
		return insuranceScheme;
	}
	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	
	
}

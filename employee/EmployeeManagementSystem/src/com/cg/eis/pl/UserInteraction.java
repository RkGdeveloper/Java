package com.cg.eis.pl;

import java.util.Scanner;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.InsuranceScheme;

public class UserInteraction {

	public static void main(String[] args) {
		
		
		Employee emp = new Employee();
		InsuranceScheme ic = new InsuranceScheme();
		
		
		UserDetails ud = new UserDetails();
		ud.acceptEmployeeDetails(emp);
		ic.calculateInsuranceScheme(emp);
		
		/*
		System.out.println("Employee Details\n-------------------------------");
		System.out.println("Employee Id: "+emp.geteId()+"\nEmployee Name: "+emp.geteName()+"\nEmployee Designation: "+emp.geteDesign()+"\nEmployee Salary: "+emp.geteSalary()+"\nEmployee Insurance Scheme: "+emp.geteInsuraceScheme());
		
		*/
		ud.printEmployeeDetails(emp);
		
		
		
	}
	
}


class UserDetails
{
	Scanner sc = new Scanner(System.in);
	
	void acceptEmployeeDetails(Employee e)
	{
		System.out.println("Enter Employee Details : \nEnter Employee Id ");
		e.seteId(sc.nextInt());
		sc.nextLine();
		
		System.out.println("Enter Employee Name ");
		e.seteName(sc.nextLine());
		
		System.out.println("Enter Employee Designation ");
		e.seteDesign(sc.nextLine());
		
		System.out.println("Enter Employee Salary");
		e.seteSalary(sc.nextDouble());
		
	}
	
	void printEmployeeDetails(Employee e)
	{
		System.out.println("Employee Details\n-------------------------------");
		System.out.println("Employee Id: "+e.geteId()+"\nEmployee Name: "+e.geteName()+"\nEmployee Designation: "+e.geteDesign()+"\nEmployee Salary: "+e.geteSalary()+"\nEmployee Insurance Scheme: "+e.geteInsuraceScheme());
		
	}

}

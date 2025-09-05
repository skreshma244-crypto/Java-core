package com.training.core.sample;

import java.util.Scanner;

public class Employee {
 int employeeId;
 String firstName;
 String secondName;
 String designation;
 
 
 public void setEmployeeData()
 {
	  Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the Employee Id: ");
	   employeeId =sc.nextInt();
	   System.out.println("Enter Employee First Name: ");
	   firstName=  sc.next();
	   System.out.println("Enter Employee Second Name: ");
	   secondName=  sc.next();
	   System.out.println("Enter the Employee Designation");
	   designation = sc.next();
 }

 public void getEmployeeInfo() {
	  System.out.println(employeeId);
	  System.out.println(firstName);
	  System.out.println(secondName);
	  System.out.println(designation);
	  
 }
 
	public static void main(String[] args) {
		Employee prod = new Employee();
		prod.setEmployeeData();
		prod.getEmployeeInfo();
	}
    
}

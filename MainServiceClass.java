package com.deptdetails.service;

import com.deptdetails.departments.*;

public class MainServiceClass {
	
	public static void main(String[] args) {
		
		AdminDepartment AD = new AdminDepartment();
		TechDepartment TD = new TechDepartment();
		HRDepartment HRD = new HRDepartment();
		
		System.out.println("Welcome to " + AD.departmentName());
		System.out.println(AD.getTodaysWork());
		System.out.println(AD.getWorkDeadline());
		System.out.println(AD.isTodayAHoliday());
		System.out.println();
		
		System.out.println("Welcome to " + HRD.departmentName());
		System.out.println(HRD.doActivity());
		System.out.println(HRD.getTodaysWork());
		System.out.println(HRD.getWorkDeadline());
		System.out.println(HRD.isTodayAHoliday());
		
		System.out.println();
		
		System.out.println("Welcome to " + TD.departmentName());
		System.out.println(TD.getTodaysWork());
		System.out.println(TD.getWorkDeadline());
		System.out.println(TD.getTechStackInformation());
		System.out.println(TD.isTodayAHoliday());
	}
	

}

package com.gaurav.polymorphism;

class Employee
{
	int workingDays;
	int perDaySalary;
	double totalSalary;

	void calcSalary()
	{
		workingDays = 22;
		perDaySalary = 3000;

		totalSalary = workingDays * perDaySalary;
		System.out.println("Employee Salary : ₹" + totalSalary);
	}
}

public class JavaDeveloperOverriding extends Employee
{
	@Override
	void calcSalary()
	{
		workingDays = 28;
		perDaySalary = 5000;

		totalSalary = workingDays * perDaySalary;
		System.out.println("Java Developer Salary : ₹" + totalSalary);
	}

	public static void main(String[] args)
	{
		Employee e1 = new Employee();
		e1.calcSalary();

		JavaDeveloperOverriding j1 = new JavaDeveloperOverriding();
		j1.calcSalary();
	}
}
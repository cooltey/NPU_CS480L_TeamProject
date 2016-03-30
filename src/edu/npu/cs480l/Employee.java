package edu.npu.cs480l;


public class Employee extends Store{
	
//	 -Employees - sub class
//	  (employee_name, hire_date, salary)
	 String employee_name;
	 String hire_date;
	 String salary;
	 
	 public Employee(){
		 employee_name 	= "Obama";
		 hire_date		= "March 1st, 2000";
		 salary 		= "$123,450";
	 }
	 
	 public Employee(String get_employee_name, String get_hire_date, String get_salary){
		 employee_name 	= get_employee_name;
		 hire_date		= get_hire_date;
		 salary 		= get_salary;
	 }


	public String getEmployeeName() {
		return employee_name;
	}

	public void setEmployeeName(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getHireDate() {
		return hire_date;
	}

	public void setHireDate(String hire_date) {
		this.hire_date = hire_date;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	@Override
	public void getInformation() {
		// TODO Auto-generated method stub
		super.getInformation();

		System.out.println("Employee Name: " + getEmployeeName());
		System.out.println("Hire Date: " + getHireDate());
		System.out.println("Salary: " + getSalary());
	}
}
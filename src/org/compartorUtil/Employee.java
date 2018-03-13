package org.compartorUtil;

import java.util.Comparator;

public class Employee implements Comparable<Integer>{
	private Integer ENumber;
	private String Ename;
	private String EDept;
	private Long salary;
	
	public Employee(Integer eNumber, String ename, String eDept, Long salary) {
		super();
		ENumber = eNumber;
		Ename = ename;
		EDept = eDept;
		this.salary = salary;
	}
	public Integer getENumber() {
		return ENumber;
	}
	public void setENumber(Integer eNumber) {
		ENumber = eNumber;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	public String getEDept() {
		return EDept;
	}
	public void setEDept(String eDept) {
		EDept = eDept;
	}
	public Long getSalary() {
		return salary;
	}
	public void setSalary(Long salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Integer ENumber) {
		return this.ENumber.compareTo(ENumber);
	}
	
	public static Comparator<Employee> COMPARETO_ENAME = new Comparator<Employee>() {
		@Override
		public int compare(Employee arg0, Employee arg1) {
			return arg0.Ename.compareTo(arg1.Ename);
		};
	};
	
	public static Comparator<Employee> COMPARETO_SALARY = new Comparator<Employee>() {
		@Override
		public int compare(Employee arg0, Employee arg1) {
			return arg0.salary.compareTo(arg1.salary);
		}
	};
	
	@Override
	public String toString() {
		return "ENumber:"+ENumber+" EName:"+Ename;
	}
}

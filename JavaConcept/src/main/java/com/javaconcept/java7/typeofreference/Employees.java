package com.javaconcept.java7.typeofreference;

public class Employees {
	private Integer EmployeesId;
	private String EmployeesName;
	private Double salary;
	private String email;

	public Employees(Integer EmployeesId, String EmployeesName, Double salary, String email) {
		super();
		this.EmployeesId = EmployeesId;
		this.EmployeesName = EmployeesName;
		this.salary = salary;
		this.email = email;
	}

	public Integer getEmployeesId() {
		return EmployeesId;
	}

	public String getEmployeesName() {
		return EmployeesName;
	}

	public Double getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((EmployeesId == null) ? 0 : EmployeesId.hashCode());
		result = prime * result + ((EmployeesName == null) ? 0 : EmployeesName.hashCode());
		result = prime * result + ((salary == null) ? 0 : salary.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employees other = (Employees) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (EmployeesId == null) {
			if (other.EmployeesId != null)
				return false;
		} else if (!EmployeesId.equals(other.EmployeesId))
			return false;
		if (EmployeesName == null) {
			if (other.EmployeesName != null)
				return false;
		} else if (!EmployeesName.equals(other.EmployeesName))
			return false;
		if (salary == null) {
			if (other.salary != null)
				return false;
		} else if (!salary.equals(other.salary))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Employees [EmployeesId=" + EmployeesId + ", EmployeesName=" + EmployeesName + ", salary=" + salary
				+ ", email=" + email + "]";
	}
}

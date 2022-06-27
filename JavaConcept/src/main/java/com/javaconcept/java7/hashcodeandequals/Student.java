package com.javaconcept.java7.hashcodeandequals;

public class Student {

	Integer id;
	String name;
	Integer rollNo;

	public Student(Integer id, String name, Integer rollNo) {
		super();
		this.id = id;
		this.name = name;
		this.rollNo = rollNo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", rollNo=" + rollNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + this.getId();
		return result;
		// return this.getId();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || getClass() != obj.getClass())
			return false;
		if (this == obj)
			return true;

		Student other = (Student) obj;
		return (this.getId() == other.getId());

	}

}

package com.javaconcept.java8.stream.api;


public class Notes {
	int id;
	String noteName;
	int pageNo;
	public Notes(int id, String noteName, int pageNo) {
		super();
		this.id = id;
		this.noteName = noteName;
		this.pageNo = pageNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNoteName() {
		return noteName;
	}
	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	
	

	
}

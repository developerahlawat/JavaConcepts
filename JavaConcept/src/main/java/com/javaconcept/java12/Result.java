package com.javaconcept.java12;

public class Result {
		  private Long count;
		  private Integer sum;

		  public Result(Long count, Integer sum) {
		    this.count = count;
		    this.sum = sum;
		  }

		  @Override
		  public String toString() {
		    return "{" +
		      "count=" + count +
		      ", sum=" + sum +
		    '}';
		  }}

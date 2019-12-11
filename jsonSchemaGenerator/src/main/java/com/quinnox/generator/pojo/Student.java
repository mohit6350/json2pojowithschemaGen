package com.quinnox.generator.pojo;

import java.util.Arrays;

public class Student {

	private String name;
	private int roll;
	private String[] subjects;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", roll=" + roll + ", subjects=" + Arrays.toString(subjects) + "]";
	}

}

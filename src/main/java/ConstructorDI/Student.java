package ConstructorDI;

import java.util.List;

public class Student {
	private int id;
	private String name;
	private float age;
	private String gender;
	private String department;
	private boolean graduated;
	private List<String> certifications;
	public Student(int id, String name, float age, String gender, String department, boolean graduated,
			List<String> certifications) {
		//super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
		this.graduated = graduated;
		this.certifications = certifications;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", department="
				+ department + ", graduated=" + graduated + ", certifications=" + certifications + "]";
	}
	

}

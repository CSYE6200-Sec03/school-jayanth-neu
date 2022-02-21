package edu.neu.csye6200;

public class Student extends Person {
	
	private double gpa;

    public Student(int id, int age, String lastName, String firstName, double gpa) {
    	super(id,age,lastName,firstName);
		this.gpa = gpa;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return "id: " + this.getId() + ", age: " + this.getAge() + ", firstName: " 
				+ this.getFirstName() + ", lastName: " + this.getLastName() + ", gpa: " + this.gpa;	
	}

	public static int compareByGpa(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return Double.compare(o1.gpa, o2.gpa);
	}

	
}






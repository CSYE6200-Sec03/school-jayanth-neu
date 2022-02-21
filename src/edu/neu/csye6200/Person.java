package edu.neu.csye6200;

public class Person{
	
	private int id;
	private int age;
	private String firstName;
	private String lastName;

    public Person(int id, int age, String firstName, String lastName) { 	
    	this.id = id;
		this.age = age;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}	

	public static int compareById(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getId(), o2.getId());
	}
	
	public static int compareByAge(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getAge(), o2.getAge());
	}
	
	public static int compareByLastName(Person o1, Person o2) {
		// TODO Auto-generated method stub
		return o1.getLastName().compareToIgnoreCase(o2.getLastName());	
	}

}






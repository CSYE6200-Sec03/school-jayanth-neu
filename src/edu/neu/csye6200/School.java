package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class School {
	
	private List<Student> studentRoster;
    private List<Person> personRoster;
        
    public School() {
    	personRoster = new ArrayList<>();
    	studentRoster = new ArrayList<>();
    }

    public void addToStudentRoster(Student student) {
        studentRoster.add(student);
    }
    
    public void addToPersonRoster(Person person) {
        personRoster.add(person);
    }
   
    public List<Student> getStudentRoster() {
        return studentRoster;
    }
    
    public List<Person> getPersonRoster() {
        return personRoster;
    }
        
    public void sortStudentRoster() {
        System.out.println("*Sorting StudentRoster based on ID*\n");
        studentRoster.sort(Person::compareById);        
        for(Student x : studentRoster) System.out.println(x);
        
        System.out.println("\n\n*Sorting StudentRoster based on Age*\n");
        studentRoster.sort(Person::compareByAge);        
        for(Student x : studentRoster) System.out.println(x);
        
        System.out.println("\n\n*Sorting StudentRoster based on LastName*\n");
        studentRoster.sort(Person::compareByLastName);        
        for(Student x : studentRoster) System.out.println(x);
        
        System.out.println("\n\n*Sorting StudentRoster based on Gpa*\n");
        studentRoster.sort(Student::compareByGpa);        
        for(Student x : studentRoster) System.out.println(x);       
    }

	public void sortPersonRoster() {
        System.out.println("\n\n*Sorting PersonRoster based on ID*\n");
        personRoster.sort(Person::compareById);        
        for(Person x : personRoster) System.out.println(x);
        
        System.out.println("\n\n*Sorting PersonRoster based on Age*\n");
        personRoster.sort(Person::compareByAge);        
        for(Person x : personRoster) System.out.println(x);
        
        System.out.println("\n\n*Sorting PersonRoster based on LastName*\n");
        personRoster.sort(Person::compareByLastName);        
        for(Person x : personRoster) System.out.println(x);
        
        System.out.println("\n\n*Sorting PersonRoster based on Gpa*\n");
        List<Student> a = new ArrayList<>();
        for(Person x: personRoster) a.add((Student)x);
        a.sort(Student::compareByGpa);        
        for(Student x : a) System.out.println(x);    
    }
	
     public static void demo() {

         School school = new School();
         
         school.addToStudentRoster(new Student(40,29,"peters","daniel",3.8));
         school.addToStudentRoster(new Student(20,27,"patel","Munaf",3.9));
         school.addToStudentRoster(new Student(50,26,"sharma","rohit",2.4));
         school.addToStudentRoster(new Student(30,30,"sehwag","virender",3.2));
         school.addToStudentRoster(new Student(10,28,"rama","tej",3.1));
         
         school.addToPersonRoster(new Student(90,33,"komaram","bheem",2.7));
         school.addToPersonRoster(new Student(100,32,"kalyan","pavan",3.3));
         school.addToPersonRoster(new Student(80,34,"nairobi","tokyo",3.2));
         school.addToPersonRoster(new Student(60,35,"green","rachel",3.8));
         school.addToPersonRoster(new Student(70,31,"stinson","barney",4));

         school.sortStudentRoster();
         school.sortPersonRoster();      
     	}    
	}

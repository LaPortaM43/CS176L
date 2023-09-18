package edu.monmouth.inclass1;

public class Exercise1 {

	public static void main(String[] args) {
		Person person = new Person(); // person = reference (4bytes). Person = Person object 
		
		System.out.println(person.getAge());
		System.out.println(person.getName());
		System.out.println();
		
		person.setAge(20);
		person.setName("Matthew LaPorta");
		
		System.out.println(person.getAge());
		System.out.println(person.getName());
		System.out.println();
		
		Person personTwo = new Person();
		
		personTwo.setAge(59);
		personTwo.setName("Keanu Reeves");
		
		System.out.println(personTwo.getAge());
		System.out.println(personTwo.getName());
			
	}

}

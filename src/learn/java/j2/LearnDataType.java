package learn.java.j2;

import java.util.Scanner;

public class LearnDataType {

	public static void main(String[] args) {
		
		/*
		int x =10; 
		int y =20;
		
		
		
		System.out.println("Hello world!");
		System.out.println("The number is:" + x);
		System.out.println("The number is:" + y);
		System.out.println("My name is hafeez");
		*/
		
		String name;
		int age;
		Float height;
		String tel;
		int salary;
		
		
		Scanner person = new Scanner (System.in);
		
		System.out.println("Please enter your name");
		name = person.nextLine();
		//System.out.println("Answer # 1:User name is: " + name);
		
		
		System.out.println("Please enter your age");
		age = person.nextInt();
		//System.out.println("Answer # 2:User is " + age + " years old");
		
		
		System.out.println("Please enter your height ");
		height = person.nextFloat(); 
		//System.out.println("Answer # 3 :User's Height is: " + height + " feet");
		
		
		System.out.println("Please enter your conttact number");
		tel = person.next();
		//System.out.println("Answer # 4: User contact number is " + tel );
		
		//System.out.println("Question # 5 : What is your Annual salary?");
		System.out.println("Please enter your anual salary");
		salary = person.nextInt();
		//System.out.println("Answer # 5 : User's salary is "+ "$" + salary + "/year");
		
		
		
	
	}
}
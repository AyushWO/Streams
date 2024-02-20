package com.xyz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeCRUD {

	public static void main(String[] args) {
		Scanner scInt = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);
		List<Employee> empList = new ArrayList<Employee>();
		int ch=1;
		while(ch>0) {
			System.out.println("-----------------------------------------------------------------");
			System.out.println("Enter 1 if you want to CREATE an employee");
			System.out.println("Enter 2 if you want to READ all the employees");
			System.out.println("Enter 3 if you want to UPDATE an employee");
			System.out.println("Enter 4 if you want to DELETE an employee");
			System.out.print("Please give an input: ");
			ch = scInt.nextInt();
			
			switch (ch) {
			case 1:
				System.out.print("Please enter the employee employeeID(only numbers): ");
				int id = scInt.nextInt();
				System.out.print("Please enter the employee name(only character): ");
				String name = scString.nextLine();
				System.out.print("Please enter the employee skills(only character): ");
				String skills = scString.nextLine();
				System.out.print("Please enter the employee age(only numbers): ");
				int age = scInt.nextInt();
				System.out.print("Please enter the employee salary(only numbers): ");
				int salary = scInt.nextInt();
				System.out.print("Please enter the employee joiningDate(only character): ");
				String JD = scString.nextLine();
				
				empList.add(new Employee(id,name,skills,age,salary,JD));
			break;
				
			case 2:
				System.out.println("Your Employee DATA: ");
				empList.stream().sorted().forEach(s->System.out.println(s));;
			break;
			
			case 3:
				System.out.print("Please let us know which Employee ID you want to update: ");
				id = scInt.nextInt();
				empList.stream().map(e->{
					
					if(e.getEmployeeID()==id) {
						System.out.print("Please enter the new name: ");
						String newName = scString.nextLine();
						e.setName(newName);
						
						System.out.print("Please enter the new skills: ");
						String newSkills = scString.nextLine();
						e.setSkills(newSkills);
						
						System.out.print("Please enter the new age: ");
						int newAge = scInt.nextInt();
						e.setAge(newAge);
						
						System.out.print("Please enter the new salary: ");
						int newSalary = scInt.nextInt();
						e.setSalary(newSalary);
						
						System.out.print("Please enter the new joiningDate: ");
						String newJD = scString.nextLine();
						e.setJoiningDate(newJD);
					}
					System.out.println("Successfully updated...");
					
					return e;
				}).collect(Collectors.toList());
				
			break;
			
			case 4:
				System.out.print("Please let us know which Employee ID you want to delete: ");
				id = scInt.nextInt();
				empList.removeIf(e->e.getEmployeeID()==id);
				System.out.println("Successfully deleted...");
			break;
			
			default: System.out.println("\nThis is an invalid input. Please enter a valid input");
			}
			System.out.print("-----------------------------------------------------------------\n\n\n");
		}
	}
}

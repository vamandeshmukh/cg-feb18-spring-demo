package cg.feb18.spring.demo;

import cg.feb18.spring.demo.model.Employee;

/**
 * 
 * @author Vaman Deshmukh
 *
 */

// Bean = object 
// IoC = Inversion of Control 
// DI = Dependency Injection 
// Container = bean container 

public class App {

	public static void main(String[] args) {

		System.out.println("Hello World!");

		Employee emp = new Employee(101, "Sonu", 50000); // 4 , 8, 8 = 20 100 2000
		System.out.println(emp.toString());

	}
}

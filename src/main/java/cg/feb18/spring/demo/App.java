package cg.feb18.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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

		System.out.println("Start");

		// pure Java approach
//		Employee emp = new Employee(101, "Sonu", 50000); // 4 , 8, 8 = 20 100 2000

		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");

		Employee emp = context.getBean(Employee.class);

		System.out.println(emp.toString());

		System.out.println("End");

		((AbstractApplicationContext) context).close();

	}
}

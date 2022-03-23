package cg.feb18.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.AbstractApplicationContext;

import cg.feb18.spring.demo.model.Employee;

@ComponentScan
public class App2 {

	public static void main(String[] args) {

		System.out.println("Start");

		// pure Java approach
//		Employee emp = new Employee(101, "Sonu", 50000); // 4 , 8, 8 = 20 100 2000

		// spring approach
		ApplicationContext context = new AnnotationConfigApplicationContext(App2.class);

		Employee emp = context.getBean(Employee.class);
		Employee emp2 = context.getBean(Employee.class);
		emp.setEmployeeId(101);

		System.out.println(emp.hashCode());
		System.out.println(emp2.hashCode());
		System.out.println(emp.equals(emp2));

		System.out.println(emp.toString());

		System.out.println("End");

		((AbstractApplicationContext) context).close();

	}
}

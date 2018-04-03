package pack;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeTest {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
		EmployeeService service=(EmployeeService)context.getBean("service");
		Employee emp=(Employee)context.getBean("EmployeeObject");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("1.ADD 2.Delete by id 3.DisplayAll 4.UpdatebyId 5.Exit");
		int op=sc.nextInt();
		do
		{
		switch (op) {
		case 1:
			System.out.println("EnterId");
			int empId=sc.nextInt();
			System.out.println("Enter name");
			String name=sc.next();
			System.out.println("Enter Designation");
			String des=sc.next();
			System.out.println("Enter salary");
			int sal=sc.nextInt();
			emp.setEmpId(empId);
			emp.setEmpName(name);
			emp.setDesignation(des);
			emp.setSalary(sal);
			service.insert(emp);
			
			break;
		case 2:
			System.out.println("Enter the id");
			int id=sc.nextInt();
			service.DeletebyId(id);
			break;
		case 3:
			service.DisplayAll();
			break;
		case 4:
			System.out.println("Enter the id");
			int id1=sc.nextInt();
			service.UpdatebyId(id1);
		case 5:
			System.out.println("Main menu exists");

		default:
			break;
		}
		}while(op<=5);
		
		
		
	}

}

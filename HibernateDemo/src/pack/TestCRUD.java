package pack;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class TestCRUD {
	public static void main(String[] args)
	{
		System.out.println("Doing update");
		Scanner sc=new Scanner(System.in);
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Transaction tx=s.beginTransaction();
		System.out.println("Enter an id");
		int tempid=sc.nextInt();
		sc.nextLine();
		Employee e=(Employee)s.get(Employee.class, tempid);
		if(e!=null)
		{
			System.out.println("oldname: "+e.getName());
			System.out.println("Enter name to update");
			String tempname=sc.nextLine();
			e.setName(tempname);
			System.out.println("new name"+e.getName());
			s.update(e);
			tx.commit();
			
		}
		else{
			System.err.println("Sorry id not found");
		}
		s.close();
		sf.close();
		sc.close();
		
				
			
				
	}

}

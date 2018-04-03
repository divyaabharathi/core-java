package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestHQL {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		String hibernateQuery="select e.name,e.salary from pack.Employee e";
		Query query=s.createQuery(hibernateQuery);
		List list=query.list();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Object[] obj=(Object[])it.next();
			String name=(String)obj[0];
			Double salary=(Double)obj[1];
			System.out.println("name="+name+",salary="+salary);
			
			//System.out.println("id= "+e.getId()+",name= "+e.getName()+",salary"+e.getSalary());
			
		}
		/*System.out.println("to retrive only name");
		String secondQuery="select obj.name from pack.Employee obj";
		Query query2=s.createQuery(secondQuery);
		List list2=query2.list();
		Iterator it2=list2.iterator();
		while(it2.hasNext())
		{
			String empNames =(String)it2.next();
			System.out.println(empNames);
		
		
	}*/
		sf.close();
		s.close();

}
}

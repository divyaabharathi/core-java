package pack;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class TestDiscriminating {
	public static void main(String[] args) {
		SessionFactory sf=HibernateUtility.getSessionFactory();
		Session s=sf.openSession();
		Criteria crt=s.createCriteria(Person.class);
		List list=crt.list();
		Iterator it=list.iterator();
		while(it.hasNext())
		{
			Person p=(Person)it.next();
			if(p instanceof Customer){
				Customer c=(Customer)p;
				System.out.println("id= "+c.getUid()+"Name="+c.getName()+",bank= "+c.getBankName());
			}
			else if(p instanceof Student){
				Student s1=(Student)p;
				System.out.println("id= "+s1.getUid()+"Name="+s1.getName());
			}
			else
			{
				System.out.println("id="+p.getUid()+"name="+p.getName());
				
			}
		}
		s.close();
		sf.close();
	}

}

package pack;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSprings {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("beans.Xml");
		//Identifier id=(Identifier)context.getBean("b1");
		//Identifier id2=(Identifier)context.getBean("b2");
		//id.display();
		//id2.display();
		Customer c=(Customer)context.getBean("c1");
		c.getInformations();
		//Bank bank=(Bank)context.getBean("bank");
	
		//System.out.println(bank.getLocations());
	}

}

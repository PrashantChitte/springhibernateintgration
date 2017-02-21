/**
 * 
 */
package demo.implemetation;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.utility.Person;

/**
 * @author PrashantChitte
 *
 */
public class PersonImpl {

	private SessionFactory sessionFactory;

	
	
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void saveoOject()
	{
		Person p1=new Person();
		p1.setName("Rajukaka");
		p1.setPlace("Pune");
		Session ses=this.sessionFactory.openSession();
		Transaction tx=ses.beginTransaction();
		ses.save(p1);
		ses.flush();
		tx.commit();
		ses.close();
	}
	
	public static void main(String[] args) {
		ApplicationContext cont=new ClassPathXmlApplicationContext("SpringMain.xml");
		PersonImpl object=cont.getBean(PersonImpl.class);
		object.saveoOject();
	}
}

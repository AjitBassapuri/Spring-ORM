package com.tap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	SessionFactory factory = context.getBean(SessionFactory.class);
    	Session session = factory.openSession();
    	Transaction tx = session.beginTransaction();
    	Employee e = context.getBean(Employee.class);
    	
    	session.persist(e);
    	tx.commit();
    	session.close();
    }
}

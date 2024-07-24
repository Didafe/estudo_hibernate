package com.estudos.hibernate;

import org.hibernate.Session;

import com.estudos.model.HibernateSession;
import com.estudos.model.User;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
    	Session session = HibernateSession.getSessionFactory().openSession();
    	
    	User user = new User();
    	
    	user.setUsername("Nando");
    	user.setName("Fernando");
    	user.setLastname("Sousa");
    	
    	System.out.println( "Hello World!" );
        System.out.println(session);
        System.out.println(user.getName() + " " + user.getLastname());
    }
}

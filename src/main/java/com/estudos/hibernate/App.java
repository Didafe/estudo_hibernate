package com.estudos.hibernate;

import org.hibernate.Session;

import com.estudos.model.Address;
import com.estudos.model.HibernateSession;
import com.estudos.model.User;

public class App {
    public static void main( String[] args ) {
    	Session session = HibernateSession.getSessionFactory().openSession();
    	
    	User user = new User();
    	Address address = new Address();
    	
    	address.setNumber(900);
    	address.setStreet("Down town");
    	
    	user.setUsername("Nando");
    	user.setName("Fernando");
    	user.setLastname("Sousa");
    	
    	address.setUser(user);
    	user.setAddress(address);
    	
    	System.out.println( "Hello World!" );
        System.out.println(session);
        System.out.println(user.getName() + " " + user.getLastname());
        System.out.println(user.getAddress().getStreet());
    }
}

package com.estudos.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.estudos.model.Address;
import com.estudos.model.HibernateSession;
import com.estudos.model.Options;
import com.estudos.model.Product;
import com.estudos.model.User;

public class App {
    public static void main( String[] args ) {
    	Session session = HibernateSession.getSessionFactory().openSession();
    	
    	Product product = new Product();
    	
    	product.setName("P 1");
    	product.setPrice(10.00);
    	
    	//session.save(product);
    	
    	//List<Product> products = session.createQuery("from Product").getResultList();
    	
    	Product p1 = session.find(Product.class, 5);
    	
    	System.out.println(p1.getName());
    	
    	session.getTransaction().commit();
    }
}

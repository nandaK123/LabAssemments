package com.abc.hibernetjpa.main;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.abc.hibernetjpa.entity.Author;

public class AuthorAll {

	
	
	
		public static void main(String[] args) 
		{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPA-PU");
			EntityManager em = emf.createEntityManager();
			
			System.out.println("***Select All Products******");
			
			Query query1 = em.createQuery("select p from Author p");  
			List<Author> authors = query1.getResultList();
			authors.forEach(p->System.out.println(p.getAuthorId()+" "+p.getFirstName()+" "+p.getMiddleName()+" "+p.getLastName()+" "+p.getPhoneNo()));
		}
	}


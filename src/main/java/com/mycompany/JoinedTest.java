package com.mycompany;

import javax.persistence.*;

import com.mycompany.Person;
import com.mycompany.Student;


public class JoinedTest {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("testPersistenceUnit");
        EntityManager em = emf.createEntityManager();
     
     	EntityTransaction transaction = em.getTransaction();
		transaction.begin();
        
		Student jeff = new Student();
		jeff.setAddress("123 willow ln");
		jeff.setEmail("jeff@gmail.com");
		jeff.setFirstName("jeff");
		jeff.setLastName("robinson");
		jeff.setGradLevel("grad");
		em.persist(jeff);

		Student irit = new Student();
		irit.setAddress("234 oak dr");
		irit.setEmail("irit@gmail.com");
		irit.setFirstName("irit");
		irit.setLastName("jackson");
		irit.setGradLevel("undergrad");
		em.persist(irit);

    	transaction.commit();
    }
}


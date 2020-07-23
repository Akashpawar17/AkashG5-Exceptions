package com.capg.JpaDemo;

<<<<<<< HEAD
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capg.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    
    
    {
    	Student a= new Student();
    	/*a.setSid(11);
    	a.setSname("john");
    	a.setSbranch("ece");
    	*/
    	
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
    	EntityManager em =emf.createEntityManager();
    	
    
    	
    	EntityTransaction et=em.getTransaction();
    	
    
    	

    	et.begin();
		Student a1=em.find(Student.class, 102);
//		em.detach(t1);
		//em.persist(a);
		a1.setSname("abdvillers");
		et.commit();
		System.out.println(a1);
		//System.out.println(a);
=======
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.capg.bean.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    
    
    {
    	/*Student a= new Student();
    	a.setSid(11);
    	a.setSname("john");
    	a.setSbranch("ece");
    	
    	*/
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
    	EntityManager em =emf.createEntityManager();
    	
    
    	
    	EntityTransaction et=em.getTransaction();
    	/*
    
    	

    	et.begin();
		Student a1=em.find(Student.class, 102);
//		em.detach(t1);
		//em.persist(a);
		a1.setSname("abdvillers");
		a1.setSbranch("ece");
		et.commit();
		System.out.println(a1);*/
		//System.out.println(a);
    	et.begin();
    	
    	
    	Query q=em.createQuery("from Student");
    	List<Student> list=q.getResultList();
    	list.forEach(t->System.out.println(t));
    	et.commit();
>>>>>>> branch 'master' of https://github.com/Akashpawar17/AkashG5-Exceptions.git
    	
    	
    	
    	
    	
    	
    }
}

package com.capg.jpa;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;

import javax.persistence.Persistence;




public class StudentJpa {

	public static void main(String[] args) {
		
		

    	//Student a=new Student(101, "akash", "01-07-1997");
    	//Student	a1=	new Student(102, "abdevillers", "17-07-1988");
    	 	
    	
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("students");
    	EntityManager em =emf.createEntityManager();
    	
    
    	
    	EntityTransaction et=em.getTransaction();
    	et.begin();
    	Student a3=em.find(Student.class, 102);
    	//em.persist(a);
    	//em.persist(a1);
    	
    	em.remove(a3);
    	et.commit();
    	
    	//System.out.println(a1);
    	//System.out.println(a);
    	System.out.println(a3);
    	
    
    	

    
    	
    	
    	
    	/*Query q1=em.createNamedQuery("findByName", Student.class);
	q1.setParameter("sname", "john");
	List<Student> student=q1.getResultList();
	System.out.println(student);
    	et.commit();*/
	

	}

}

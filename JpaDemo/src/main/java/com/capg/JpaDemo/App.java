package com.capg.JpaDemo;

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
    	
    	
    	
    	
    	
    	
    }
}

package hibernate.demo.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import hibernate.demo.entity.Instructor;
import hibernate.demo.entity.InstructorDetail;
import hibernate.demo.entity.student;

public class CreateStudentDemo2 {

	public static void main(String[] args) {

		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Instructor.class).addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
			
		
		//create session
		Session session=factory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
		    int id=4;
			InstructorDetail tempInstructor=session.get(InstructorDetail.class, id);
			
			System.out.println(tempInstructor);
			System.out.println(tempInstructor.getInstructor());
			session.getTransaction().commit(); 
			
			
			
		}
		finally {
			factory.close();
		}
	}

}

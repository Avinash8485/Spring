package com.jsp.springmvc.studentdb.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.Root;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.jsp.springmvc.studentdb.entity.Student;

@Repository
public class StudentRepository {
	 EntityManagerFactory emf=Persistence.createEntityManagerFactory("mysql-config");
		
		public void addStudent(Student student) {
			EntityManager em= emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(student);
			et.commit();
			em.close();
			
		}

		public List<Student> displayAllStudent() {
			EntityManager em= emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			
			
			Query query = em.createQuery("From Student");

			List<Student> students =  query.getResultList();	

		
			et.commit();
			em.close();
			
			return students;
			
		}

		public void deleteStudent(int studentId) {
			EntityManager em= emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			
			Student student = em.find(Student.class,studentId);
			
			em.remove(student);	

			et.commit();
			em.close();
			
		}
		
		public void updateStudent(Student student) {
			EntityManager em= emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(student);
			et.commit();
			em.close();
			
		}
		
		public Student findStudentById(int studentId) {
			EntityManager em= emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			et.begin();
			
			Student student = em.find(Student.class,studentId);
			
			em.remove(student);	

			et.commit();
			em.close();
			
			return student;
		}


}

package com.spring.practice.spring.layer.repository;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.spring.practice.spring.layer.entity.Product;


@Repository
public class ProductRepository {

	EntityManagerFactory emf =  Persistence.createEntityManagerFactory("mysql-config");

	public void addProduct(Product p) {

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		em.persist(p);

		et.commit();

		em.close();

	}

	public Product findProduct(int productId) {

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		Product p = em.find(Product.class, productId);

		et.commit();

		em.close();

		return p;

	}

	public void deleteProduct(int productId) {
		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		Product p = em.getReference(Product.class,productId);

		em.remove(p);

		et.commit();

		em.close();
		System.out.println("Data deleted Sucessfully !!!");

	}

	public void updateProduct(Product product) {

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		em.merge(product);

		et.commit();

		em.close();

	}

	public List<Product> findAllProduct() {

		EntityManager em = emf.createEntityManager();

		EntityTransaction et = em.getTransaction();

		et.begin();

		Query query = em.createQuery("From Product");
		
		List product = query.getResultList();

		et.commit();

		em.close();
		
		return product;

	}







}

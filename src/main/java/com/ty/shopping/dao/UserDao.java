package com.ty.shopping.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping.dto.User;

public class UserDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	public User saveUser(User user) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}
	public User getUserById(int id) {
		User user=entityManager.find(User.class, id);
		if(user != null) {
			return user;
		}
		return null;
	}
	public List<User> getAllUser(){
		String sql="SELECT u from User u";

		Query query=entityManager.createQuery(sql);
		return query.getResultList();
	}
	public User validateUser(String email, String password) {
		String sql="SELECT u FROM User u WHERE u.email=?1 AND u.password=?2";

		Query query=entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		List<User>user=query.getResultList();

		if(user.size()>0)
			return user.get(0);
		else
			return null;
	}
	public boolean deleteUserById(int id) {
		EntityTransaction entityTransaction=entityManager.getTransaction();
		User user=entityManager.find(User.class, id);
		if(user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		else {

			return false;
		}
	}
}

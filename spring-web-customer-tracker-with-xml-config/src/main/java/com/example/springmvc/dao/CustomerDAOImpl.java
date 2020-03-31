package com.example.springmvc.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.springmvc.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	// need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Customer> getCustomers() {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// Create a query to get customers
		Query<Customer> query = currentSession.createQuery("from Customer", Customer.class);

		// execute the query and get result list
		List<Customer> customers = query.getResultList();

		return customers;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// save/update customer
		// if id == 0 then add new customer
		// else update existing employee
		currentSession.saveOrUpdate(customer);

	}

	@Override
	public Customer getCustomer(int customerId) {

		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// Get customer from database
		Customer customer = currentSession.get(Customer.class, customerId);

		return customer;
	}

	@Override
	public void deleteCustomer(int customerId) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();
		
		// delete customer with primary key
		Query<?> query = currentSession.createQuery("delete from Customer where id=:customerId");
		query.setParameter("customerId", customerId);
		
		query.executeUpdate();
	}

}

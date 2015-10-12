package com.eshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eshop.dao.Customer;
import com.eshop.dao.CustomerDAO;
import com.eshop.dao.CustomerDAOJDBCImpl;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerDAO dao;
	
	@Autowired
	public List<Customer> getCustomers(){
		
		CustomerDAO dao = new CustomerDAOJDBCImpl();		
		return dao.getAllCustomers();		
	}
	
	public void add(Customer customer){
		dao.createCustomer(customer); 
	}
}

package com.eshop.dao;

import java.util.List;

public class CustomerDAOJDBCImplDemo {

	public static void main(String[] args) throws DAOException {

		CustomerDAO dao = new CustomerDAOJDBCImpl();
		List<Customer> customers = dao.getAllCustomers();

		for (Customer c : customers) {

			System.out.println("Id = " + c.getId());
			System.out.println("First name = " + c.getFirstName());
			System.out.println("Last name = " + c.getLastName());
			System.out.println("Address name = " + c.getAddress());
			System.out.println("City name = " + c.getCity());
			System.out.println("State name = " + c.getState());
			System.out.println("Zip code name = " + c.getZipCode());
			System.out.println("*************************************");

		}

		/*
		 * Customer customer = new Customer(6, "Jyothy", "JL",
		 * "123 Jyothy Blvd", "Dullas", "TX", "12345");
		 * dao.createCustomer(customer);
		 */

		Customer customer = new Customer(6, "Jyothy", "JL", "999 Plano Dr",
				"Plano", "TX", "98765");
		dao.deleteCustomer(6);

	}

}

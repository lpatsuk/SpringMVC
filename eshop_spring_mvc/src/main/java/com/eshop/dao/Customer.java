package com.eshop.dao;

import java.util.List;

import javax.validation.constraints.Min;
import javax.validation.constraints.Null;

import org.hibernate.validator.constraints.NotEmpty;

public class Customer {
	
	private int id;
	
	@NotEmpty(message="First name cannot be empty")
	@Min(value=3, message="First name must be at least 3 characters")
	private String firstName;
	
	@NotEmpty(message="Last name cannot be empty")
	@Min(value=3, message="Last name must be at least 3 characters")
	private String lastName;
	
	
	private String address;
	private String city;
	private String state;
	private String zipCode;
	private List<Order> orders;

	public Customer() {

	}

	public Customer(int id, String firstName, String lastName, String address,
			String city, String state, String zipCode) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	public int getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void addOrde(Order order) {

		this.orders.add(order);
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

}

package com.eshop.dao;

public class DAOException extends RuntimeException{
	
	public DAOException(String ErrorMessage, Throwable ex){
		
		super(ErrorMessage, ex);
	}
	
	public DAOException(String errorMessage) {
		super(errorMessage);
	}

}

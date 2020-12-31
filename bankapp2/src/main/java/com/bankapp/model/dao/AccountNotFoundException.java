package com.bankapp.model.dao;

public class AccountNotFoundException extends RuntimeException{
	public AccountNotFoundException(String message) {
		super(message);
	}
}

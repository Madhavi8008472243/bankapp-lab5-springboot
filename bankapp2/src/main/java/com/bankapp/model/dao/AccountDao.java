package com.bankapp.model.dao;
import java.util.*;
public interface AccountDao {
	public List<Account> getAllAccounts();
	public Account addAccount(Account account);
	 public Account updateAccount(Account account);
	 public Account deleteAccount(int accountId);
	 public default Account findAccountById(int fromaccId) {
		// TODO Auto-generated method stub
		return null;
	}
	public Account update(Account account);
	
}

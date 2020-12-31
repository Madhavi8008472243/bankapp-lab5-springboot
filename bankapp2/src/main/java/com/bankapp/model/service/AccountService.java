package com.bankapp.model.service;

import java.util.List;

import com.bankapp.model.dao.Account;

public interface AccountService {
	public List<Account> getAllAccounts();
	public Account transfer(int fromAccId, int toAccountId, double amount);
	public Account addAccount(Account account);
	public Account updateAccount(Account account);
	public Account deleteAccount(int accountId);
	public Account findAccountById(int accountId);
	public Account withdraw(int accountId, double amount);
	public Account update(Account accountWithdraw);
	public Account deposit(int accountId, double amount);

	
}
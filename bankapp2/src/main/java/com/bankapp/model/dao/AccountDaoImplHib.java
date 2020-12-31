package com.bankapp.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class AccountDaoImplHib implements AccountDao {

	private EntityManager em;

	@Autowired
	public AccountDaoImplHib(EntityManager em) {
		this.em = em;
	}

	@Override
	public List<Account> getAllAccounts() {
		return em.createQuery("select a from Account a").getResultList();
	}

	@Override
	public Account addAccount(Account account) {
		em.persist(account);
		return account;
	}

	@Override
	public Account updateAccount(Account account) {
		em.merge(account);
		return account;
	}

	@Override
	public Account deleteAccount(int accountId) {
		Account accountToDelete = findAccountById(accountId);
		em.remove(accountToDelete);
		return accountToDelete;
	}

	@Override
	public Account findAccountById(int accountId) {
		Account account= em.find(Account.class, accountId);
		if(account==null)
			throw new AccountNotFoundException("account with id: "+ accountId +" is not found");
		return account;
	}

	@Override
	public Account update(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}

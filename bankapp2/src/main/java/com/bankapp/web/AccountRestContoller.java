package com.bankapp.web;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.model.dao.Account;
import com.bankapp.model.service.AccountService;
//........../admin/account
@RestController
@RequestMapping(path = "admin")
public class AccountRestContoller {

	private AccountService accountService;

	@Autowired
	public AccountRestContoller(AccountService accountService) {
		this.accountService = accountService;
	}
	//http://localhost:8090/bankapp/account
	@GetMapping(path = "account", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Account> allAccounts(){
		List<Account> accounts=accountService.getAllAccounts();
		return accounts;
	}
	
	//http://localhost:8090/bankapp/account/1
	@GetMapping(path = "account/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account getAnAccount(@PathVariable(name = "accountId") int id){
		Account account=accountService.findAccountById(id);
		return account;
	}
	 
	@PostMapping(path="account", 
			produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes =MediaType.APPLICATION_JSON_VALUE )
	public Account addAccount( @RequestBody Account account) {
		Account acc=accountService.addAccount(account);
		return acc;
	}
	
	@PutMapping(path="account/{accountId}", 
			produces = MediaType.APPLICATION_JSON_VALUE, 
			consumes =MediaType.APPLICATION_JSON_VALUE )
	public Account updateAccount(@PathVariable(name = "accountId") int id,
			@RequestBody Account account) {
		Account acc=accountService.updateAccount(account);
		return acc;
	}

	@DeleteMapping(path = "account/{accountId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public Account deleteAnAccount(@PathVariable(name = "accountId") int id){
		Account account=accountService.deleteAccount(id);
		return account;
	}
	
}

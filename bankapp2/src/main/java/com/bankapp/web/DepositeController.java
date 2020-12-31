package com.bankapp.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.model.dao.Account;
import com.bankapp.model.service.AccountService;
import com.bankapp.web.beans.DepositBean;

//......../mgr/transfer
@RestController
@RequestMapping("mgr")
public class DepositeController {

private AccountService accountService;
	
	@Autowired
	public DepositeController(AccountService accountService) {
		this.accountService = accountService;
	
	}
	@PostMapping(path="deposit" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public Account depositDetails(@RequestBody DepositBean depositBean) {
		Account accountDeposit=accountService.deposit(depositBean.getAccountId(),depositBean.getAmount());
		return accountService.update(accountDeposit);
	}

	}
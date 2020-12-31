package com.bankapp.web;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankapp.model.dao.Account;
import com.bankapp.model.service.AccountService;

import com.bankapp.web.beans.WithdrawBean;
//......../mgr/transfer
@RestController
@RequestMapping("mgr")
public class WithdrawController {

private AccountService accountService;
	
	@Autowired
	public WithdrawController(AccountService accountService) {
		this.accountService = accountService;
	}
	@PostMapping(path="withdraw" ,produces=MediaType.APPLICATION_JSON_VALUE)
	public Account withdrawDetails(@RequestBody WithdrawBean withdrawBean) {
		Account accountWithdraw=accountService.withdraw(withdrawBean.getAccountId(),withdrawBean.getAmount());
		return accountService.update(accountWithdraw);
	}
	
}



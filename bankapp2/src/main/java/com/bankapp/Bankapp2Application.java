package com.bankapp;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.bankapp.model.dao.Account;
import com.bankapp.model.dao.AccountType;
import com.bankapp.model.service.AccountService;
@EnableAspectJAutoProxy
@SpringBootApplication
public class Bankapp2Application implements CommandLineRunner{
	
	@Autowired
	private AccountService accountService;
	
	public static void main(String[] args) {
		SpringApplication.run(Bankapp2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		
//		Account account1=new Account("raj", "new delhi", "5454545454", "raj@gamil.com", 6000.00,
//				AccountType.SAVING);
//		Account account2=new Account("ekta", "new delhi", "5454575454", "ekta@gamil.com", 6000.00,
//				AccountType.SAVING);
//		
//		accountService.addAccount(account1);
//		accountService.addAccount(account2);
//		
//		System.out.println("--------------------2 default acc is added ----------------");
	}

}

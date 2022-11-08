package com;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface AccountService {
	public List<Account> getAllAccount();
	public Account saveAccount(Account account);
	public List<Account> getAccountByCriteriaa(Float amount);
	public List<Account> getAccountByAmountName( Float amount, String name);
	public List<Account> getAccountByQueryParam( Float amount);
	
	
}

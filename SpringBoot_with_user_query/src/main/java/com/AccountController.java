package com;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/acc")
public class AccountController {
	
	
	@Autowired
	AccountService accountServiceImpl;
	
	@GetMapping("/all")
	public List<Account> getAllAccount(){
	List<Account> acclist= accountServiceImpl.getAllAccount();
			return acclist;
	}


	@PostMapping("/save")
	public Account saveAccount(@RequestBody Account account) {
		accountServiceImpl.saveAccount(account);
		return account;
		
	}
	@GetMapping("/crt/{amount}")
	public List<Account> getAccountByCriteria(@PathVariable Float amount){
		
		List<Account> accList=accountServiceImpl.getAccountByCriteriaa(amount);
		return accList;
	}
	@GetMapping("/crt/{amount}/{name}")
	public List<Account> getAccountByAmountName(@PathVariable Float amount,@PathVariable String name){
	 List<Account> filterlist= accountServiceImpl.getAccountByAmountName(amount, name);
	
		return filterlist;
		
	}
	@GetMapping("/crt")
	public List<Account> getAccountByQueryParam(@RequestParam Float amount){
		List<Account> acList=accountServiceImpl.getAccountByQueryParam(amount);
		return acList;
	}
	@GetMapping("/crt/{amt}")
	public List<Account> getAccountByCriteriaa(@PathVariable("amt") Float amount){
		 List<Account> accList= accountServiceImpl.getAccountByCriteriaa(amount);
			
			return accList;
	}
}
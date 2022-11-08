package com;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

//@Component
@Repository
public interface AccountRepository extends JpaRepository<Account, Integer>{
	
	@Query(value="select * from account where amount>=?1",nativeQuery = true)
	public List<Account> filterAccountByAmount(Float amount);
	
	@Query(value="select * from account where amount>=?1 and name=?2",nativeQuery = true)
	public List<Account> filterAccountByAmountName(Float amount,String name);
}



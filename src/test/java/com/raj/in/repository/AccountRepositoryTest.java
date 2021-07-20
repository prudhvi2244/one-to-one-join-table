package com.raj.in.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raj.in.entity.Account;
import com.raj.in.entity.Employee;

import lombok.extern.log4j.Log4j2;
import lombok.extern.slf4j.Slf4j;


@SpringBootTest
@Slf4j
public class AccountRepositoryTest {
	
	@Autowired
	private AccountRepository arepo;
	
	@Test
	public void testSaveAccount()
	{
		Account account=new Account();
		account.setBname("SBI Bank");
		
		Employee employee=new Employee();
		employee.setEname("Raj");
		employee.setEcity("Bangalore");
		employee.setAccount(account);
		
		
		account.setEmployee(employee);

		Account savedAccount=arepo.save(account);
		
		
		
		Assertions.assertThat(savedAccount).isNotNull();
		
		
		
		
	}

}

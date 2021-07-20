package com.raj.in.repository;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.raj.in.entity.Account;
import com.raj.in.entity.Employee;

import lombok.extern.slf4j.Slf4j;

@SpringBootTest
@Slf4j
public class EmployeeRepositoryTest {

	@Autowired
	private EmployeeRepository erepo;

	@Test
	public void testSaveEmployee() {

		
		Account account = new  Account();
		account.setBname("ICICI Bank");
		
		
		Employee employee = new Employee();
		employee.setEname("Rajeev");
		employee.setEcity("Goa");
	
		employee.setAccount(account);

		Employee savedEmployee = erepo.save(employee);

		System.out.println("Saved Employee :"+savedEmployee);

		Assertions.assertThat(savedEmployee).isNotNull();

	}

}

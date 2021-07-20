package com.raj.in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raj.in.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Integer> {

}

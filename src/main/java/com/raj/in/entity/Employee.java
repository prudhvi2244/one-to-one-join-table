package com.raj.in.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employee {

	@Id
	@GeneratedValue
	private Integer eid;
	@Column
	private String ename;
	@Column
	private String ecity;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinTable(name = "employee_account",
	joinColumns = @JoinColumn(name="eid_fk"),
	inverseJoinColumns = @JoinColumn(name="accno_fk"))
	private Account account;

}

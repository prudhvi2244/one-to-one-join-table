package com.raj.in.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Account {

	@Id
	@GeneratedValue
	private Integer accno;
	@Column
	private String bname;
	@OneToOne(mappedBy = "account",cascade = CascadeType.ALL)
	private Employee employee;
	
}

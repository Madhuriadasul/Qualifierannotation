package com;

import javax.persistence.Entity;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
public class Account {
@Id
private Integer accountid;
public Account(Integer accountid, String name, String loc, Float amount) {
	super();
	this.accountid = accountid;
	this.name = name;
	this.loc = loc;
	this.amount = amount;
}
@Override
public String toString() {
	return "Account [accountid=" + accountid + ", name=" + name + ", loc=" + loc + ", amount=" + amount + "]";
}
public Account() {
	super();
	// TODO Auto-generated constructor stub
}
public Integer getAccountid() {
	return accountid;
}
public void setAccountid(Integer accountid) {
	this.accountid = accountid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLoc() {
	return loc;
}
public void setLoc(String loc) {
	this.loc = loc;
}
public Float getAmount() {
	return amount;
}
public void setAmount(Float amount) {
	this.amount = amount;
}
private String name;
private String loc;
private Float amount;
}

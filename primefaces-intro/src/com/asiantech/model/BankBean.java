package com.asiantech.model;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.asiantech.model.Account;

@ManagedBean(name="bank")
@SessionScoped
public class BankBean implements Serializable{ 
	private String name;
	private Date modiferTime;
	private String status;
	private Boolean isPublic; 
	private ArrayList<Account> accountList = 
			new ArrayList<Account>(Arrays.asList(
			
			new Account("Th Tue", new Date(2015 - 1900, 5, 11), "Dang SD", true),
			new Account("Th Duc", new Date(2015,5,13), "Dang SD", true),
			new Account("Th Hai", new Date(2015,5,13), "Dang SD", true),
			new Account("Th Khiem", new Date(2015,5,13), "Dang SD", true),
			new Account("Th Hoa", new Date(2015,5,13), "Dang SD", true) 
		));
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getModiferTime() {
		return modiferTime;
	}

	public void setModiferTime(Date modiferTime) {
		this.modiferTime = modiferTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(Boolean isPublic) {
		this.isPublic = isPublic;
	}

	
	
	 
	
	public ArrayList<Account> getAccountList() {
		return accountList;
	}

	public void addAccount() {
	    
		Account account = new Account(this.name, this.modiferTime, 
			this.status, this.isPublic);
		
		accountList.add(account);
		 
	}
 
	public void deleteAccount(Account account) { 
		accountList.remove(account); 
	}
}

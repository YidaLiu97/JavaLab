package ncu.lyl.bank;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private String ID;
	private String password;
	private String name;
	private String address;
	private double amount;
	private String telephone;
	private List<AccessRecord> record;
	
	{
		this.amount=0;
		this.record=new ArrayList<>();
	}//自由块，所有账户创建时账户金额都为0
	
	public Account(String iD, String password, String name, String address, String telephone) {
		this.ID = iD;
		this.password = password;
		this.name = name;
		this.address = address;
		this.telephone = telephone;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<AccessRecord> getRecord() {
		return record;
	}

	public void setRecord(AccessRecord newRecord) {
		this.record.add(newRecord);
	}
	
}

package ncu.lyl.bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccessRecord {
	private String number;//记录编号
	private Date date;//日期
	private boolean isDeposit;//类别（存款为true）
	private double amount;//存款或取款数目
	private int operator;//经办人
	
	public AccessRecord(String number, Date date, boolean isDeposit, double amount, int operator) {
		super();
		this.number = number;
		this.date = date;
		this.isDeposit = isDeposit;
		this.amount = amount;
		this.operator = operator;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isDeposit() {
		return isDeposit;
	}
	public void setDeposit(boolean isDeposit) {
		this.isDeposit = isDeposit;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public int getOperator() {
		return operator;
	}
	public void setOperator(int operator) {
		this.operator = operator;
	}
	@Override
	public String toString() {
		String type=new String();
		if(isDeposit==true)
			type="存款";
		else
			type="取款";
		String s=new String();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        s = sdf.format(date);  
		return "[number:" + number + ", date:" + s + ", type:" + type + ", amount:" + amount
				+ ", operator:" + operator + "]";
	}
	
	
	
}

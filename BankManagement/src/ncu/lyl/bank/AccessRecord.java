package ncu.lyl.bank;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AccessRecord {
	private String number;//��¼���
	private Date date;//����
	private boolean isDeposit;//��𣨴��Ϊtrue��
	private double amount;//����ȡ����Ŀ
	private int operator;//������
	
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
			type="���";
		else
			type="ȡ��";
		String s=new String();
		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        s = sdf.format(date);  
		return "[number:" + number + ", date:" + s + ", type:" + type + ", amount:" + amount
				+ ", operator:" + operator + "]";
	}
	
	
	
}

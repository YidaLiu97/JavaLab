package ncu.lyl.bank;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Management {
	//private Account account;
	
	public void checkAmount(Account account) {
		//查询余额
		 System.out.println("当前账户余额为："+account.getAmount());
	}
	
	public void deposit(Account account) {
		//存款
		System.out.print("请输入存款金额：");
		Scanner in=new Scanner(System.in);
		double i=in.nextDouble();
		account.setAmount(account.getAmount()+i);
		List<AccessRecord> list=account.getRecord();
		int j;
		if(list==null) 
			j=0;
		else
			j=list.size();
		String number=String.valueOf(j+1);
		Random random=new Random();
		Date date=new Date();
		AccessRecord newRecord=new AccessRecord(number, date, true, i, random.nextInt(10)+1);
		account.setRecord(newRecord);
	}
	
	public void draw(Account account) {
		//取款
		System.out.print("请输入取款金额：");
		Scanner in=new Scanner(System.in);
		double i=in.nextDouble();
		while(i>account.getAmount()) {
			System.out.print("余额不足！请重新输入：");
			i=in.nextDouble();
		}
		account.setAmount(account.getAmount()-i);
		List<AccessRecord> list=account.getRecord();
		int j=list.size();
		String number=String.valueOf(j+1);
		Random random=new Random();
		Date date=new Date();
		account.setRecord(new AccessRecord(number, date, false, i, random.nextInt(10)+1));
	}
	
	public void checkRecord(Account account) {
		//查询记录
		List<AccessRecord> list=account.getRecord();
		if(list==null) {
			System.out.println("无记录");
		}
		else {
			for(int i = 0 ; i < list.size() ; i++) {
				  System.out.println(list.get(i));
				}
		}
		
	}
	
	public int login(List<Account> accountList) {
		//登录
		System.out.print("请输入账号：");
		Scanner sc=new Scanner(System.in);
		String id=sc.nextLine();
		int j = 0;
		for(int i=0;i<accountList.size();i++) {
			if(accountList.get(i).getID().equals(id)) {
				j=i;
				break;
			}
			else
				j=-1;
		}
		if(j==-1) {
			System.out.println("该账号不存在，请先注册。");
			return -1;
		}
		else {
			System.out.print("请输入密码：");
			String pass=sc.nextLine();
			for(;!(accountList.get(j).getPassword().equals(pass));) {
				System.out.print("密码错误！请重新输入：");
				pass=sc.nextLine();
			}
			return j;
		}
		
	}
	
	public List<Account> register(List<Account> accountList) {
		//注册
		Scanner sc=new Scanner(System.in);
		System.out.print("账号：");
		String id=sc.nextLine();
		System.out.print("密码：");
		String pass=sc.nextLine();
		System.out.print("姓名：");
		String name=sc.nextLine();
		System.out.print("住址：");
		String address=sc.nextLine();
		System.out.print("电话：");
		String phone=sc.nextLine();
		Account newAccount=new Account(id, pass, name, address, phone);
		accountList.add(newAccount);
		return accountList;
	}
	
}

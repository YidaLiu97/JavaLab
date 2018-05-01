package ncu.lyl.bank;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Management {
	//private Account account;
	
	public void checkAmount(Account account) {
		//��ѯ���
		 System.out.println("��ǰ�˻����Ϊ��"+account.getAmount());
	}
	
	public void deposit(Account account) {
		//���
		System.out.print("���������");
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
		//ȡ��
		System.out.print("������ȡ���");
		Scanner in=new Scanner(System.in);
		double i=in.nextDouble();
		while(i>account.getAmount()) {
			System.out.print("���㣡���������룺");
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
		//��ѯ��¼
		List<AccessRecord> list=account.getRecord();
		if(list==null) {
			System.out.println("�޼�¼");
		}
		else {
			for(int i = 0 ; i < list.size() ; i++) {
				  System.out.println(list.get(i));
				}
		}
		
	}
	
	public int login(List<Account> accountList) {
		//��¼
		System.out.print("�������˺ţ�");
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
			System.out.println("���˺Ų����ڣ�����ע�ᡣ");
			return -1;
		}
		else {
			System.out.print("���������룺");
			String pass=sc.nextLine();
			for(;!(accountList.get(j).getPassword().equals(pass));) {
				System.out.print("����������������룺");
				pass=sc.nextLine();
			}
			return j;
		}
		
	}
	
	public List<Account> register(List<Account> accountList) {
		//ע��
		Scanner sc=new Scanner(System.in);
		System.out.print("�˺ţ�");
		String id=sc.nextLine();
		System.out.print("���룺");
		String pass=sc.nextLine();
		System.out.print("������");
		String name=sc.nextLine();
		System.out.print("סַ��");
		String address=sc.nextLine();
		System.out.print("�绰��");
		String phone=sc.nextLine();
		Account newAccount=new Account(id, pass, name, address, phone);
		accountList.add(newAccount);
		return accountList;
	}
	
}

package ncu.lyl.bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account> accounts=new ArrayList<Account>();
		accounts.add(new Account("123", "123", "123", "123", "123"));
		menu(accounts);
	}
	
	public static void menu(List<Account> accounts) {
		Management m=new Management();
		System.out.print("1.��¼\t2.ע��\n��ѡ��");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		switch(c) {
		case 1:int i=m.login(accounts);
			if(i!=-1) {
				operationMenu(accounts.get(i));
			}
			else
				menu(accounts);
			break;
		case 2:accounts=m.register(accounts);
			break;
		}
		menu(accounts);
	}
	
	public static void operationMenu(Account account) {
		Management m=new Management();
		System.out.print("1.���\n2.ȡ��\n3.��ѯ���\n4.��ѯ��¼\n5.�˳��˺�\n\n��ѡ��");
		Scanner sc=new Scanner(System.in);
		int c=sc.nextInt();
		switch(c) {
		case 1:m.deposit(account);
			break;
		case 2:m.draw(account);
			break;
		case 3:m.checkAmount(account);
			break;
		case 4:m.checkRecord(account);
			break;
		case 5:return;
		}
		operationMenu(account);
	}
}

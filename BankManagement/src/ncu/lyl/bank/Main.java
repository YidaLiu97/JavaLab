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
		System.out.print("1.µÇÂ¼\t2.×¢²á\nÇëÑ¡Ôñ£º");
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
		System.out.print("1.´æ¿î\n2.È¡¿î\n3.²éÑ¯Óà¶î\n4.²éÑ¯¼ÇÂ¼\n5.ÍË³öÕËºÅ\n\nÇëÑ¡Ôñ£º");
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

package ncu.lyl.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student> list=addStudent();
		for(int i = 0 ; i < list.size() ; i++) {
			  System.out.println(list.get(i));
			}
		while(true){
			menu(list);
		}
	}
	
	public static List<Student> addStudent(){
		List<Student> list=new ArrayList<>();
		
		list.add(new Student("04","zhang","89"));
		list.add(new Student("02","lisi","78"));
		list.add(new Student("03","zhouwu","90"));
		list.add(new Student("01","wuliu","65"));
		list.add(new Student("05","qianyi","99"));
		return list;
	}
	
	public static void menu(List<Student> list) {
		System.out.println("1.按学号排序");
		System.out.println("2.按名字排序");
		System.out.println("3.按成绩排序");
		System.out.println("4.退出");
		System.out.println();
		int c;
		System.out.print("请选择：");
		Scanner in=new Scanner(System.in);
		c=in.nextInt();
		
		switch(c) {
		case 1:Comparator idComp=new IDComparator();
			Collections.sort(list,idComp);
			break;
		case 2:Comparator nameComp=new NameComparator();
			Collections.sort(list,nameComp);
			break;
		case 3:Comparator gradeComp=new GradeComparator();
			Collections.sort(list,gradeComp);
			break;
		case 4: System.exit(0);
		}
		for(int i = 0 ; i < list.size() ; i++) {
			  System.out.println(list.get(i));
			}
	}
	
}

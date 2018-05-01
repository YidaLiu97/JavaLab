package ncu.lyl.student;

import java.util.Comparator;

public class NameComparator implements Comparator{
	int nameCompare;
	Student s1,s2;
	
	public int compare(Object obj1,Object obj2) {
		s1=(Student)obj1;
		s2=(Student)obj2;
		nameCompare=-(s1.getName().compareTo(s2.getName()));
		return nameCompare;
	}
}

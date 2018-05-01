package ncu.lyl.student;

import java.util.Comparator;

public class IDComparator implements Comparator {
	int idCompare;
	Student s1,s2;
	
	public int compare(Object obj1,Object obj2) {
		s1=(Student)obj1;
		s2=(Student)obj2;
		idCompare=-(s1.getNumber().compareTo(s2.getNumber()));
		return idCompare;
	}
}

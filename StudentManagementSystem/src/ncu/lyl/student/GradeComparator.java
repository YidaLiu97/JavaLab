package ncu.lyl.student;

import java.util.Comparator;

public class GradeComparator implements Comparator {
	int GradeCompare;
	Student s1,s2;
	
	public int compare(Object obj1,Object obj2) {
		s1=(Student)obj1;
		s2=(Student)obj2;
		GradeCompare=-(s1.getJavaGrade().compareTo(s2.getJavaGrade()));
		return GradeCompare;
	}
}

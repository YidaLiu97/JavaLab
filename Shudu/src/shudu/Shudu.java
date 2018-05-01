package shudu;

import java.util.Scanner;
public class Shudu {

	public static int[][] CreateArray() {
		int[][] a=new int[9][9];
		for(int r=0;r<9;r++) {
			a[r][0]=r+1;
			for(int c=1;c<9;c++) {
				int k = (a[r][c-1]==9)?(a[r][c]=1):(a[r][c]=a[r][c-1]+1);
			}
		}
		RowChange(a);
		ColumnChange(a);
		return a;
	}
	
	public static void DisplayArray(int[][] a) {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				if(a[i][j]!=0)
					System.out.printf("%3d",a[i][j]);
				else
					System.out.printf("%3c",'■');
			}
			System.out.println();
		}
	}
	
	public static void RowChange(int[][] a) {
		int[] order1= {1,2,5};
		int[] order2= {3,6,7};
		int temp;
		for(int i=0;i<3;i++) 
			for(int j=0;j<9;j++) {
				temp=a[order1[i]][j];
				a[order1[i]][j]=a[order2[i]][j];
				a[order2[i]][j]=temp;
			}
	}
	
	public static void ColumnChange(int[][] a) {
		java.util.Random random=new java.util.Random();
		for(int b=0;b<10;b++) {
			int c=random.nextInt(9);
			int k = 0;
			switch(c) {
			case 0:
			case 1:
			case 2:	k=random.nextInt(3);break;
			case 3:
			case 4:
			case 5:k=random.nextInt(3)+3;break;
			case 6:
			case 7:
			case 8:k=random.nextInt(3)+6;break;
			}
			int temp;
			for(int r=0;r<9;r++) {
				temp=a[r][k];
				a[r][k]=a[r][c];
				a[r][c]=temp;
			}
		}
	}
	
	public static int[][] Question(int[][] a){
		java.util.Random random=new java.util.Random();
		for(int i=0;i<50;i++) {
			int r=random.nextInt(9);
			int c=random.nextInt(9);
			while(a[r][c]==0) {
				r=random.nextInt(9);
				c=random.nextInt(9);
			}
			a[r][c]=0;
		}
		return a;
	}
	
	public static int[][] Input() {
		Scanner input=new Scanner(System.in);
		int[][] a = new int[9][9];
		System.out.println("请输入你的答案：");
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				a[i][j]=input.nextInt();
		return a;
	}
	
	public static void Check(int[][] a,int[][] b) {
		int t=0;
		int f=0;
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++) {
				if(a[i][j]==b[i][j])
					t++;
				else
					f++;
			}
		if(f!=0) {
			System.out.println("答案错误，正确答案为：");
			DisplayArray(a);
		}
		else
			System.out.println("恭喜你，答对了。");
	}
	
	public static int[][] Copy(int[][] a){
		int[][] b=new int[9][9];
		for(int i=0;i<9;i++)
			for(int j=0;j<9;j++)
				b[i][j]=a[i][j];
		return b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a;
		int[][] b;
		int[][] q;
		int[][] answer;
		a=CreateArray();
		b=Copy(a);
		DisplayArray(a);
		System.out.println();
		q=Question(a);
		DisplayArray(q);
		answer=Input();
		Check(b,answer);
	}

}

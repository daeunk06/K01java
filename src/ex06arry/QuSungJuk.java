package ex06arry;

import java.util.Scanner;

public class QuSungJuk {
	
	static void showArray(int[][] ds) {
		for(int i=0;i<ds.length;i++) {
			for(int j=0; j< ds[i].length;j++) {
				System.out.printf("%d ",ds[i][j]);
			}
			System.out.println("");
		}
		System.out.println("=========================");
	}
	public static final int SUBJECT = 3;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("학생수를 입력하세요?");
		int stu = scanner.nextInt();
		System.out.println("학생수:"+stu);
		int[][] jumsu = new int [stu][SUBJECT]; 
		String[] title = {"국어","영어","수학"};
		for(int i=0; i<jumsu.length; i++) {
			System.out.printf("[%d번째 학생의 점수 입력]\n",i+1);
			for(int k=0; k<SUBJECT; k++) {
				System.out.println(title[k]+"점수입력?");
				jumsu[i][k]=scanner.nextInt();
			}
			
		}
		System.out.println("=========================");
		System.out.println("NO KOR ENG MAT TOT AVG");
		System.out.println("=========================");
	
		for(int i=0; i<jumsu.length;i++) {
			int total = 0;
			System.out.printf("%-3d", i+1);
			for(int j=0; j<SUBJECT; j++) {
				total += jumsu[i][j];
				System.out.printf("%-4d", jumsu[i][j]);
			}
			 
			System.out.printf("%-3d %.2f\n",total,(double)(total / SUBJECT));
		}
	}

}




































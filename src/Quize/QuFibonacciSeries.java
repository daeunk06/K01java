package Quize;

import java.util.Scanner;

public class QuFibonacciSeries {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("출력할 피보나치수열의 항목갯수를 입력하세요:");
		int a = scanner.nextInt();
		fiboMethod(a);
	}
	public static void fiboMethod(int a) {
		
		if(a<=1) {
			System.out.println("피보나치 수열은 0,1부터 시작합니다"
					+ "2이상 입력하세요"); 
		}
		else {
			int[] fibo = new int[a];
			int sum =0;
			fibo[0]=0;
			fibo[1]=1;
			for(int i=2; i<a;i++) {
				sum=fibo[i-2]+fibo[i-1];
				fibo[i]=sum;
			}
			for(int j=0;j<a;j++) 
				System.out.print(fibo[j]+" ");
		}
	}

}

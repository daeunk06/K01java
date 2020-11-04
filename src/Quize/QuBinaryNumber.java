package Quize;

import java.util.Scanner;


public class QuBinaryNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("2진수로 변환할 정수를 입력하세요:");
		int ten = sc.nextInt();
		int cnt =0;
		int a = ten;
		while(true) {
			cnt++;
			if(a /2 <= 0) {
				break;
			}
			a = a / 2;
		}
		int[] jin = new int[cnt] ;
		for(int i = 0 ;i<jin.length-1;i++) {
			jin[i] = ten % 2;
			ten = ten / 2;
		}
		jin[jin.length-1]=1;
		for(int i=jin.length-1; i>=0; i-- ) {
			System.out.print(jin[i]);
		}
	}
	

}

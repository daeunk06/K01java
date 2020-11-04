package Quize;

import java.util.Scanner;

public class ExSusikAZ {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("정수n을 입력하세요(0이상의정수):");
		int n = scanner.nextInt();
		int k =0;
		if(n<=0) {
			System.out.println("만족하는 k값 없음 ");
			return;
		}
		if(n==1) {
			System.out.println("만족한느 k값: 0");
		}
		while(true) {
			n = n/2;
			k++;
			if(n==1)break;
		}
		//방법2
		System.out.println("공식을 만족하는 k값 :"+k);
	}

}

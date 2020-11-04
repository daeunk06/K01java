package ex05Method;

import java.util.Scanner;

public class QuFindPrimeNumber {
	public static boolean isPrimeNumber(int num) {
		if(num==1) {
			return false;// 1은 소수가 아니니까
		}
		else {
			/*
			 모든 자연수는 1과 자기자신으로 나누어지므로 두 조건을 제외한 나머지 수로 나누어 떨어지는지 판단하라.
			 */
			for(int i=2; i<=num-1;i++) {
				if(num%i==0) {
					return false;
	
				}
				//위 조건을 통과하게 되면 소수이므로 ture반환
			}
			
			return true;

		}
		
		
	}
	public static void main(String[] args) {
		//1~100사이의 정수를 소수인지 판단한다.
		for (int i=1; i<=100; i++) {
			// 만약해당숫자 i가 소수라면 콘솔에 출력.
			if(isPrimeNumber(i)== true) {
				System.out.println("소수:"+i);
			}
			
		}
//	static void isPrimeNumber(int a) {
//		if(a==2 || a==3) {
//			System.out.println("True");
//		}
//		else {
//			if(!(a%2==0 || a%3==0)) {
//				System.out.println("True");
//			}
//			else {
//				System.out.println("False");
//			}
//		}
//		
//	}

//		Scanner scanner = new Scanner(System.in);
//		int num = scanner.nextInt();
//		isPrimeNumber(num);
//		System.out.println("2");
//		System.out.println("3");
//		for (int i = 4; i <= 100; i++) {
//			if (!(i % 2 == 0 || i % 3 == 0)) {
//				System.out.println(i);
//			}
//
//		}
	}

}

package ex05Method;

import java.util.Scanner;

public class QuSimpleOperation {
	static void arithmetic() {
		//static void arithmetic(int a, int b)
		//System.out.printf("덧셈결과 -> %d + %d = %d\n",a,b,(a+b));
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		System.out.println("덧셈결과 ->"+ (num1 + num2));
		System.out.println("뺄셈결과 ->"+ (num1 - num2));
		System.out.println("곱셈결과 ->" +(num1 * num2));
		System.out.println("나눗셈 몫 ->"+ (num1 / num2));
		System.out.println("나눗셈 나머지 ->" +(num1 % num2));
	}
	public static void main(String[] args) {
		arithmetic();
		//arithmetic(10,20);

	}




}

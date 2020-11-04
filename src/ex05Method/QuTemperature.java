package ex05Method;

import java.util.Scanner;

//섭씨 화씨 서로변환하는  프로그램
public class QuTemperature {
	//섭씨 => 화씨
	static double Celsius(int c) {
		double f = 1.8 * c + 32;
		System.out.println("섭씨"+c +" = 화씨"+f);
		System.out.println();
		return f;
	}
	//화씨 => 섭씨
	static double Fahrenheit(int f) {
		double c = (f-32) / 1.8;
		System.out.println("화씨"+f +" = 섭씨"+c);
		return c;
		//return (f-32) / 1.8; 이렇게 해도 된다네
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("섭씨:");
		int ce = scanner.nextInt();
		System.out.println("화씨:");
		int fa = scanner.nextInt();
		Celsius(ce);
		Fahrenheit(fa);
	}

}


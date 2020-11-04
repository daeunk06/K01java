package Quize;

import java.util.Scanner;

public class QuConvertTime {
	public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("시간으로 변환할 초(second)를 입력하세요:");
		int a = scanner.nextInt();
		int hour = a / 3600;
		int min = (a%3600)/60;
		int sec = (a%3600)%60;
		System.out.printf("[%d시간 %d분 %d초]",hour,min,sec);


	}

}

package Quize;

import java.util.Scanner;


public class QuPalindromeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("회문인지 판단할 숫자를 입력해주세요:");
		int num = sc.nextInt();
		int len = Integer.toString(num).length();
		int temp = 0;
		int a = num;
		for(int i=1 ;i<=len;i++) {
			temp =temp + num % 10;
			num = num / 10;
			if(i<len)
			temp = temp * 10 ;
		}
		System.out.println("입력한정수를 뒤집어서 만든수:"+temp);
		if(temp == a) {
			System.out.println("입력하신 숫자는 회문입니다.");
		}
		else {
			System.out.println("입력하신 숫자는 회문이 아닙니다.");			
		}
	}

}

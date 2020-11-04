package Quize;

import java.util.Scanner;

public class QuPalindromeStr {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("회문인지 판단할 단어를 입력해주세요:");
		String voca = sc.nextLine();
		int len = voca.length();
		boolean a = true;
		for(int i=0;i<len;i++) {
			if(voca.charAt(i)!=voca.charAt(len-1-i)){
				a = false;
				break;
			}
		}
		if(a==true) {
			System.out.println("회문임");
		}
		else
			System.out.println("회문아님");
		
	}

}

package ex05Method;

import java.util.Scanner;

/*
연습문제] 사용자로부터 2~9사이의 숫자중 2개를 입력받아
그에 해당하는 구구단을 출력하는 메소드를 작성하시오.
무조건 첫번째 입력받는수가 작아야한다.
입력예]
	첫번째숫자 : 3
	두번째숫자 : 12
	3*1=3 3*2=6........
	........
	...................12*9=108
메소드명 : inputGugudan(int sNum, int eNum)

 */
public class E04MethodType03_2 {
	static void inputGugudan(int startn , int endn) {
		
		for(int fst = startn ; fst <= endn ; fst++) 
		{
			
			for(int sc =1; sc <=9; sc++) 
			{
				int s = fst * sc;
				System.out.printf("%-2d x %-2d = %-2d", fst  ,sc ,s);
				System.out.println("");
			}//하나의 단을 출력 후 줄 바꿈
			System.out.println("");
		}	
	}
	
	
	
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("첫번째숫자:");
		int fst = scanner.nextInt();
		System.out.print("두번째숫자:");
		int sc = scanner.nextInt();
		inputGugudan(fst,sc);
		

	}

}

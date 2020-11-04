package ex04controlstatement;

import java.io.IOException;

public class Qu_04_01 {

	public static void main(String[] args) throws IOException {

		System.out.print("문자하나를 입력하세요:");
		int asciiCode = System.in.read();
		if (asciiCode >= 48 && asciiCode <= 57) {
			 if  (asciiCode%2 ==0) {
				System.out.println("2의 배수입니다.");}
			else {
				System.out.println("2의 배수가 아닙니다.");}
			 
		
			}
		else {
			System.out.println("숫자가 아닙니다");
		}

//		System.out.println("문자하나를 이비력하세요");
		/*
		 * 숫자형 문자가 가지고 있는 아스키코드값에서 48(0의 아스키코드)를 빼면
		 * 해당문자의 정수가 된다
		 * 즉, '4' - '0' = (정수)4
		 */
		int ascii = System.in.read();
		boolean isNumber = (ascii >='0' && ascii <='9');
		if(isNumber==true) {
			//만약 숫자라면
			if((ascii -'0') % 2 == 0){
				System.out.println("2의 배수입니다");
			}
			else{
				System.out.println("2의 배수가 아닙니다");}
		}
		else
		//만약 숫자가 아니라면
		
			System.out.println();

	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	}	



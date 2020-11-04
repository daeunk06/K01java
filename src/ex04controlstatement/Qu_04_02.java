package ex04controlstatement;

import java.io.IOException;

public class Qu_04_02 {

	public static void main(String[] args) throws IOException {
		System.out.print("하나의 문자를 입력하세요");
		int asciiCode = System.in.read();
		
		String a = (asciiCode >= 48 && asciiCode <= 57) ? "숫자입니다" : "숫자가아닙니다" ;
		System.out.println(a);
		
		
		
	}

}

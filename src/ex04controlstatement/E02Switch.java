package ex04controlstatement;

import java.util.Scanner;
/*
 switch문
 	 if 문처럼 조건에 떠ㅏ라 분기하는 제어문으로 
 	 정수식의 값과 동일한 부분을 찾아 실행하는 형태를 가지고 있다.
 	 형식]
 	 	switch(정수식 or 산술식){
 	 	case 값1:
 	 		 실행문1; break;
 	 	case 값2:
 	 		 실행문2; break;	
 	 	default:
 	 		위의 값과 메칭 되지 않을 때 실행되는 문장
 	 		else와 같은 의미
 	 		}
 	 	- switch 문 내부에서 break문을 만나면 실행이 중지되고 블럭 밖으로 탈출한다.
 */
public class E02Switch {
/*
 * Scanner 클래스
 * 	   :JDK5.0에 추가된 클래스로 키보드를 통해 사용자로 부터 값을 입력받을 때 사용함.
 * 		nxtInt()  : 정수 입력
 * 		nextLine() : 문자열을 입력받음.
 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("숫자를 입력하세요");
		int iNum = scanner.nextInt();
		System.out.println("입력한 숫자는:" + iNum);
		
		int remain = iNum % 3;
		
		switch (remain ) {
		case 0 :
			System.out.println("나머지는 0 입니다.");
			break;// switch 문에서 break 만나면 해당 블럭탈출
		case 1 :
			System.out.println("나머지는 1 입니다.");
			break;	
		default :
			System.out.println("나머지는 2 입니다.");
			break;	
	
	
			
		}
		/*
		 switch 사용시 주의 사항
		 -long타입 변수 사용불가
		 -byte/short/int/char/String만 사용가능
		 */
		
//		long ln = 100;
//		switch(ln) {
//		case 100:
//			System.out.println("long타입 사용??");
//		default:
//			System.out.println("안되는군!");
//		}
//		
//		switch(iNum%3 ==0) {
//			System.out.println("논리 식도 안되는군!");
//		}
		
		//문자열이나 문자는 switch문에서 사용가능
		String title = "자바";
		switch(title) {
		case "자바":System.out.println("자바좋아");
			break;
		case "java": System.out.println("JAVA GOOOOd");
				break;
			
		
		
		}
		/*
		 *여러가지 case를 동시에 처리할때는 break 문 없이 case를 나열한다. 
		 *if 문에서 ||(논리or)을 사용한것과 같다
		 */
		int season = 4;
		switch(season ) {
		case 3 : case 4 : case 5:
			System.out.println("봄입니다.");
		case 6 : case 7 : case 8 :case 9:
			System.out.println("여름입니다.");
		case 10:
			System.out.println("가을입니다.");
		case 11: case 12: case 1: case 2:
			System.out.println("겨울입니다.");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

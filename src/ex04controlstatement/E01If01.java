package ex04controlstatement;

import java.io.IOException;

public class E01If01 {
	/*
	 if문(조건문, 분기문)
	 	형식1
	 		IF (조건문){
	 				실행문1;
	 				실행문2;
	 		}
	 		
	 	-if 문의 조건문은 반드시 비교식 혹은 논리식이여야 한다.
	 	-즉, 결과값이 boolean타입(true,false)이어야 한다.
	 	-실행한 문장이 하나인경우 중괄호 생략이 가능하다.
	 */

	public static void main(String[] args) throws IOException {

		int num = 10;
			
		
//		if(num%2) {//괄호안에 조건식이 아닌 산술식임
//			System.out.println("잘못된 조건식입니다.");
//		}
//		if(num) {//10이 참인지 아닌지 어케알아
//			System.out.println("이것도 잘못된 조건식입니다.");
//		}
		
		
			//if문의 조건은 아래와 같이 boolean의 값을 반환하는 조건식이어야 한다.
		if(num%2==0) {
			System.out.printf("%d는 짝수입니다", num);
		}
		
		if(num%2==0 && num>=10) {
			System.out.printf("%n%d는 짝수이고 10보다" + "크거나 같다.%n", num);
		}
		//경우에 따라 무조건 실행되는 if문도 필요
		if(true) {
			System.out.println("무조건 실행되는 if문 입니다.");
		}
		/*
		 if(조건식); -> 조건식에 상관없이 다음문장이 실행되는 형태로 세미콜론은 문장의 끝을 나태내기에 주의해야함.
		 */
		if(num%2 != 0);
		{	//if문 조건에 상관없이 무조건 출력되는 문장임.
			System.out.printf("%d는 홀수입니다ㅣ.", num);
		}
		/*
		 * 조건검사후 실행할 문장이 하나인 경우에는 중괄호를 생략할 수 있다.
		 * 단, 실행문이 2개 이상인 경우에는 한문장만 실행되므로 주의해야한다. 
		 */
		if(num%2==0) 
			System.out.println("\n"+ num + "은 짝수입니다");
		if(num%2 !=0) {
			
			System.out.println("num은"+ num + "입니다");
			System.out.println(num + "은 홀수입니다.");
		}
		
		/*
		 * System.in.read()
		  		:사용자에게 하나의 문자를 입력받을 때 사용하는 함수(매소드)로 입력한 문자의 아스키코드값을 반환한다.
		 * 		헤당함수는 IOException을 기본적으로 가지고 있어서 이를 무시하기 위해 메인함수에서 throws처리함.
		 */
		
//		System.out.print("하나의 문자를 입력하세요:");
//		int asciiCode = System.in.read();// 사용자로부터 문자를 입력받고 싶을 때 사용
//		System.out.println("입력한문자:" + asciiCode);
//		System.out.println("입력한문자:" + (char)asciiCode);
//		
//		
		/*
		 [시나리오] 사용자가 입력한 문자가 숫자인지 판단하는 프로그램을 if문을 통해 구현하시오.
		 */
		
		System.out.print("하나의 문자를 입력하세요:");
		int asciiCode = System .in.read();
		/*
		 *아스키코드값5을 알고있을 때 구현방법
		 '0' => 48
		 '9'=> 57이므로 해당구간안에 있다면 숫자로 판단할 수 있다
		 ※ 숫자의 구가을 정할때는 반드시 논리 And를 사용한다.
		 */
		if(asciiCode>= 48 && asciiCode <= 57) {
			System.out.println("입력한 문자는 숫자입니다.");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.");
		}
		
		
		
		//아스키코드를 모를때 구현하는 방법
		/*
		 char형 문자는 메모리에 저장할 때 아스키코드값으로 저장되므로 아래처럼 비교연사니 가능하다. 또한 산술연산도 가능하다. 
		 */
		if(asciiCode>= '0' && asciiCode <= '9') {
			System.out.println("입력한 문자는 숫자입니다.[아스키값모를때]");
		}
		else {
			System.out.println("입력한 문자는 숫자가 아닙니다.[아스키값모를때]");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

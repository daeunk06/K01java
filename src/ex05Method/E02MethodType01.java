package ex05Method;
/*
 
 Method
 		:객체지향 프로그램에서 행동또는 동작을 의미한다 
 		즉 어떤 하나의 업무를 처리하느 모듈(부속품)이라고 한다.
 규칙
 	
 	-메소드는 반드시class안에 정의해야 한다.
 	-메소드안에 다란 메소드를 정의 할 수 없다
 	-반환타입이 없더라도 반드시void를 명시해야한다.
 	- 이름의 규칙은 변수 명과 동일하다
 Java에서 Naiming rule(이름규칙)
 	-클래스명 : SimpleFunc -> 대문자로 시작하는 Camel case
 	-메소드,변수명: simpleFunc -> 소문자로 시작하는 변형된 Camel case
 	-상수 : SIMPLE_FUNC -> 전체를 대문자로 표현하고 연결된 단어는 언더바 사용
 	-패키지명: simple.func ->전체를 소문자로 표현하고 연결된단어가 있더라도 언더바
 	사용 안함 언더바 대신 (.) 닷을 사용.
 */
/*
 [메소드 형식1]: 메개변수도 없고 반환값도 없는 경우
 	:해당형식은 주로 출력을 담당하는 기능으로 사용된다.
 	반환타입은 반드시 void로 기술
 */
public class E02MethodType01 {

	static void noParamNoReturn() {
		System.out.println("==메뉴를 선택하세요==");
		System.out.println("1.열기,2, 계속하기 3. 종료");
		System.out.println("=======================");
	}
	static void noParamNoReturn2()
	//경우에 따라 함수의 몸체가 없는 경우도 있음
	
	{
		
	}
	static void noParamNoReturn2(int a) {}
	// 동일한 이름으로 함수가 정의도이었으나 매개변수의 
	//갯수로 구분가능>> 다른함수임.
	static void noParamNoReturn3() {
		int returnValue = 89;
		System.out.println("[Return문 이전]");
		
		//return;
		/*
		 위와같이 함수 중간에 return을 쓰게 되면 함수가 즉시 종료되므로 아래 
		 문장은 실행되지 않는 쓰레기코드가 된다. 반드시 조건문과 함께 사용되어야
		 한다. 단, 함수의 마지막 라인에 있는 것은  상관없다.
		 */
		
		if(returnValue%2==0) 
		{
			System.out.println(returnValue + "는 짝수");
			return;
		}
		System.out.println(returnValue + "는 홀수");
		System.out.println("[return문 이후]");
		
	}
	
	public static void main(String[] args) {
		noParamNoReturn();
		noParamNoReturn2();
		noParamNoReturn3();
		// TODO Auto-generated method stub

	}

}

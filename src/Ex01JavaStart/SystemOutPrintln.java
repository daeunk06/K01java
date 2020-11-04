package Ex01JavaStart;

public class SystemOutPrintln {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 100;
		/*
		System.out.println()
		: 내용을 출력한 후 자동으로 줄바꿈
		System.out.print()
		: 출력후 줄바꿈 처리 안함 하고 싶다면 \n을 추가한다
		System.out.printf() 
		: 출력내용을 서식에 맞춰 출력할때 사용 자체적인 줄바꿈 기능 없다. 줄바굼을 위해 \n혹은 %n사용 가능.
		 */
		System.out.println("num1=" + num1);
		System.out.print("num1=" + num1 + "\n");
		System.out.printf("num1=%d%n" , num1);
		/*
		 print()문에서의 + 기호의 역할
		 - 숫자끼리는 실제 덧셈연산
		 -문자열 숫자 변수등 서로 성격이 다른 데이터 기리는 단순 연결만해서 출력한다.
		 */
		System.out.println(7);
		System.out.println(3.14);
		
		// 숫자와 숫자로 인식하여 실제 덧셈연산의 결과를 출력
		System.out.println(3 + 5);
		System.out.println(3.5 + 5.1);
		
		// 문자열과 숫자이므로 단순 연결해서 출력
		System.out.println("3+5=" + 8);
		System.out.println(3.15 + "는 실수입니다.");
		//문자열은 연산의 대상이 아니므로 단순 연결후 출력
		System.out.println("3+5" + "의 연산결과는 8입니다.");
		
		//변수와 문자열을 연결해서 출력
		System.out.println("num1은" + num1 + "입니다.");
	}

}

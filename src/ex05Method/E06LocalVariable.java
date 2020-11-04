package ex05Method;
/*
 Local variable (지역변수)
 -변수는 사용범위(scope)를 가지고 있고 . 해당지역 내에서 만 사용가능
 - 해당지역을 벗어나면 메모리 소멸
 -기본자료형은 스택(stack)이라는 메모리 공간 사용
 -stack은 CPU가 메모리의 생성 및 소멸을 주관.
 */
public class E06LocalVariable {

	public static void main(String[] args) 
	{/*
	main 지역에서 num을 선언하면 그보다 작은 if 문에서는 같은 이름 변수 선언 금지
	큰 지역에서 이미 선언하여 메모리에 상주하고있기 떄문.
	*/
	

		boolean scope = true;
		//int num = 9; 에러발생    
		if(scope) {
			int num = 1;
			num++;
			System.out.println("첫번째 if문 지역:"+ num);
		}
		else {
			int num = 5;
			System.out.println("첫번째 if문 의 else 지역:"+ num);
		}
		/*
		 * if문의 블럭에서 선언되 변수 num은 해당 블럭을 벗어나면 메모리에서 소멸
		 * 따라서 아래에서 num을 선언 가능.
		 */
		int num = 100;
		System.out.println("main메소드 지역:"+ num);
		
		simpleFunc();
		
		System.out.println("main메소드 끝");
		
	}
	/*
	 main에서 선언한 변수num이 메모리에 아직 남아있지만, simpleFunc()
	 메소드는 서로 다른 지역에 정의 되었으므로 같은 이름의 변수를 사용할 수있다.
	 */
	static void simpleFunc() {
		int num = 1000;
		System.out.println("simple메소드 지역:"+ num);
	}

}

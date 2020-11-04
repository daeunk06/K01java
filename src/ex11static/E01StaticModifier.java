package ex11static;
/*
 static variable(정적변수)
 -멤버변수 앞에 static 지정자가 붙으면 정적변수가 된다.
 - 정적변수는 JVM(자바가상머신)에 의해 프로그램이 로드되는
 	시점에 초기화 된다.
 -main() 메소드가 실행되기 전에 이미 초기화 되므로 main메소드
 	실행시 별도의 선언없이 변수를 사용할 수 있다
 
 접근방법
 	-클래스 내부
 		변수명으로 접근가능(일반적인 멤버변수와 동일함)
 	-클래스 외부
 		참조변수.변수명 or 클래스명.변수명
 		둘다가능함.
 */
//static은 놀러가기만하고 놀러오면 안껴줌
class MyStatic {
	/*
	 멤버변수] 인스턴스형 멤버변수는 반드시 클래스의 객체를 생성한 후
	 참조변수를 통해 접근
	 */
	int instanceVar;
	/*
	 정적멤버변수 ] 객체를 생성할 필요없이 클래스명으로 바로 접근이 가능하다
	 프로그램 시작시 이미 메소드 영역에 초기화된다.
	 */
	static int staticVar;
	/*
	 인스턴스형 멤버메소드 ] 인스턴스형 메소드에서는 모든 멤버를
	 	사용 할 수 있다. 인스턴스형,정적변수 둘다 접근가능.
	 */
	void instanceMethod() {
		System.out.println("instanceVar"+instanceVar);//접근가능
		System.out.println("staticVar"+staticVar);//접근가능
		staticMethod();
	}
	/*
	 정적 멤버메소드] 정적메소드 안에서는 인스턴스 멤버를 사용 할 수 없다
	 정적 멤버만 접근 가능하다.
	 (※main메소드 에서는 static으로 선언된 메소드만 호출 할 수 있음)
	 */
	static void staticMethod() {
	//	System.out.println("instanceVar"+instanceVar);//오류
		System.out.println("staticVar"+staticVar);
	//	instanceMethod();//오류
	}
}
public class E01StaticModifier {
	
	public static void main(String[] args) {
		/*
		 일반적인 멤버변수에 접근하는 방법 ->
		 MyStatic 클래스의 객체를 생성한 후 참조변수를 통해 접근한다.
		 */
		//MyStatic.staticVar = 200;이게 위로 가도 상관 놉
		MyStatic mystatic = new MyStatic();
		mystatic.instanceVar =100;
		System.out.println("mystatic.instanceVar ="+
				mystatic.instanceVar );
		/*
		 static(정적) 멤버변수 접근방법
		 방법1: 클래스명을 통해서 접근한다. 객체 생성없이
		 	바로 접근이 가능하다.
		 */
		MyStatic.staticVar = 200;
		System.out.println("MyStatic.staticVar ="+
				MyStatic.staticVar);
		/*
		방법2: 일반적인 멤버변수 처럼 참조변수를 통해 접근하는 것도 가능하다
		 	단, 이경우는 정적변수를 일반적인 멤버변수로 착각할 수 
		 	있으므로 자바에서 권장하지 않음
		 */
		mystatic.staticVar = 300;
		System.out.println("mystatic.staticVar ="+
				mystatic.staticVar);
		
		///////////////////////////////////////////////
		
		MyStatic ms1 = new MyStatic();
		MyStatic ms2 = new MyStatic();
		
		ms1.instanceVar = 100;
		ms2.instanceVar = 1000;
		/*
		 인스턴스형 멤버변수는 객체별로 각각 존재하므로 아래 초기화된 값은
		 객체별로 각각 저장된다. 따라서 출력결과 100,1000이 된다.
		 */
		System.out.println("ms1.instanceVar"+ms1.instanceVar);//100
		System.out.println("ms2.instanceVar"+ms2.instanceVar);//1000
		/*
		 정적멤버변수는 각 각 의 객체마다 멤버변수가 존재하지 않고, 메소드 영역에
		 하나만 생성되어 공유됨으로 , 아래 대입 문장은 하나의 변수에 값이 할당되게
		 된다 따라서 결과는 둘다 900.
		 */
		ms1.staticVar = 800;
		ms2.staticVar = 900;
		
		System.out.println("ms1.staticVar"+ms1.staticVar);//900
		System.out.println("ms2.staticVar"+ms2.staticVar);//900
		/*
		 정적 멤버메소드의 접근방법은 정적 변수의 접근방법과 동일하다.
		 */
		mystatic.instanceMethod();
		mystatic.staticMethod();//권고사항이 아니므로 클래스명을 통해 접근하는게 좋다
		
		//MyStatic.instanceMethod();//에러발생(참조변수를 통해서만 호출가능)
		MyStatic.staticMethod();
		
	}

}

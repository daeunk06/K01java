package ex08class;
/*
 생성자 (constructor)
 -클래스를 객체화(인스턴스)할때 자동으로 호출되는 메소드
 -자동으로 호출되며, 개발자가 임의로 호출 할 수 없다
 -반환값이 없다. 즉, 특정연산 후 값을 반환할 수없다
 		따라서 void를 사용하지 않는다
 -그외는 메소드가 가진 모든 특징을 가지고 있다 (매개변수 전달, 오버로딩등..)
 생성자 내에서 this 사용법
 용도1: 동일 클래스 내에서 다른 생성자를 호출 할때 사용한다.	
 	단, 생성자 내에서만 호출 가능하다
 	사용법:
 		this (인자1,인자2......);
 용도 2. : 생성자내에서 멤버변수와 매개변수의 이름이 동일할때
 		구분하기위해 사용된다.
 		this변수 => 멤버변수
 		변수> 생성자의 매개변수
 		단, 이름이 서로다르다면 this 는 생략해도 된다. 주로 명시적인
 		코드작성을 위해 사용된다. 
 		
 */
public class PersonConstructor {
	//멤버변수
	String name;
	int age;
	String addr;

	/*
	 디폴트 생성자 
	 	: 해당 클래스에 생성자를 정의하지 않은 경우에
	 	아래와 같은 매개변수, 실행부가 없는 생성자가
	 	자동으로 삽입딘다. 단, 생성자를 하나라도 정의하면
	 	디ㅣ폴트 생성자는 삽입되지 않는다/.(주의)
	 */
	//public PersonConstructor() {}
	
	//생성자 1: 기본생성자
	public PersonConstructor() {
		name = "이름없음";
		age = 0;
		addr = "미상";
		System.out.println("나는 기본 생성자 입니다.");
	}
	//생성자 2: 인자생성자
	public PersonConstructor(String name) {
		//멤버변수와 매개변수를 구분하기 위해 this를 사용한다
		//좌측이 멤버변수 우측이 매개변수
		this.name = name;
		age = 1;
		addr = "출처불명";
		System.out.println("나는 인자생성자[1] 입니다.");
		
	}
	public PersonConstructor(String name, int age) {
		/*
		 this는 생성자내에서 다른 생성자를 호출할떄 사용된다.
		 단, 생성자내에서만 사용가능하고, 일반멤버메소드에서는 
		 사용불가.
		 */
		this(name,age,"미상");
		System.out.println("나는 인자생성자[2] 입니다.");
	}
	public PersonConstructor(String _name, int age,
			String addr) {
		//매개변수와 맴버변수의 이름이 다르면 this안써도 된다.
		name = _name;
		//변수명이 동일한 경우에만 this사용하는 걸 권장한다.
		this.age = age;
		this.addr = addr;
		System.out.println("나는 인자생성자[3] 입니다");
	}//멤버 메소드: 멤버변수를 초기화하는 목적으로  정의한 메소드
	void initialize (String name, int age, String addr) {
		//해당코드는 생성자 내에서만 사용가능
		//this(name,age,"미상");생성자메소드가 아님.
		
		//멤버변수를 구분하기 위한 this는 멤버메소드에서도 사용가능하다
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	void showPersonInfo() {
		
		System.out.printf("%s님의 정보\n", this.name);
		System.out.printf("나이:%d\n",age);
		System.out.printf("주소:%s\n",addr);
	}

}

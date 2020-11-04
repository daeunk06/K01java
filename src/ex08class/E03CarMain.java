package ex08class;

import java.security.acl.Owner;

class car{
	//[멤버상수]
	public static final String AUTO = "자동";
	public static final String MANUAL = "수동";
	
	//[멤버변수]
	String carGear = AUTO;//미션
	String carModel ; //모델명
	int carYear; //연식
	Human owner;/*
	/소유주: Human 클래스를 기반으로 하는 멤버변수로
	 * 초기화를 위해 이름,나이 ,에너지 세가지의 값 필요
	 * 이와 같이 클래스를 구성할때 또 달느 객체를 멤버변수로 선언할 수있다.
	 */
	
	
	//멤버메소드
	void drive() {
		System.out.println(owner.name + "이(가)" + carModel +"을 운전한다.");
		
	}
	/*
	 객체의 초기화를 담당하는 메소드로 아래는 항상 같은 값으로만
	 초기화 한다는 단점을 가짐
	 */
	void initialize() {
		carModel = "람보르기니";
		carYear = 2017;
		owner = new Human();
		owner.name = "캡틴로져스";
		owner.age = 30;
		owner.energy = 10;
	}
	/*
	 위와 동일한 이름의 함수로 오버로딩에 의해 정의된 초기화 메소드
	 초기화를 진해하는 역할은 동일하나 매개변수를 통해 다양한 형태의
	 객체를 초기화 할 수있다.
	 */
	void initalize(String model, int year , String name,
			int age , int energy) {
		carModel = model;
		carYear = year;
		/*
		 또 다른 객체가 멤버변수로 정의되었으므로 객채를 생성한 후
		 각가의 멤버변수를 초기화 해야한다.
		 */
		owner = new Human();
		owner.name = name;
		owner.age = age;
		owner.energy = energy;
	}
	//해당 객체의정보를 디스플레이함
	void showCarInfo() {
		System.out.println("[차량정보]");
		System.out.printf("모델명:%s\n", carModel);
		System.out.printf("연식:%d\n",carYear);
		System.out.printf("기어%s\n",carGear);
		owner.showState();
	}
}// end of car class
public class E03CarMain {

	public static void main(String[] args) {
		//자동차1 객체 생성
		car car1 = new car();
		System.out.println("[초기화메소드 호출전]");
		System.out.println("car1.owner="+ car1.owner);
		//car.drive(); <-에러 발생
		/*
		 자동차 소유주를 표현하는 human객체가 초기화 되지 앟은 상태에서 출력을 시도하여
		 런타임에러가 발생된다.
		 */
		
		System.out.println("[초기화 메소드 호출 후]");
		car1.initialize();// 고정된 내용으로 초기화 진행
		car1.drive();
		car1.showCarInfo();
		//자동차2 객체 생성: 객체생성 후 멤버변수에 직접 접근해 초기화한다.
		car car2 = new car();
		car2.carGear = car.MANUAL;
		car2.carModel = "밴틀리";
		car2.carYear= 2018;
		
		car2.owner = new Human();
		car2.owner.name = "토니스타크";
		car2.owner.age = 52;
		car2.owner.energy = 8;
		
		System.out.println("자동차정보와 소유자 정보 같이 보기");
		car2.showCarInfo();
		
		//세번째 자동차 객체생성(권장방법): 매개변수가 있는 초기화
		//메소드를 이용헤 초기화
		
		car car3 = new car();
		car3.initalize("스포츠카", 2012, "성유겸", 8, 10);
		car3.showCarInfo();
	}

}

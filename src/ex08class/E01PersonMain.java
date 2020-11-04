package ex08class;
/*
 추상화
 	: 현실세계의 사물을 클래스로 형상화 하는것을 추상화한다고 한다
 	person클래스는 "사람"의 일반적인 시행을 추상화하고있다
 */
class person{
	/*
	 멤버 변수: 클래스에서 주로 데이터를 표현한다.
	 */
	String name = "정우성";
	int age = 47;
	String gender = "남자";
	String job = "영화배우";
	/*
	 멤버메소드: 클래스에서 객체의 동작(행위)를 표현한다
	 	 클래스외부에서 호출할 때는 객체의 참조변수를 통해 호출한다.
	 */
	void eat() {
		System.out.printf("%s가(이) 식사를 한다\n", name);
	}
	void sleep() {
		System.out.printf("나이가 %d인 %s가(이) 잠자고 있다.\n",
				age, name);
	}
}
public class E01PersonMain {
	/*
	 eprson클래스를 통해 인스턴스(객체)를 생성한다
	 생성시 할당된 주소값이 변환된다.
	 */
	public static void main(String[] args) {
		
		person person = new person();
		//객체의 참조변수를 이용해 멤버매소드를 호출 할 수 있다.
		person.eat();
		person.sleep();
		
		new person().eat();
		new person().sleep();//new 3번써서 person 객체 3개가 만들어진거임
		
		
	}

}

package ex08class;
//get은 반환하는 용도 함수, set초기화 하기위한 함수
class Triangle{
	//맴버변수
	int height;//높이
	int bottom;//밑변
	public void init(int b, int height) {
		this.height = height;
		bottom = b;
	}
	//삼각형의 넓이를 구하는 멤버메소드
	public double getArea() {
		return (bottom * height / 2);
	}
	//밑변을 설정
	public void setBottom(int a){
		bottom = a;
	}
	//높이를 설정
	public void setHeight(int b) {
		height = b;
	}
}

public class QuTriangle {
	public static void main(String[] args)
	{
		Triangle t = new Triangle();
		t.init(10, 17); //밑변10, 높이17로 초기화
		System.out.println("삼각형의 넓이 : " + t.getArea());//출력된다>>반환값있음
		t.setBottom(50);//밑변 50으로 변경
		t.setHeight(14);//높이 14로 변경
		System.out.println("삼각형의 넓이 : " + t.getArea());
	}
}

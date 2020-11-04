package ex05Method;

public class QuCircleCalculator {
	//반환값이 없는 형태
	static void  circleArea(double r) 
	{
		double area = 3.14 * r * r;
		System.out.println("원의 넓이 : "+ area);
	}
	//반환값이 있는 형태
	static double  circleRound(double r)
	{
		double round = 2 * 3.14 * r;
		return round;
	}

	public static void main(String[] args)
	{	//원의 넓이를 구하는 함수는 반환값이 없어 함수내에서 즉시 결과 출력된다.
		circleArea(10.2);
		//원의 둘레를 구하는 함수는 반환값이 있으므로 값을 반환받아 출력한다.
		System.out.println("원의 둘레 : "+ circleRound(12.3));
		
	}

		


	

}

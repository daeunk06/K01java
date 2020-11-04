package ex04controlstatement;

public class E05For {
/*
 * for문: while문과 같은 반복문으로 초기값, 조건식, 증감식이 한줄에 있어
 * 반복횟수를 명시적으로 알 수 있는 반복문이다. 그러므로 사용빈도가 가장높다.
 * 형식]
 * for(초기값;조건식;증감식){
 * 		실행문장;
 * }
 * 실행순서]
 * 	초기값> 조건식 확인 > 참일때 실행> 증감식> 조건식 확인> 반복실행....
 * > 조건이 거짓일때 for문 탈출
 */
	public static void main(String[] args)
	{

		/*
		 for문의 실행순서
		 1. 반복을 위한 변수 i를 초기화
		 2. 조건을 검사
		 3.참이면 실행문 실행
		 4. 증감식 실행
		 5. 조건검사(3,4,5번을 반복횟수만큼 실행함)
		 6. 조건이 false일때 for문 종료.
		 */
		for(int i =1 ; i<=5 ; i ++)
		{
			System.out.println("i="+i);
		}
		/*
		 시나리오] 1~100까지의 합을 구하는 프로그래믈 for문을 사용해서 구해라.
		 */
		int sum = 0;
		for(int j=1 ; j<=100; j++)
		{
			sum+= j;
		}
		System.out.println("1~100까지의 합:" + sum);
		/*
		 * 시나리오 ] for 문을 이용하여 1~10 사이의 정수중 2의 배수의합을 구하는 프로그램을 작성하시오
		 */
		int total = 0 ;
		//방법1: if문을 통한 구현
		for(int i=1 ; i<=10 ; i++) 
		{
			if(i%2==0) 
			{
				total += i;
			}
		}
		System.out.println("1~10사이 2의 배수의 합:" + total);
		//방법2:if문 없이 구현
		total = 0;
		// 증감 연산자 대신 복합연산자도 사용가능함.
		for(int i=0 ; i<=10 ; i+=2) 
		{
			 total += i;
				
			
		}
		System.out.println("1~10사이 2의 배수의 합:" + total);
		//for문으로 무한루프조건을 만들때 아래와 같이 사용함
//		int a = 1;
//		for(;;) {
//			System.out.println("나는 for문으로 만든 무한루프입니다." + a);
//			a++;
//		}
		/*
		 * for문의 끝에;을 사용하면 반복할 문장이 없는 것으로 간주되어  for문과 상관없이 한번만 실행
		 */
		for(int j=0 ; j <=5 ; j++); {
			System.out.println("어랏,,, 나는 누구? 여긴 어디?");
		}
		/*
		for문의 초기식에서 선언된 변수 j는 for문이 종료되는 순간 메모리에서 소멸된다. 여기서 사용된 변수j는
		지역변수 (Local variable)라고 한다. 지역변수는 해당지역을 벗어나면 즉시 소멸되는 특징을 가진다.
		 */
		//System.out.println("위 for문에서 선언한 변수 j=" + j);
		System.out.println("위 main함수 지역에서 선어난 변수 total=" + total);
		
		/*
		 for문의 초기값을 외부(넓은지역)에서 선언하면 해당변수는 for문 안쪽(좁은지역) 에서 사용가능
		 즉 아래 선언한 변수 i는 main()함수 지역변수가 된다.
		 */
		
		int i = 0;
		for( ; i<=5 ; i++)
		{
			System.out.println("for문 안에서의 i의 값=" +i);
			
		}
		System.out.println("for문 밖에서의 i의 값=" + i);
		
		/*
		 * 연습문제] 구구단을 출력하는 프로그램을 for문으로 작성하시오
		 */
		System.out.println("for문으로 제작한 구구단");
		for(int dan=2; dan<=9 ; dan++) 
		{
			
			for(int su=1; su<=9; su++) 
			{
				int s = dan * su;
				System.out.printf("%-2d x %-2d = %-2d", dan ,su ,s);
				System.out.println("");
			}//하나의 단을 출력 후 줄 바꿈
			System.out.println("");
		}
		
		
		
		
		
		
		
		
		
		/*
		 * 시나리오 ] 다음의 출력결과를 보이는 for 문을 작성하시오
		 * 출력결과
		 *   	 0 0 0 1
		 *       0 0 1 0
		 *       0 1 0 0
		 *       1 0 0 0
		 *       해법: x와 y를 더해서 5개 될때 1을 출력한다.
		 */
		System.out.println("==증가연산자 사용으로 구현==");
		for(int x=1; x<=4; x++)
		{
			for(int y=1; y<=4; y++)
			{
				if(x+y==5) 
					System.out.println("1 ");
				else
					System.out.println("0 ");
			}
			System.out.println();
		}
		for(int x=1; x<=4; x++)
		{
			for(int y=4; y>=1; y--)
			{
				if(x==y) 
					System.out.println("0 ");
					else
						System.out.println("1 ");
			}
			System.out.println();
		System.out.println("==감소연산자 사용으로 구현==");
		
		
		
		}
		}
}
	


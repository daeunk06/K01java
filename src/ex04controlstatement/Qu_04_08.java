package ex04controlstatement;

public class Qu_04_08 {

	public static void main(String[] args) {
		
		final int FLOOR = 15;
		/*
		 FLOOR -x +1
		 	: 변수x가 증가함에 따라 점점 감소하는 y를 표현하기
		 	위한 일반식
		 */
		//세로 층 반복
		for(int x=1; x<=FLOOR; x++) {
			//가로반복
			for(int y=1; y<=(FLOOR - x+1); y++) {
				System.out.print("* ");
				
			}
			System.out.println("");
		}

//		for(int i=5;i>=1;i--)
//		{
//			for(int j=1;j<=i;j++)
//			{
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//		
//		
		
	}

}

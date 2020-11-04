package ex06arry;

public class E05TwoDimArray02
{

	public static void main(String[] args)
	{
		//세로크기3, 가로크기 4인 배열 선언
		int[][] arr2Dim = new int[3][4];
		//세로,가로 크기만큼 반복하면서 초기화 진행
		for(int i =0; i<3 ;i++) 
		{
			for(int j=0; j<4; j++) 
			{
				arr2Dim[i][j] = i+j;
			}
		}
		//초기화 된 데이터를 출력
		for(int n=0; n<arr2Dim.length; n++)
		{
			for(int m=0; m<arr2Dim.length; m++)
			{
				System.out.println(arr2Dim[n][m]+ "");
			}
		}System.out.println();
	
	/*
	 시나리오] 다음 절차에 따라 프로그램을 작성하시오
	 1. 2차원 배열을 선언한다. 시로2, 가로4
	 2.난수를 이용하여 배열을 초기화한다.
	 3. 배열전체요소를 매개변수로 전달된 정수만큼 증가시킨다.
	 4.증가되기 전,후 배열을 출력한다.
	 5.다음 메소드명으로 구현한다. twoDimPlus()
	 */
		int[][] twoArray = new int[2][4];
		for(int i=0; i<twoArray.length; i++ ) 
		{
			for(int j=0; j<twoArray[i].length;j++){
				twoArray[i][j]= (int)(Math.random() * 100);
			}
		}
			System.out.println("=초기화후==================");
			showArray(twoArray);
	
			twoDimPlus(twoArray,10);
	
			System.out.println("=메소드호출후======================");
			showArray(twoArray);
	}//2차원 배열에 매개변수만큼  각요소를 증가시키는 함수
	static void showArray(int[][]arr2) {
		for(int i =0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length;j++) {
				System.out.printf("%-3d", arr2[i][j]);
			}
			System.out.println();
			
		}
		
	}
	static void twoDimPlus(int[][] arr2, int plusNum) {
		for(int i=0; i<arr2.length ; i++) {
			for(int j=0; j<arr2[i].length;j++) {
				//매개변수로 전달된 plusNum만큼 각 요솔를 증가시킨다.
				arr2[i][j] += plusNum;
			}
		
		}
	}

	

	
}

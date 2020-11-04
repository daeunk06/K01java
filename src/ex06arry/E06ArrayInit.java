package ex06arry;

public class E06ArrayInit {
	public static void main(String[] args) {

		/*
		 1,2차원 배열은 최초 생성시 크기가 지정된 경우에 전체 요소가 0으로 채워진다. 
		 */
		int[] arr = new int[3];
		System.out.println("arr[0]=" + arr[0]);
		
		int[][] arr2 = new int [3][4];
		System.out.println("arr2[0][0]="+ arr2[0][0]);
		/*
		 1차원 배열의 경우 요소의 갯수에 의해 크기 결정
		 2차원도 마찬가지이나 가장 큰 요소의 갯수에 의해 크기가 정해진것
		 초기화가 진행된 경우 빈 부분은 null로 지정된다.
		 */
		System.out.println("배열 선언과 동시에 초기화가 진행");
		int[] arrDim = {1,2,3};
		System.out.println("arrDim[0]="+ arrDim[0]);
		
		int[][] arr2Dim = {
				{1},
				{2,3}
		};
		System.out.println("ar2Dim[0][0]="+arr2Dim[0][0]);
		//System.out.println("ar2Dim[0][1]="+arr2Dim[0][1]);
		// 해당인덱스는 null이므로 출력이 불가능하다.
	}

}

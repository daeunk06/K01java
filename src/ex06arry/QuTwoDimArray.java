package ex06arry;

public class QuTwoDimArray {

	public static void addOneArr(int[] arr,int add) 
	{
		for(int i=0; i<arr.length;i++) {
			arr[i] += add;
		}
	}
	public static void addTwoArr(int[][] arr, int add)
	{//세로반복을 통해 한행씩 전달
		for(int i=0; i<arr.length; i++) {
				addOneArr(arr[i], add);
			
		}
	}
	public static void main(String[] args) {
		//배열 선언: 빈 부분은 null로 초기화 된다.
		int[][] arr = {
				{1,2,3,4},
				{5,6,7},
				{8,9}
		};
		arrPrint(arr);
		addTwoArr(arr, 2);
		arrPrint(arr);
	}
	 static void arrPrint(int[][] arr) {
		 for(int i=0; i< arr.length;i++) {
			 for(int j=0; j < arr[i].length; j++) {
				 System.out.printf("%d",arr[i][j]);
			 }
		 }System.out.println("");
	}
}

package Quize;

import java.util.Random;

/*
버블정렬 : 정렬이 진행되는 과정이 거품이 보글보글 피어오르는 모습과 비슷하다 하여
지어진 명칭 정렬알고리즘 중에서 가장 단순하고 효율이 떨어지는 알고리즘
데이터 10개면 45번의 비교가 필요
*/
public class QuBubbleSort {
	private static void bubleSort(int[] arr, int orderSelect) {
		// TODO Auto-generated method stub
		
	}
	private static int menuselect() {
		// TODO Auto-generated method stub
		return 0;
	}
	private static void showArray(int[] arr, String string) {
		// TODO Auto-generated method stub
		
	}
	static Random ran = new Random();
	public static void main(String[] args) {
		int[] arr = new int[10];
		showArray(arr, "난수 생성 직후 배열 출력");
		int orderSelect = menuselect();
		
		bubleSort(arr,orderSelect);
		showArray(arr,"버블정렬 이후 배열출력");
	
	while(true) {
		for(int i=0;i<arr.length;i++) {
			arr[i]=ran.nextInt(99)+1;
		}
		
		boolean rndFlag = false;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr.length;j++) {
				if(i!=j&&arr[i]==arr[j]) {
					rndFlag=true;
				}
			}
		}
		if(rndFlag==true) break;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	}
}

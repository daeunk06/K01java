package ex06arry;

import java.util.Scanner;

public class QuFillArray {
/*
 * 문제3) 홀수/짝수 구분하여 배열채우기
파일명 : QuFillArray.java
길이가 10인 배열을 선언한후 총 10개의 정수를 입력받아 순서대로 저장한다. (첫번째배열)
그리고 순서대로 저장된 숫자들을 홀수는 배열의 앞에서부터 채워나가고 짝수는 배열의 끝에서부터 채워나간다.(두번째배열

 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int[] arr1 = new int[10];//입력받은 정수 순서대로
		int[] arr2 = new int[10];//짝수 홀수 구분해서
		
		int indexStart =0;//홀수일떄 첫번쨰 인덱스
		int indexEnd = arr2.length -1;//짝수일때 마지막 인덱스
		
		for(int i=0;i<arr2.length;i++) {
			System.out.print("채울 숫자를 입력하세요:");
			int inputNum = scanner.nextInt();
			//첫번째 배열에는 입력한 순서대로 채워준다.
			arr1[i] = inputNum;
			
			if(inputNum%2==1) {
				//입력받은 숫자가 홀수면 앞에서 부터 채우고 인덱스 +1 증가
				arr2[indexStart++] = inputNum;
			}
			else {
				//입력받은 숫작 짝수 이면 뒤에서 부터 채우고 인덱스-1 감소
				arr2[indexEnd--]= inputNum;
			}
		}
		// 두개의 배열 출력하기
		System.out.println("첫번째 배열 출력");
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+"");
		}
		System.out.println("\n두번째 배열 출력");
		for(int i=0; i<arr2.length;i++) {
			System.out.print(arr2[i]+"");
		}
//		int[] num = new int[10];
//		for(int i=0; i<num.length;i++) {
//			System.out.printf("%d번째 정수를 입력하세요:",i+1);
//			int a = scanner.nextInt();
//			
//			num[i]= a;
//			
//		}
//		for(int j=0; j<num.length;j++) {
//			System.out.print(num[j]);
//		}System.out.println();
//		
//		int[] num2 = new int[10];
//		int b = num2.length-1;
//		int a = 0;
//		for(int k=0; k<num2.length; k++) {
//			if(num[k]%2==0) {
//				
//				num2[b]=num[k];
//				b--;
//			}
//			else {
//				num2[a]=num[k];
//				a++;
//			}
//			
//		}
//		System.out.println("홀수/짝수 구분입력결과");
//		
//		for(int j=0; j<num.length;j++) {
//			System.out.print(num2[j]);
//		}		
	}

}

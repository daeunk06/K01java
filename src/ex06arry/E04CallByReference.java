package ex06arry;

public class E04CallByReference {
/*
 call By Reference (참조에 의한 호출)
  	: 매소드를 호출할때 참조값을 전달함으로써 서로 다른
  	지역에서도 동일한 메모리(힙영역)을 참조할 수 있게 하는 호출 방식
  	메소드의 지역이 다르더라도 참조값을 통해 참조하게 되므로 A영역의 값의 변경을 B영역에서도
  	그대로 참조할 수 있는 장범이 있다.
  	참조값만 전달하므로 프로그램의 퍼포먼스(성능)도 향사되고 메모리도 절약할 수 있다.
 */
	public static void main(String[] args) {
		
		int[] arr= {100,200};
		System.out.println("[메인메소드]-Swap전 출력");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+ "");
		}
		System.out.println();
		callByReference(arr);
		
		System.out.println("[메인 메소드]-Swap이후 출력");
		for(int i =0; i<arr.length;i++) {
			System.out.println(arr[i]+"");
		}
	}
	static void callByReference(int[] ref) {
		int temp;
		temp = ref[0];
		ref[0] = ref[1];
		ref[1] = temp;
	}

}

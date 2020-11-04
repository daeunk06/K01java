package Quize;

import java.util.Scanner;

public class buyobject {
	static void buyObject(int bmoney) {
		int buyCount =0;
		for(int i=1;i<bmoney/bread ; i++) {
			for(int j=1;j<bmoney/snack;j++) {
				for(int k=1; k<bmoney/drink;k++) {
					if((bread*i)+(snack*j)+(drink*k)==bmoney) {
						System.out.printf("빵%d개, 과자%d개, 음료%d개\n",i,j,k); 
						buyCount++;
					}
				}
			}
		}
		if(buyCount==0) {
			System.out.println("해당금액으론 구매불가능합니다");
		}
		else
			System.out.println("출력된 방법중 하나를 선택하세요");
	}
	static final int bread = 500;
	static final int snack = 700;
	static final int drink = 400;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구매할 금액을 입력하세요(1600원이상):");
		int buymoney = sc.nextInt();
		//입력받은 금액을 매개변수로 물건구하기
		buyObject(buymoney);
		
	
	}
}

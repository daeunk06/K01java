package ex04controlstatement;

public class Qu_04_09 {

	public static void main(String[] args) {
		//su(i)가 고정된 상태에서 dan(j)이 증가하는 형태
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				int sum = i * j;
				System.out.printf("%d*%d=%2d ",j,i,sum);
				
			}
			System.out.println("");
			
			
			
		}
		
		
		
		
		
		
		

	}

}

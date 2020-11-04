package ex04controlstatement;

public class Qu_04_07 {

	public static void main(String[] args) {

		int sum =0;
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 || i%7==0)
			{
				if(i%3==0 && i%7==0)
					continue;
				else
					sum += i;
					if(i>=99) {
						System.out.printf("%d ", i);
					}
					else
					System.out.printf("%d +", i);
	
				
			}		
			else {
				continue;
			}
		}
		System.out.println("="+ sum);
		
		
		
		
		
		
		
		
		
	}

}

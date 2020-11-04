package ex04controlstatement;

public class E06BreakContinue
{
	/*
	 break 문
	 	: 반복문이나 switch문에서 주로 사용되며 블럭내에서 break문을 만나게 되면 해당블럭을 탈출한다.
	 	만약 중첩된 반복문이라면 가장 가까운 블럭하나만 탈출
	 continue 문 
	 	: 반복문에서 continue문을 만나게 되면 블럭의 처음으로 돌아가서 조건을 확인한다. 
	 	따라서 continue아래 문장이 실행되지 않음.
	 */

	public static void main(String[] args)
	{
		/*
		 반복문내에서 break,continue문을 사용할 땐 반드시 조건문과 함께 사용해야한다. 그렇지 않으면 아래와 같은
		 Unreachable code 에러가 발생.
		 */
		int i =0;
		while(true)
		{
			i++;
			System.out.printf("[i가 %d 일때]\n", i);
			
			System.out.println("continue 이전출력문");
			if(i%2==0)continue;
			System.out.println("continue 이후출력문");
			
			
			System.out.println("break 이전출력문");
			if(i==3)break;
			System.out.println("break 이전출력문");
			
			
		}
		/*
		 중첨된 반복문 안에서 break문을 만나면 "가장가까운 반복문 하나"를 탈출.
		 */
		for(int x =1 ; x<=5 ; x++) 
		{ 
			System.out.println("x="+ x);
			
			for(int y=1; y<=5 ; y++)
			{
				System.out.println("y="+ y);
				if(y==3)
					break;
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}

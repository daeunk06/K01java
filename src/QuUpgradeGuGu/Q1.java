package QuUpgradeGuGu;

import java.io.PrintStream;

public class Q1 {

	public static void main(String[] args) {
		
		for(int i = 2; i <= 9; i++) 
		{
			for(int j=1; j<=9; j++)
			{
				if(j==1) 
				{
					System.out.println(i+" X "+j+"="+i );
				}
				else 
				{
					int mul = 1;
					for(int k=1;k<=j;k++)
					{
						mul = mul*i;
						if(k==j) {
							System.out.println(i+" ="+mul);
						}
						else {
							System.out.printf("%d X ",i);
						}
					}	
				}
			}
			System.out.println("");
		}
	}

}

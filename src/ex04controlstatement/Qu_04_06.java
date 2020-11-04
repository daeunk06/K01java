package ex04controlstatement;

public class Qu_04_06 {

	public static void main(String[] args) {
		
		
		int x = 1;
		while(x<=5) {
			int y = 1;
			while (y<=x) {
				System.out.print("* ");
				y++;
			}
			y = 1;
			x++;
			
			System.out.println("");
			
		}
		
		

	}

}

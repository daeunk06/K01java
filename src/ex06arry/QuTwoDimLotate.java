package ex06arry;

public class QuTwoDimLotate {
	static void callByReference(int[][] ref)
	{
		int[] lastRow = ref[ref.length -1];
		for(int row = ref.length-1;row>0;row--) {
			ref[row] = ref[row-1];
		}
		ref[0] = lastRow;
//		int temp[][] = new int[ref.length][3];
//		for(int i=0; i<3;i++) 
//			temp[0][i] = ref[ref.length -1][i];
//		for(int i=ref.length-1; i>=0;i--) {
//			
//			for(int j =0; j<3;j++) {
//				if(i>=1 && i<ref.length-1) 
//				ref[i][j]=ref[i-1][j];
//				else if(i==ref.length-1)
//					ref[i][j]=ref[i-1][j];
//				else  
//					ref[0][j]=temp[0][j];
//			}
//		}
		for(int i=0; i<ref.length;i++) {
			for(int j=0; j<ref[i].length;j++) {
				System.out.printf("%d",ref[i][j]);
			}
			System.out.println("");
		}
	}
	public static void main(String[] args) {
		int[][] lotate  = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		callByReference(lotate);
	}
}

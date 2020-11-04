package ex10accesmodifier;
class Rectangle
{
    private int ulx, uly;//좌상단(upper left x, upper left y)
   	private int lrx, lry;//우하단(lower right x, lower right y)
   	boolean a;
   
   	
	/*디폴트()기본 생성자는 개발자가 생성자를 정ㅇ의하지 않았을때만 자동으로 생성된다.
	 * public Rectangle() {
	 * }
	 */
   	
   	
   	public Rectangle(int ulx, int uly, int lrx, int lry) {
   		if(lrx>ulx && lry>uly) {
   			if((0<= ulx && ulx <=100) && (0<= uly && uly <=100)) {
   				this.ulx = ulx; 
   				this.uly = uly;
   				a = true;}
   			else {
   				System.out.println("좌상단 범위가 잘못되었습니다");
   			    a = false;}
   			if((0<= lrx && lrx <=100)&& (0<= lry && lry <=100)) {
   				this.lrx = lrx; 
   				this.lry = lry;}
			else {
   				System.out.println("우하단 범위가 잘못되었습니다");
   				a = false;}
   		}
   		else {
   			System.out.println("좌측 우측 좌표지정이 잘못되었습니다.");
   			a = false;}
   	}   	   	
   	public void showArea()
	{
   		if(a== true)
   			System.out.println("넓이:"+(lrx-ulx)*(lry-uly));
   		else
   			System.out.println("좌표값 오류로 넓이를 계산할 수 없습니다.");
	}
}

class QuRectangle
{
   	public static void main(String[] args)
   	{
		Rectangle rec1 = new Rectangle(1,1,10,10);
		rec1.showArea();
		
		Rectangle rec2 = new Rectangle(-2,-2,101,101);
		rec2.showArea();
		
		Rectangle rec3 = new Rectangle(10,10,1,1);
		rec3.showArea();
   	}
}

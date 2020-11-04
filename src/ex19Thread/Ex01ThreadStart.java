package ex19Thread;
/*
 Thread (쓰레드)
 -쓰레드의 생성은  Thread클래스를 상속받는것부터 시작
 -해당방법은 스레드로 생성할 클래스가 다른 클래스를 상속 받지 않아도 될땨 사용하는 방식
 -만약 해당클래스가 다른 클래스를 상속받아야 한다면  Runnable인터페이스를
 구현하여 사용한다.
 */
class ShowThread extends Thread{
	String threadName;
	public ShowThread(String name) {
		threadName = name;
	}
	/*
	 run()메소드는 쓰레드의 main()메소드 이다
	 Thread클래스의 run()메소드를 오버라이딩한것으로 해당 메소드를 직접 호출하면 
	 안되고 start()메소드를 통해 간접 호출한다
	 직접호출시 쓰레드 생성없이 실행만 된다.
	 */
	@Override
	public void run() {
		for(int i=1 ;i<=100;i++) {
			System.out.println("안녕하세요.["+threadName+"]입니다.");
			try {
				//0.1초 break;
				sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class Ex01ThreadStart {
	public static void main(String[] args) {
		ShowThread st1 = new ShowThread("쓰레드1st");
		ShowThread st2 = new ShowThread("Thread2nd");
	
		//쓰레드 객체를 통한 쓰레드 생성(실행)
		st1.start();
		st2.start();
		/*
		 run()은 호출은 가능하나 쓰레드가 생성되지 않는다 반드시 strat()를 통해
		 간접 호출 해야함
		 */
//		st1.run();
//		st2.run();
	}
}

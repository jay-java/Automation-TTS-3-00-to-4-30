package core;
class ByRunnable implements Runnable{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i+" by runnable");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
class ByThread extends Thread{
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			try {
				System.out.println(i+" by runnable");
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
public class P023_Thread {
	public static void main(String[] args) {
		Thread t = new Thread();
		System.out.println(t.currentThread());
		t.setName("MyThread");
		System.out.println(t);
		System.out.println();
		for(int i=1;i<=5;i++) {
			System.out.println(t);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		ByRunnable b = new ByRunnable();
		b.run();
	}
}

package Collections;
class hack extends Thread{
	Thread thread;
	public void run() {
		thread.interrupt();
	}
}
public class Solution {

	public static void main(String[] args) {

		try {
			hack objHack=new hack();
			objHack.thread=Thread.currentThread();
			objHack.start();
			objHack.join();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("cathc");
		}
	}

}

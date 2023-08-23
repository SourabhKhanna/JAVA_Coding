package Practice;

public class ThreadMain extends Thread {
	@Override
	public void run() {
		// thread is in running state

		System.out.println("Thread is running");
	}

	public static void main(String[] args) {

		ThreadMain obj = new ThreadMain();
		obj.setName("capg");

		obj.start();
	}
}

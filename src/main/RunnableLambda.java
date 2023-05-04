package main;

class ThreadDemo implements Runnable {
	@Override
	public void run() {
		System.out.println("method is running ...");
	}
}

public class RunnableLambda {

	public static void main(String[] args) {
		Thread thread = new Thread(new ThreadDemo());
		thread.start();
		// doing this with lambda
		Thread threadLambda = new Thread(() -> {
			System.out.println("run method called using lambda ");
		});
		threadLambda.start();
	}
}

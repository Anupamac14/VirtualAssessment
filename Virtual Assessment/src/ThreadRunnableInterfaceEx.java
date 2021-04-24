class task implements Runnable{
	public void run() {
		System.out.println("Runnable interface"); 
	}
}
public class ThreadRunnableInterfaceEx {
	public static void main(String[] args) {
		new Thread(new task(),"Thread1").start();
	}
}

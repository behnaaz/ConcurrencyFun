public class PlayRun implements Runnable {
	public static String m = "";

	public static void main(String[] args) {
		Runnable r = new PlayRun();
		Thread t = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t.start();
		t2.start();
		t3.start();
		System.out.println("final " + m);
	}


    @Override
    public void run() {
	m = Thread.currentThread().getName();
	 
		System.out.println("inside" +  m + "   " +Thread.currentThread().getName());
    }
}

# ConcurrencyFun
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
behnaz@mb-behnaz:~ $ java -cp . PlayRun
insideThread-1   Thread-0
final Thread-2
insideThread-2   Thread-2
insideThread-1   Thread-1
behnaz@mb-behnaz:~ $ java -cp . PlayRun
final Thread-1
insideThread-1   Thread-1
insideThread-2   Thread-2
insideThread-1   Thread-0
behnaz@mb-behnaz:~ $ java -cp . PlayRun
insideThread-0   Thread-0
final Thread-0
insideThread-2   Thread-2
insideThread-1   Thread-1
behnaz@mb-behnaz:~ $ java -cp . PlayRun
final Thread-1
insideThread-1   Thread-0
insideThread-1   Thread-1
insideThread-2   Thread-2

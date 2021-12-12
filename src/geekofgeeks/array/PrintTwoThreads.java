package geekofgeeks.array;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class PrintTwoThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int a =1 << 4;
		System.out.println(a);
		CyclicBarrier c = new CyclicBarrier(2);
		Boolean isOddPrinted= new Boolean(false);
		Odd odd = new Odd(c, 10,isOddPrinted);
		Even even = new Even(c, 10,isOddPrinted);
		odd.start();
		even.start();
	}

}

class Odd extends Thread {
	int n;
	CyclicBarrier c;

	public Odd(CyclicBarrier b, int n,Boolean isOddPrinted) {
		this.n = n;
		this.c = b;
	}

	public void run() {

		for (int i = 1; i <= n; i = i + 2) {
			System.out.println(i);
			try {
				c.await();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

class Even extends Thread {

	int n;
	CyclicBarrier c;
	Boolean isOddPrinted;

	public Even(CyclicBarrier b, int n,Boolean isOddPrinted) {
		this.n = n;
		this.c = b;
	}

	public void run() {
		
		for (int i = 2; i <= n; i = i + 2) {
			System.out.println(i);
			try {
				c.await();
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (BrokenBarrierException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}

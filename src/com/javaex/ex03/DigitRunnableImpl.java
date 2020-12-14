package com.javaex.ex03;

public class DigitRunnableImpl implements Runnable {

	@Override
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			try {
				System.out.println(cnt);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

package com.javaex.ex04;

public class LowerImpl implements Runnable {

	@Override
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++) {
			try {
				System.out.println(ch);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

package com.javaex.ex04;

public class UpperImpl implements Runnable {

	@Override
	public void run() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			try {
				System.out.println(ch);
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

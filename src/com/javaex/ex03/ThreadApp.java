package com.javaex.ex03;

public class ThreadApp {

	public static void main(String[] args) throws Exception {
		
		/*
		 Runnable digit = new DigitRunnableImpl();
		 Thread thr = new Thread(digit);
		 */
		Thread thr = new Thread(new DigitRunnableImpl());
		thr.start();
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}

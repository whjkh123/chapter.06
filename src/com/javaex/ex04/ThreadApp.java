package com.javaex.ex04;

public class ThreadApp {

	public static void main(String[] args) {

		Thread thr01 = new Thread(new DigitImpl());
		Thread thr02 = new Thread(new LowerImpl());
		Thread thr03 = new Thread(new UpperImpl());

		thr01.start();
		thr02.start();
		thr03.start();

	}

}

package com.javaex.ex01;

public class ThreadApp {

	public static void main(String[] args) throws Exception {

		// Thread: 독립적 업무 수행

		// 준비
		Thread thr = new DigitThread();

		// Thread 실행
		thr.start();

		for (char ch = 'a'; ch <= 'z'; ch++) {
			System.out.println(ch);
			Thread.sleep(1000);
		}

	}

}

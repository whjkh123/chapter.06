package com.javaex.ex02;

public class ThreadApp {

	public static void main(String[] args) throws Exception {

		// Thread: 독립적 업무 수행

		// 준비
		Thread thr01 = new DigitThread();
		Thread thr02 = new LowerThread();
		Thread thr03 = new UpperThread();

		// Thread 실행
		thr01.start();
		thr02.start();
		thr03.start();

	}

}

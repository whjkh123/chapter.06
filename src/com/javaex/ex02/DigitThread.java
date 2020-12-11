package com.javaex.ex02;

public class DigitThread extends Thread {

	// 0 ~ 9까지 정수
	@Override
	public void run() {
		for (int cnt = 0; cnt < 10; cnt++) {
			System.out.println(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}

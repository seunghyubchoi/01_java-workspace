package com.kh.test;

public class PrintBySecon {
	public static void main(String[] args) throws Exception {
		int i = 0;
		while (i++ < 1000) {
			if (i % 2 == 0) {
				System.out.println("A");
			} else {
				System.out.println("B");
			}
			Thread.sleep(1000);
		}
	}
}

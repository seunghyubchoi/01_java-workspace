package com.kh.run;

public class bubbleSortRun {

	public static void main(String[] args) {
		int[] arr = { 22, 99, 30, 68, 87, 1, 13 };
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 1; j < arr.length; j++) {
				if (arr[j-1] > arr[j]) { // 앞의 숫자가 뒤의 숫자보다 큰 경우
					temp = arr[j-1];
					arr[j-1] = arr[j];
					arr[j] = temp;
					
					
				}
			}
		}
		for(int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}

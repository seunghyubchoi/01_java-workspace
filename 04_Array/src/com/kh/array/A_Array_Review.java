package com.kh.array;

import java.util.Scanner;

public class A_Array_Review {
	public static void main(String[] args) {
		/*
		 * int[] arr = new int[4];
		 * 
		 * System.out.println(arr.length); for(int i = 0; i<arr.length; i++) { arr[i] =
		 * i+1; System.out.println("arr["+i+"] : " + arr[i]);
		 * 
		 * }
		 */

		/*
		 * int[] arr = new int[5];
		 * 
		 * for(int i = 0; i < arr.length; i++) { arr[i] = 2 * (i+1);
		 * System.out.println(arr[i]); }
		 */
		/*
		 * int[] arr = new int[] {1,2,3,4,5,6}; int[] arr2 = {10,20,30,40};
		 * 
		 * for(int i = 0; i < arr.length; i++) { System.out.print(arr[i] + " "); }
		 * System.out.println(); for(int i = 0; i < arr2.length; i++) {
		 * System.out.print(arr2[i] + " "); }
		 */

		/*
		 * int[] arr = new int[10]; for (int i = 0; i < arr.length; i++) { arr[i] =
		 * (int) (Math.random() * 100 + 1);
		 * 
		 * } for (int i = 0; i < arr.length; i++) { System.out.println("arr[" + i +
		 * "] : " + arr[i]); }
		 */

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("배열의 길이 입력 : "); int
		 * size = sc.nextInt();
		 * 
		 * sc.nextLine();
		 * 
		 * String[] arr = new String[size];
		 * 
		 * for (int i = 0; i < arr.length; i++) { System.out.print("과일명 : "); arr[i] =
		 * sc.nextLine(); } for (int i = 0; i < arr.length; i++) {
		 * System.out.println(arr[i]); }
		 */
		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("문자열 입력 : "); String
		 * str = sc.nextLine();
		 * 
		 * System.out.print("찾고자 하는 문자 : "); char ch = sc.nextLine().charAt(0);
		 * 
		 * char[] arr = new char[str.length()];
		 * 
		 * int count = 0;
		 * 
		 * for (int i = 0; i < arr.length; i++) { arr[i] = str.charAt(i); } for (int i =
		 * 0; i < arr.length; i++) { System.out.println("arr [" + i + "] : " + arr[i]);
		 * if (arr[i] == ch) { count++; } } System.out.print("찾는 문자의 수 : " + count);
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 입력 : ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100 + 1);
		}
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			if(arr[i] % 2 == 0) {
				sum += arr[i];
			}
		} System.out.print("짝수의 합 : " + sum);
	} 

}

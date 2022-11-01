package com.kh.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice2() {
		/*
		 * int[] arr = new int[10]; for(int i = 0; i < arr.length; i++) { arr[i] = 10 -
		 * i; }
		 */

		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice3() {

		Scanner sc = new Scanner(System.in);
		System.out.print("입력 값 : ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		System.out.println("양의 정수 : " + size);
		for (int i = 0; i < arr.length; i++) {
			arr[i] += i + 1;
			System.out.print(arr[i] + " ");
		}
	}

	public void practice4() {
		String[] arr = { "사과", "귤", "포도", "복숭아", "참외" };
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == "귤") {
				System.out.print(arr[i]);
			}
		}
	}

	public void practice5() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력 : ");
		String str = sc.nextLine();

		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0);

		int count = 0;

		char[] arr = new char[str.length()];
		System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
			if (ch == arr[i]) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print(ch + "개수 : " + count);

	}

	public void practice6() {
		// 배열 생성 및 초기화
		char[] day = { '월', '화', '수', '목', '금', '토', '일' };

		// 숫자 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();

		// 출력 조건 설정 및 출력
		if (num > 6 || num < 0) {
			System.out.println("잘못 입력하셨습니다.");
		} else {
			System.out.println(day[num] + "요일");

		}
	}

	public void practice7() {
		// 배열 길이 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		// 배열 생성 및 할당
		int[] arr = new int[num];
		// 값 대입(초기화)
		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
		}
		// 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		// 누적 합 구하기
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println();
		System.out.print("총 합 : " + sum);

		/*
		 * Scanner sc = new Scanner(System.in); System.out.print("정수 : "); int size =
		 * sc.nextInt(); int[] arr = new int[size]; int sum = 0; for (int i = 0; i <
		 * arr.length; i++) { System.out.print("배열 " + arr[i] + "번째 인덱스에 넣을 값 : ");
		 * arr[i] = sc.nextInt(); } for (int i = 0; i < arr.length; i++) {
		 * System.out.print(arr[i] + " "); sum += arr[i];
		 * 
		 * } System.out.println(); System.out.print("총합 : " + sum);
		 */
	}

	public void practice8() {
		// 3이상인 홀수 자연수 입력
		Scanner sc = new Scanner(System.in);
		// 다시 정수를 받도록
		while (true) {
			// 정수입력
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num >= 3 && num % 2 == 1) {
				// num이 3이상이면서 홀수일 때만 작동
				int[] arr = new int[num];

				/*
				 * 5 입력시 => {1, 2, 3, 2, 1,} => 2번 인덱스까지 증가 그 이후부터 감소 7 입력시 => {1, 2, 3, 4, 3,
				 * 2, 1} = > 3번 인덱스까지 증가 그 이후부터 감소
				 */
				// 오름차순
				int value = 1;
				for (int i = 0; i < arr.length; i++) {
					arr[i] = value;
					if (i < arr.length / 2) { // i < 2 인덱스가 0,1 때는 value 증가
						value++; // 무작정 value++; 해주면 안됨
					} else {
						value--;
					}
					System.out.print(arr[i] + " ");
				}
				break;
			} else { // "다시 입력하세요"
				System.out.println("다시 입력하세요.");

			}

		}

		/*
		 * Scanner sc = new Scanner(System.in); while (true) { int count = 0;
		 * System.out.print("정수 : "); int num = sc.nextInt(); if (num % 2 == 0 || num <
		 * 3) { System.out.print("다시 입력하세요."); System.out.println(); continue; } else {
		 * int[] arr = new int[num]; for (int i = 0; i < (num / 2) + 1; i++) { arr[i] =
		 * ++count; System.out.print(arr[i] + " "); } for (int j = 0; j < (num / 2);
		 * j++) { arr[j] = --count; System.out.print(arr[j] + " ");
		 * 
		 * } break;
		 * 
		 * } }
		 */

	}

	public void practice9() {
		Scanner sc = new Scanner(System.in);

		// 배열 생성
		String[] chickens = { "황금올리브", "허니콤보", "뿌링클", "고추바사삭" };

		System.out.print("치킨 이름을 입력하세요 : ");
		String chicken = sc.nextLine();

		int count = 0;
		for (int i = 0; i < chickens.length; i++) {
			if (chicken.equals(chickens[i])) {
				count++;
			}
		}
		if (count == 1) {
			System.out.println(chicken + "치킨 배달 가능합니다.");
		} else {
			System.out.println(chicken + "치킨은(는) 없는 메뉴 입니다.");
		}

		/*
		 * Scanner sc = new Scanner(System.in); String[] chix = { "뿌링클", "간장", "양념",
		 * "호박" };
		 * 
		 * System.out.print("치킨 이름을 입력하세요 : "); String chicken = sc.nextLine(); boolean
		 * result = false;
		 * 
		 * for (int i = 0; i < chix.length; i++) { if (chix[i].equals(chicken)) { result
		 * = true; break; } } if (result) { System.out.print(chicken + "치킨 배달 가능"); }
		 * else { System.out.print(chicken + "치킨은 없는 메뉴입니다"); }
		 */

	}

	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		String idNum = sc.nextLine();
		char[] arr = new char[idNum.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = idNum.charAt(i);
		}
		char[] arrCopy = arr.clone();
		for (int i = 8; i < arrCopy.length; i++) {
			arrCopy[i] = '*';
		}
		for (int i = 0; i < arrCopy.length; i++) {
			System.out.print(arrCopy[i] + " ");
		}
	}

	public void practice11() {
		// 배열 선언
		int[] arr = new int[10];
		// 난수 발생
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice12() {
		// 배열 선언
		int[] arr = new int[10];
		// 난수 발생
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1);
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		int max = arr[0];
		int min = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.print("최소값 : " + min);

	}

	public void practice12_1() {
		// 배열 생성 및 할당
		int[] arr = new int[10];

		// 값 대입 (초기화) : 랜덤 값(난수) : 1~10
		for (int i = 0; i < arr.length; i++) {
			int random = (int) (Math.random() * 10 + 1);
			arr[i] = random;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		int min = arr[0];
		int max = arr[0];

		Arrays.sort(arr); // 작은 수부터 큰 수까지 정렬해주는 함수
		min = arr[0];
		max = arr[arr.length - 1];
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("최대값 : " + max);
		System.out.print("최소값 : " + min);

	}

	public void practice13() {
		// 배열 선언
		int[] arr = new int[10];
		// 난수 발생
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); // 3
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--; // 0
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice14() {
		int[] arr = new int[6];
		// for 내부에서 선언한 변수의 값은 for 내부의 for 내부 안에서 바깥 변수에 접근이 가능
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 45 + 1); // 3
			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					i--; // 0
				}
			}
		}
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public void practice15() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str = sc.nextLine();
		char[] arr = new char[str.length()];
		int count = 0;
		// 값대입 for문
		System.out.print("문자열에 있는 문자 : ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);

			boolean flag = true;

			for (int j = 0; j < i; j++) {
				if (arr[i] == arr[j]) {
					flag = false;
				}
			}

			if (flag) {
				if (i == 0) {
					System.out.print(arr[i]);
				} else {
					System.out.print(", " + arr[i]);
				}
				count++;
			}
		}
		System.out.println();
		System.out.print("문자 개수 : " + count);
	}

	public void practice16() {
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 크기를 입력하세요 : ");
		int size = sc.nextInt();
		String[] arr = new String[size];
		int arrLength = arr.length;
		sc.nextLine();
		int count = 1;
		while (true) {

			boolean result = true;
			if (result == true) {
				for (int i = 0; i < arr.length; i++) {
					System.out.println(count + "번째 문자열 : ");
					arr[i] = sc.nextLine();
					count++;
				}

				System.out.println("더 값을 입력하시겠습니까?(Y/N)");
				char ch = sc.nextLine().charAt(0);
				if (ch == 'y' || ch == 'Y') {
					System.out.println("더 입력하고 싶은 개수 : ");
					int num = sc.nextInt();
					sc.nextLine();
					String[] newArr = new String[num];
					for (int i = 0; i < newArr.length; i++) {
						System.out.println(count + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
						count++;
						
					}
				} 
				
				
				
				
				/*
				 * int arrLength = arr.length; // 기존 배열을 새로운 배열로 복사(길이를 늘려줌) String[] newArr =
				 * new String[arrLength + 1]; for (int i = 0; i < arrLength; i++) { newArr[i] =
				 * arr[i]; } // 새로 늘어난 index에 값 추가 newArr[arrLength] = "D"; /*
				 * 
				 * 
				 * /* } Scanner sc = new Scanner(System.in); // 문자열 길이 입력
				 * System.out.print("배열의 크기를 입력하세요 : "); int size = sc.nextInt();
				 * 
				 * sc.nextLine();
				 * 
				 * // 문자열 배열 선언 String[] arr = new String[size]; int arrLength = arr.length int
				 * count = 1; for (int i = 0; i < arr.length; i++) { System.out.println(count +
				 * "번째 문자열 : "); arr[i] = sc.nextLine();
				 * 
				 * } System.out.print("더 값을 입력하시겠습니까?(Y/N)"); char answer =
				 * sc.nextLine().charAt(0); if (answer == 'Y' || answer == 'y') {
				 * System.out.print("더 입력하고 싶은 개수 : "); int num = sc.nextInt(); sc.nextLine();
				 * String[] newArr = new String[arrLength + num]; for (int i = count; i <
				 * arrlength; i++) { System.out.println(count + "번째 문자열 : "); newArr[i] =
				 * sc.nextLine(); } } else if(answer == 'n' || answer == 'N') { for(int i = 0; i
				 * <arr.length; i++) { System.out.print(arr[i] + " "); } } }
				 */
			}
		}
	}
}
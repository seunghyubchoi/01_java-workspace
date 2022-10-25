package com.kh.variable;
import java.util.Scanner;
public class D_Casting {
	/*
	 * 형변환 : 값의 자료형을 바꾸는 것 컴퓨터에서의 값 처리 규칙 (즉, 형변환이 필요한 상황) 1. 대입연산자를 기준으로 왼쪽과 오른쪽은
	 * 같은 자료형이여야 한다! = 즉, 같은 자료형에 대항하는 값만 대입 가능! = 즉, 다른 자료형의 값을 대입하고자 한다면 형변환이 필수!
	 * 
	 * * 형변환 방법 자료형 변수명 = (변경하려는 자료형)값;
	 * 
	 * 2. 같은 자료형 끼리만 연산이 가능 값 + 값 = 계산 결과도 같은 자료형으로 나온다.
	 * 
	 * 3. 형변환 종류 3_1. 자동 형변환 : 자동으로 형변환이 이뤄져서 우리가 형변환 시킬 필요없다 3_2. 강제(명시적) 형변환 : 자동
	 * 형변환이 안되서 직접 해줘야함, 내가 명시했기 때문에 명시적 형변환
	 * 
	 * 4.주의사항 4_1. boolean은 형변환이 불가능
	 * 
	 */
	public void autoCasting() {
		/*
		 * 자동 형변환 : 값의 범위가 작은 자료형과 큰 자료형 간의 연산시, 
		 * 자동으로 범위가 작은 자료형을 큰 자료형으로 변환 후 처리해줌
		 */

		// 1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = /* (double) */i1;
		System.out.println("d1 : " + d1);

		int i2 = 12;
		double d2 = 3.3;
		
		double result = i2 + d2;
		
		System.out.println("result :" + result);
		
		// 2.int(4byte) => long(8byte)
		int i3 = 1000;
		long l3 = /*(long)*/i3;
		
		
		// 3.float(4byte) => double(8byte)
		float f4 = 1.0f;
		double d4 = /*(double)*/f4;
		
		// 특이케이스
		// 4. long(8byte) => float(4byte)로 바뀌기 가능!!!
		// float 형이 실수형이기 때문에 
		// long형 보다 표현가능한 수의 범위가 더 커서 자동 형변환이 된다.
		long l5 = 10000000L;
		float f5 = /*(float)*/l5;
		System.out.println(l5);
		
		// 5. char(2byte) <=> int(4byte)
		int num = 'A';
		char word = 5677;
		System.out.println(num);
		System.out.println(word);
		
		// 각 문자들마다 고유한 숫자가 지정되어 있기 때문에
		// 쌍방향으로 형변환 가능
		// char변수는 음수로는 저장 불가
		// > 값의 범위 0~65535
		
		// 6. byte 또는 short 간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		// byte b3 = b1 + b2;
		// byte나 short는 연산이 무조건 int 형으로 처리한다.
		// 연산 결과가 범위가 더 큰 int형임 > byte형에 대입 불가
		byte b3 = (byte)(b1 + b2);
		System.out.println(b3);
		// (b1 + b2) 연산 시 int형으로 변환되고 
		// 그 int형이 byte형인 b3에 들어갈 수 없으므로 앞에 (byte) 추가 해야함
		
	}
	
	public void forceCasting( ) {
		// 강제 형변환: 큰 크기의 자료형을 작은 크기의 자료형으로 바꾸는 것
		// double(8byte) => float(4byte)
		double d1 = 4.0;
		float f1 = (float)d1;
		// 강제 형변환 안 해주면 오류난다. 명시적으로 형변환을 해 줘야함
		
		//double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		// int iSum = iNum + dNum; (오류)
		// 덧셈 연산시 자동 형변환이 된다. => 더블형 
		// 연산 결과인 double형이 int형에 대입 불가
		
		// 에러 해결 방법
		// 1. 연산결과를 int형으로 강제 형변환
		int iSum1 = (int)(iNum + dNum);
		System.out.println("iSum1 : " + iSum1);
		// 형변환 통해서 정수 값만 출력된다. 데이터 손실 발생
		
		// 2.double형 값 만을 int형으로 강제 형변환 한다.
		int iSum2 = iNum + (int)dNum;
		System.out.println("iSum2 : " + iSum2);
		// 실수 값을 정수형으로 강제형변환시 소수점 아래 부분 버려짐
		// 데이터 손실 발생할 수 있음

		// 3. 연산결과를 double 변수에 대입
		double iSum3 = iNum + dNum;
		System.out.println("iSum3 : " + iSum3);
		
		// 데이터 손실 테스트
		int iNum2 = 120;
		byte bNum2 = (byte)iNum2;
		System.out.println("bNum2 : " + bNum2);
	}
	
	public void calScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : ");
		double korean = sc.nextDouble();
		
		System.out.print("영어 : ");
		double english = sc.nextDouble();
		
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int sum = (int)(korean + english + math);
		int average = (int)((korean + english + math) / 3);
		
		System.out.println();
		System.out.printf("총점 : %d\n", sum);
		System.out.printf("평균 : %d", average);
		
		
		sc.close();
		
		
	}
}

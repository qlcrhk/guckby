// 241002
// 증감연산자
// 조건문

package javaclass;

import java.util.Scanner;

public class java241002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		
		int a = 10;
		int b = 3;
		int i = a%b;
		
		System.out.printf("%d%n",i);
		
//		출력전에 더 함		
		System.out.printf("%d%n",++i);
//		출력 후 더함
		System.out.printf("%d%n",i++);
		System.out.println(i);
		
		
//		조건문
		
		String d = "LG";
		
		if(d=="SK") {
			System.out.println("SK");
		}
		else if(d=="KT"){
			System.out.println("KT");
		}
		else if(d=="LG"){
			System.out.println("LG");
		}else {
			System.out.println("한국통신사가 아닙니다.");
		};
		
		//scanner 이용하기
		
		Scanner sc = new Scanner(System.in);
		
//		덧셈
//		System.out.println("더할 숫자 두개 입력");
//		
//		int sumA = sc.nextInt();
//		int sumB = sc.nextInt();
//		int sumResult = sumA + sumB;
//		
//		if(sumResult < 10) {
//			System.out.println("결과 : " + sumResult );
//		}else {
//			System.out.println("error");
//			System.exit(0);
//		}
		


//		홀수 짝수
		
		int num2 = 5;
		if(num2 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		
//		for 반복문
//		1부터 10까지 숫자 더하는 코드
		
		int result =0;
		for(int i1 =0; i1<=10;i1++) {
			result += i1;
		}
		
		System.out.println(result);
//		3 6 9 게임
		
		int num = sc.nextInt();

		
		System.out.printf("3 6 9게임을 시작합니다. %n입력하신 숫자는 %d 입니다.%n", num);
		
		int num1 = num + 1;
		
		for(int start = 1 ; start < num1; start++ ) {
			if(start % 3 == 0) {
				System.out.println("박수 짝");
			}else {
				System.out.printf("%d ",start);
			}
		}
		
		
	}

}

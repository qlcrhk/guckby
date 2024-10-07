package javaclass;

import java.util.Arrays;
import java.util.Scanner;

public class java241007 {

	public static int add(int a, int b) {
		return a+b;
	}
	
	public static int sub(int a, int b) {
		return a-b;
	}
	
	public static int mul(int a, int b) {
		return a*b;
	}
	
	public static int div(int a, int b) {
		return a/b;
	}
	
	public static void ma() {
		System.out.printf("안녕하세요");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//특정 문자 입력 받았을때
		//사칙연산
		//변수 두개를 임의로 초기화
		
		int num1 = 16;
		int num2 = 5;
		

		Scanner sc = new Scanner(System.in); 
		System.out.printf("원하는 사칙연산 계산식을 입력하세요");
//		char cal = sc.next().charAt(0);

		System.out.println();
		
		char cal ='+';
		
		
		if(cal == '+') {
			System.out.printf("num1 + num2 = %d 입니다.", add(num1,num2));
		}else if(cal == '-') {
			System.out.printf("num1 - num2 = %d 입니다.", sub(num1, num2));
		}else if(cal == '/') {
			System.out.printf("num1 / num2 = %d 입니다.", div(num1, num2));
		}else if(cal == '-') {
			System.out.printf("num1 * num2 = %d 입니다.", mul(num1, num2));
		}else {
			System.out.println("잘못된 입력값입니다. 프로그램을 종료합니다.");
			System.exit(0);
		}
		
//		array
		System.out.println();
		System.out.println();
		int[] a = {100,90,80,70,60};
		String[] b = {"원숭이","호랑이","토끼","사슴"};
		System.out.println(Arrays.toString(b));
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		for(int i=0;i < b.length; i++) {
			System.out.println(b[i]);
		}
	}

}

// 241002
// 증감연산자
// 조건문

package javaclass;

import java.util.Scanner;

class Number{
	int a=0;
	int b=0;
	int num=0;
	String d = "LG";

	void plus() {
		
//		출력전에 더 함		
		System.out.printf("%d%n",++num);
//		출력 후 더함
		System.out.printf("%d%n",num++);
		System.out.println(num);
	}
	
	void phoneName() {
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
		
	}
	
	int APlusB(int a, int b) {
		return a+b;
	}
	
	void holJjack(int num) {
		if(num % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
	}
	
	void oneToTenAdd() {
		int result =0;
		for(int i1 =0; i1<=10;i1++) {
			result += i1;
		}
		
		System.out.println(result);
	}
	void game(int num) {
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

public class java241002 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				

		Number number = new Number();
		number.num = 10;
		number.plus();
		
		
		
//		조건문
		number.d="SK";
		number.phoneName();
		

		//scanner 이용하기
		
		Scanner sc = new Scanner(System.in);
//		
		System.out.println("결과 : " + number.APlusB(10, 5) );

		


//		홀수 짝수
		System.out.println("홀짝 숫자 입력");
		number.holJjack(sc.nextInt());

		
		
//		for 반복문
//		1부터 10까지 숫자 더하는 코드
		number.oneToTenAdd();

//		3 6 9 게임
		System.out.println("369숫자 입력");
		int setNum = sc.nextInt();
		number.game(setNum);

		sc.close();
		
	}

}

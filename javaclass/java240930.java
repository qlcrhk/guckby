//240930 자바수업

package javaclass;

public class java240930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		출력하기
		
		System.out.print("print");
		System.out.print("는 줄바꿈이 되지 않아요");
		
		System.out.println();
		System.out.println();

		System.out.println("println은");
		System.out.println("줄바꿈이 됩니다.");
		System.out.println();

//		숫자 출력하기
		

//   	예제1
		
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score = " + score);
		System.out.println("d = " + d);
		
//		예제 2
		
		int i = 10;
		byte b = (byte)i;
		
		System.out.printf("[byte -> int] b = %d -> i = %d%n",b,i);
		
		i = 300;
		b = (byte)b;
		
		System.out.printf("[int -> byte] b = %d -> i = %d%n", b,i);
		
		b = -2;
		i = (int)b;
		
		System.out.printf("[byte -> int] b = %d -> i=%d%n", b,i);
		
		System.out.print("i =" + Integer.toBinaryString(i));
		System.out.println();
		System.out.println();
//		예제 3 사칙연산
		
		int num1,num2;
		int sum,mul,sub;
		double div;
		
		num1 = 5;
		num2 = 3;
		
		sum = num1 + num2;
		sub = num1 - num2;
		mul = num1 * num2;
		div = (double)num1 / num2;
		
		System.out.printf(" num1 = %d%n num2 = %d%n%n "
				+ "sum = %d%n "
				+ "sub = %d%n "
				+ "mul = %d%n "
				+ "div = %.3f%n",
				num1, num2, sum, sub, mul, div);
		
//		문자와 문자열
		
//		char hi1 = '잘';
//		String hi2 = "부탁드려요";
//		
//		String hi = hi1 + hi2;
//		
//		System.out.println(hi);
	}

}

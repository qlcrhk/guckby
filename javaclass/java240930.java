//240930 자바수업

package javaclass;

class Print{
	void printF(){
		System.out.print("printf");
		System.out.print("는 줄바꿈이 되지 않아요");
	}
	
	void printLn() {
		System.out.println("println은");
		System.out.println("줄바꿈이 됩니다.");
		System.out.println();
	}
	
	void printD() {
		double d = 85.4;
		int score = (int)d;
		
		System.out.println("score = " + score);
		System.out.println("d = " + d);
	}
	
	void printChange() {
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
	}
	
	void printCal() {
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
	}
}

public class java240930 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Print p = new Print();
		
		p.printF();
		p.printLn();
		p.printD();
		p.printChange();
		p.printCal();
		

		
	}

}

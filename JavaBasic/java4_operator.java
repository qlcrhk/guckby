package JavaBasic;

public class java4_operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		산술연산자 +, -, *, /, %
		
		int num1 = 100;
		int num2 = 50;
		
		int sum = num1 + num2;
		int sub = num1 - num2;
		int mul = num1 * num2;
		int div = num1 / num2;
		
		int 나머지 = num1 % num2; // 값을 나눈후 나머지 값
		
		System.out.printf("sum= %d%n sub= %d%n mul= %d%n div= %d%n 나머지= %d%n",
				sum, sub, mul, div, 나머지);
		

//		대입연산자
		
//		=, +=, -=, *=, 논라연산자 도 동일하게 작동
//		a += 1은 a = a+1와 같다

		int change = num1;
		change += 1;
		System.out.println(change);
		
//		and, or 연산자에 대해서 안다는 가정하에. xor 연산자에 대해서만 코드 작성
//		&& (and) 는 두개가 모두 참 일떄 참
//		|| (or) 은 둘중 하나라도 참 일떄 참
//		^(xor) 은 두개가 서로 다를 때 참
		
		boolean a = true;
		boolean b = false;
		
		System.out.println(a ^= b);
		
//		증감연산자 
		
//		++ 또는 --을 사용해 1을 더하고 뺀다 앞에 뒤에 붙이는건 순서차이에 있다.
		change = 100; 
//		출력전에 더 함		
		System.out.printf("%d%n", ++change);
//		출력 후 더함
		System.out.printf("%d%n",change++);
		System.out.println(change);

//		비교 연산자
		
//		같은지 비교
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

//		크고 작음 비교
		System.out.println(num1 <= num2);
		System.out.println(num1 < num2);
		System.out.println(num1 > num2);
		System.out.println(num1 >= num2);
		
//		삼항연산자 
		
//		삼항연산자는 조건문과 관계가 있다 다음을 보면 이해할수 있다.
//		(조건문) ? 참 : 거짓; 조건문에 대해 참일경우 참을 출력 거짓이면 거짓 출력

		String result = num1 > num2 ? "맞아요." : "틀렸어요";
		System.out.println(result);
	}

}

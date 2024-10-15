package JavaBasic;

public class java01_variable_data_type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		변수는 어떠한 정보를 담는 그릇
//		데이터 숫자 타입 비트연산자 byte, int, double 이 이외에도 short, long 등이 있음


		// 정수 데이터 타입
		
		int a;
		a = 10;
		a = 20;
		System.out.printf("%d%n",a);

		// 실수 데이터 타입
		
		double b = 85.4;
		System.out.printf("%.3f%n",b);
		
		float c = 85.4f;
		System.out.printf("%.3f%n",c);
		
		//	문자와 문자열	
		
		char 문자 = 'v';
		System.out.printf("%c%n",문자);
		
		String 문자열 = "hello world?";
		System.out.printf("%s%n",문자열);
		
		// 참 거짓을 알려주는 boolean
		
		boolean 참 = true; // 1
		boolean 거짓 = false; // 0
		
		System.out.printf("%b %b", 참, 거짓);
	}

}

package JavaBasic;

public class java3_change_type {
	public static void main(String[] args) {
		
		// 타입 변환에는 자동 형 변환 과 강제 형 변환이 있다.
		
//		자동 형변환은 실수형과 정수형이 있을 때 그 두 숫자를 더한다고 가정해 보자 
//		그렇다면 결과 값은 어떻게 나올까?  
//		자바에서는 데이터의 손실이 발생하지 않거나, 데이터의 손실이 최소화되는 방향으로 묵시적 타입 변환을 진행 된다.
		
		int a = 10;
		double b = 5.5;
		
		System.out.println(a+b);
		
//		강제 형 변환
//		우리가 직접 데이터 형식읋 바꿔주는것을 의미하며 보았을 떄 어떤 타입인지 확인이 가능하기 떄문에 명시적 형 변환이라고도 한다.
		
		int sum = a + (int)b;
		System.out.println(sum);
	}
}

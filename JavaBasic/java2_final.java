package JavaBasic;

public class java2_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//상수는 변하지 않는 값을 의미한다.
		final int MIN = 50;
		final int MAX = 100;
		
		// 만약 다음처럼 상수로 입력한 값을 바꾸려하면 에러가 발생한다.
//		max = 60;
		
		System.out.println("최소 주문 금액은" + MIN + "원 이며 최대 주문금액은 " + MAX + "원 입니다.");
	}

}

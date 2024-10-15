package JavaBasic;

public class java09_function {
	public static void triangleA() {
//		 * 
//		 * *
//		 * * * 
//		 * * * *
//		 * * * * *
		

		
		for(int i=0; i<=5; i++) {
			for(int j = 0; j<=5; j++) {
				if(i>j) {
					System.out.printf("*");
				}else {
					System.out.printf(" ");
				}
			}
			System.out.println();
		}
	}
//	public static int 함수명(int a, int b){
//	public은 다른파일에서 현재 함수를 불러와 사용 가능하다
//  int는 반환 값이 정수형태로 존재함을 의미하며 return을 통해 반환한다.
//	소괄호 안의 a,b는 매개변수 혹은 파라미터라고 부른다, 변수를 선언하는것 처럼 넣는다.
	
//	}

	
//	private static void secret(){
//		private는 다른파일에서 현재코드를 불러올 수 없음을 의미한다.
//		반환값이 없을 때는 void를 사용한다.
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangleA();
		triangleA();
		triangleA();
		triangleA();
	}

}

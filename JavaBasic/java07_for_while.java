package JavaBasic;

public class java07_for_while {
	public static void main(String[] args) {
//		for 반복문
//		for(초깃값; 조건, 증감 값){ 코드 } 
		
//		for문
		int num = 2;
		
		System.out.println(num +"단 곱셈");

		for(int i=1; i<10; i++) {
			System.out.println(num +"X"+i +"=" + num*i);
		}
		
//		이중 for문
		
// 		*
//		**
//		*** 출력하기
		
		String star = "*";
		
		final int MAX = 5;
		
		for(int i=0; i<=MAX; i++) {
			for(int j = 0; i>j; j++) {
				System.out.printf("%s",star);
			}
			System.out.println();
		}
		
//		while문
//		조건이 참일 때 반벅 무한 반복문
		boolean state = true;
		int stopNum = 3;
		
		while(state) {
			stopNum--;
			
			System.out.println("say Hi");
			if(stopNum == 0) {
				state = false;
			}
		}
		
//		while문이 무한 반복문일 때
//		break 사용

		stopNum=3;
		
		while(true) {
			stopNum--;
			
			System.out.println("say bye");
			if(stopNum == 0) {
				break;
			}
		}
		
//		특정구간 띄어넘기
//		continue
//		
		
		stopNum=5;
		
		int passNum = 2;
		while(true) {
			stopNum--;
			
			if(stopNum == 0) {
				break;
			}
			else if(passNum == stopNum) {
				continue;
			}else {
				System.out.println(stopNum);
			}
		}
		
	}

}

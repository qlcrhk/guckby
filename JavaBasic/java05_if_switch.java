package JavaBasic;

public class java05_if_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		if - else
		int a = 10;
		int b = 12;
		
//		만약 a가 b보다 크면 if문 내에 코드가 실행되고 false라면 다음으로 진행
	
//		if(조건){실행할 코드}
//		else{그 이 외에 실행할 코드}
		
		if(a > b) {
			System.out.println("a>b에요");
		}
		
//		만약 a가 b보다 작으면 코드 실행 아니면 다음 코드 진행
		else if(a<b){
			System.out.println("a<b에요");
		}
//		그 외에 모든 상황에 이 코드 실행
		else {
			System.out.println("a==b");
		}
		
//		만약 name kim이면 김씨 출력 만약 park 박씨 그 이외에는 알수없습니다를 출력	
		
		int e= 10;
		if(10==e) {
			System.out.println("맞아요");
		}else if(15==e){
			System.out.println("15입니다");
		}
		else {
			System.out.println("아니에요");
		}
		
		
		
//		만약 if문이 길어진다면? switch case문을 사용하도록 하자 a가 case에 맞춰 다음으로 진행되고 참일 때 다음으로 진행을 멈추기 위해
//		break를 사용한다.
		
		switch (a) {
		case 1 :
			System.out.println("1");
			break;
		case 2 :
			System.out.println("2");
			break;
		case 3 :
			System.out.println("3");
			break;
		case 5 :
			System.out.println("5");
			break;
		case 10 :
			System.out.println("10");
			break;
		}
	}
}

// name = "도";
//만약 김씨면 김씨입니다.
//만약 도씨면 도씨입니다.
//그 이외 알수가 없습니다.

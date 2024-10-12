package javaclass;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
//      계산기의 상태 저장
        boolean status = true;
        
//      계산기 실행 시 status true면 작동 flase면 종료
        while(status) {
//        		num1 과 num2를 0으로 초기화
            	int num1 =0;
                int num2 = 0;
             
            	System.out.println("Enter a number: ");
            	
//            	Scanner에서 정수인지 미리 판별해주는 메서드를 제공
//            	제가 알기로는 num1을 int num1 =sc.nextInt가 가능하긴 한데
//            	switch case문에서 num1을 인식하지 못해서 따로 위에 초기화 하고 다시 입력해 주었습니다.
            	
            	if (sc.hasNextInt()) { //정수인지 미리 판별
            		num1 = sc.nextInt(); // 정수 입력
            	} else {
            		System.out.println("wrong.");
            		sc.next();  // 잘못된 입력값을 제거
            		continue;
            	}
            	
            	// 연산자 입력 받음 string 형으로 사칙연산자 입력을 받았을때 에러가 남
                System.out.println("Enter an operator: (+,-,*,/)");
                char oper = sc.next().charAt(0);  // String으로 받은 값을 형변환을 한 다음 oper에 넣어주었습니다ㅓ.
                if(oper == '+'|| oper == '-' || oper == '*' || oper == '/') {
                }else {
            		System.out.println("wrong.");
            		continue;
                }
                
//                num1설명과 동일
                System.out.println("Enter second number: ");
            	if (sc.hasNextInt()) {
            		num2 = sc.nextInt();
            	} else {
            		System.out.println("wrong.");
            		sc.next();  // 잘못된 입력값을 제거
            		continue;
            	}
                int result = 0;  // 결과 변수 초기화

//
                switch (oper) {  // 입력된 연산자에 따라 연산 수행
                    case '+':
                        result = add(num1, num2);
                        break;
                    case '-':
                        result = sub(num1, num2);
                        break;
                    case '*':
                        result = mul(num1, num2);
                        break;
                    case '/':
                        result = div(num1, num2);
                        break;
                    default:
                        System.out.println("Invalid operator! Please use +, -, * or /.");
                        break; 
                }

                System.out.println("Result is: " + result);  // 결과 출력
                status =false;

        	}
        }
    

    // 덧셈 메서드
    public static int add(int a, int b) {
        return a + b;
    }

    // 뺄셈 메서드
    public static int sub(int a, int b) {
        return a - b;
    }

    // 곱셈 메서드
    public static int mul(int a, int b) {
        return a * b;
    }

    // 나눗셈 메서드
    public static int div(int a, int b) {
        return a / b;
    }
}


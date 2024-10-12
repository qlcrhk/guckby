//package javaclass;
//
//import java.util.Scanner;
//
//public class java241004 {
//
//	public static void gugudan(int num) {
//		System.out.println(num + "단을 출력합니다.");
//		System.out.println();
//
//		System.out.println( "["+num+" 단]");
//		System.out.println();
//
//		for(int i=1; i<10; i++) {
//			System.out.println(num+"X"+i+"="+num*i);
//		}
//
//	}
//	public static void triangleA() {
////		 * 
////		 * *
////		 * * * 
////		 * * * *
////		 * * * * *
//		
//
//		
//		for(int i=0; i<=5; i++) {
//			for(int j = 0; j<=5; j++) {
//				if(i>j) {
//					System.out.printf("*");
//				}else {
//					System.out.printf(" ");
//				}
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void triangleB() {
////		 * * * * * *
////		 * * * * *
////		 * * * *
////		 * * *
////		 * *
////		 *
//		
//		String star = "*";
//		for(int i=0; i<=6; i++) {
//			for(int j = 6; i<j; j--) {
//				System.out.printf("%2s",star);
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void triangleC() {
////		******
////		 *****
////		  ****
////		   ***
////		    **
////		     *
//		
//		System.out.println();
//		for(int i=0; i<=5; i++) {
//			for(int j = 0; j<=5; j++) {
//				if(i>j) {
//					System.out.printf(" ");
//				}else {
//					System.out.printf("*");
//				}
//			}
//			System.out.println();
//		}
//	}
//	
//	
//	public static void triangleD() {
////	  		 *
////   		**
////  	   ***
////  	  ****
//// 	 	 *****
//	
//	for(int i=0; i<=5; i++) {
//		for(int j = 5; i<=j; j--) {
//			System.out.printf(" ");
//		}
//		for(int k=1; k<=i; k++) {
//			System.out.printf("*");
//		}
//		System.out.println();
//	}
//	}
//	
//	public static void triangleAskii() {
////		아스키 코드로  출력
//
//		for(int i=0; i<=5; i++) {
//			for(int j = 0; i>j; j++) {
//				System.out.printf("%2c",64+i);
//			}
//			System.out.println();
//		}
//	}
//	
//	public static void rho(int many) {
////		마름모 출력하기
//
//		String star = "*";
//		int mid = many/2;
//		String blank = " ";
//		
//		for (int i = 0; i <= mid; i++) {
//            for (int j = 0; j < many; j++) {
//                if (j >= mid - i && j <= mid + i) {
//                    System.out.printf("%2s",star);
//                } else {
//                    System.out.printf("%2s",blank);
//                }
//            }
//            System.out.println();
//        }
//
//        // 아래쪽 삼각형
//        for (int i = mid - 1; i >= 0; i--) {
//            for (int j = 0; j < many; j++) {
//                if (j >= mid - i && j <= mid + i) {
//                    System.out.printf("%2s",star);
//                } else {
//                    System.out.printf("%2s",blank);
//                }
//            }
//            System.out.println();
//        }
//	}
//	
//	public static void sandclock(int many) {
////      모래시계
//	String star = "*";
//	String blank = " ";
//
//	int mid = many/2;
//      for (int i = mid - 1; i >= 0; i--) {
//          for (int j = 0; j < many; j++) {
//              if (j >= mid - i && j <= mid + i) {
//                  System.out.printf("%2s",star);
//              } else {
//                  System.out.printf("%2s",blank);
//              }
//          }
//          System.out.println();
//      }
//      
//		for (int i = 0; i <= mid; i++) {
//          for (int j = 0; j < many; j++) {
//              if (j >= mid - i && j <= mid + i && i != many/2) {
//                  System.out.printf("%2s",star);
//              }
//              else {
//                  System.out.printf("%2s",blank);
//              }
//          }
//          System.out.println();
//      }
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
////		10부터 1까지 for문을 이용하여 합 하기
//				
//		for(int i = 10;i>0;i--) {
//			System.out.println(i);
//			if(i==0) {
//				System.exit(0);
//			}
//		}
//		
////		이중 for문을 이용한 구구단
//		
//		for(int i=2; i<10; i++) {
//			System.out.println("[ "+i+"단 ]");
//			System.out.println();
//			for(int j=1;j<10; j++) {
//				System.out.printf("%d X %d = %d%n",i, j, i*j);
//			}
//			System.out.println();
//		}
//		
//        
////		구구단
////		Scanner sc = new Scanner(System.in);
//		
////		System.out.println("구구단 출력 api");
////		System.out.println("몇 단을 출력할까요?");
//		
////		int num = sc.nextInt();
//		
//		gugudan(9);
//
//		rho(9);
//		System.out.println();
//		sandclock(9);
//		System.out.println();
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("A부터 E중 대문자로 하나 입력해 보세요");
//		char choose = sc.next().charAt(0);
//		
//		switch(choose) {
//		case 'A':
//			triangleA();
//			break;
//		case 'B':
//			triangleB();
//			break;
//		case 'C':
//			triangleC();
//			break;
//		case 'D':
//			triangleD();
//			break;
//		case 'E':
//			triangleAskii();
//			break;
//		
//		 default:
//			 break;
//		}
//		
//		
//		
//		}	
//	}
//
//

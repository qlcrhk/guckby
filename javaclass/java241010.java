package javaclass;

import java.util.Scanner;

public class java241010 {
	public static int solution(int slice, int n) {
		 int answer = 0;
			        int x = 1;
			        boolean status = true;
			        
				        while(status) {
				        	if((slice*x)%n==0){
					            answer = x;
					            status = false;
					        }else if((slice*x)/n >=1) {
					        	answer = x;
						        status = false;
					        }
				        	else{
					            x = x+1;
					        }
				        }
		        
		        return answer;
		    }
	

    public static void main(String[] args) {
//    	 int answer = 0;
//         int numbers[]={0,-31,24,10,1,9};
         
//         for(int i=0; i<numbers.length; i++){
//             for(int j=numbers.length-1; j>i;j--){
//                 answer = numbers[i]*numbers[j];
//             }
//         }
//    	   System.out.println(answer);
//         Scanner sc = new Scanner(System.in);
//         
//         int number;
//         
//         int score[][] = new int [4][4];
//         for(int i =0; i<score.length-1; i++) {
//             System.out.printf("%d 번쨰 힉셍의 점수:",i+1);
//             for(int j=0; j<score.length-1; j++) {
//            	 number = sc.nextInt();
//            	 score[i][j] = number;
//            	 score[i][score.length-1] += score[i][j];
//             }
//        	 System.out.printf("%n");
//
//         }
//         
//         System.out.printf("\t 국어\t 영어\t 수학\t 총점%n");
//         
//         for(int i=0; i<score.length-1; i++) {
//             System.out.printf("%d번 \t",i+1);
//        	 for(int j = 0; j<score.length; j++) {
//        		 System.out.printf("%4d\t",score[i][j]);
//        	 }
//        	 System.out.printf("%n");
//         }
//   
//         System.out.printf("합계\t");
//         int sum = 0;
//         
//         for(int i=0; i<score.length; i++) {
//        	 for(int j = 0; j<score.length-1; j++) {
//        		 sum += score[j][i];
//        	 }
//    		 System.out.printf("%4d\t",sum);
//
//        	 sum = 0;
//         }
//   
         String star = "*";
         String blink =" ";
         String[][] starArr =new String[4][3];
         
         for(int i=0;i <starArr.length;i++ ) {
        	 for(int j=0; j<3;j++) {
        		 starArr[i][j]=star;
        		 if(i<j) {
            		 starArr[i][j]=blink;
        		 }
        		 System.out.printf("%s",starArr[i][j]);

        	 }
        	 System.out.printf("%n");
         }
         

         for(int i=starArr.length-1;i >=0;i-- ) {
        	 for(int j=0; j<=2;j++) {
        		 if(i+1>j) {
            		 starArr[i][j]=star;
        		 }else {
            		 starArr[i][j]=blink;

        		 }
        		 System.out.printf("%s",starArr[i][j]);
        	 }
        	 System.out.printf("%n");
         }
         
         
    }
 
}


package JavaBasic;

import java.util.Scanner;

public class question_baekjun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		입력받은 수 중 최댓값 구하기
		
		Scanner sc = new Scanner(System.in); 
		int[][] arr = new int [9][9];
		int max = 0;
		int x=1;
		int y=1;
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		
		for(int i =0; i<arr.length; i++) {
			for(int j=0; j<arr[0].length;j++) {
				if(arr[i][j] > max) {
					max = arr[i][j];
					x = i+1;
					y = j+1;
				}
			}
			System.out.println();
		}

		sc.close();

		System.out.println(max);
		System.out.println(x+","+y);
	}

}

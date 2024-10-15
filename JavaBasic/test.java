package JavaBasic;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		int [][] arr =new int [3][3];
		int max =0;
		
		for(int i=0; i<arr.length;i++) {
			for(int j = 0; j<arr[0].length;j++) {
				arr[i][j] = sc.nextInt();
				if(arr[i][j] >max) {
					max = arr[i][j];
				}
			}
		}

		System.out.println(max);
		
	}

}

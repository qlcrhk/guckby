package javaclass;

import java.util.Scanner;

class Snale{
	public static void Snale1(int num100) {
	int arr1 [][]= new int [num100][num100];

	int num =1;
	int buf = arr1.length;
	int a=0;
	int b=-1;
	int turn = 1;
	
	while(buf>0) {
		for(int i=0; i<buf;i++) {
			 b+= turn;
			arr1[a][b]=num++;
		}
		
		buf--;
		
		for(int j = buf; j>0;j--) {
			a += turn;
			arr1[a][b]=num++;
		}
		turn *= -1;
	}
	
	
	for(int i =0; i<arr1.length; i++) {
		for(int j =0; j<arr1[0].length; j++) {
			System.out.printf("%3d",arr1[i][j]);
		}
		System.out.println();
	}
}

public static void Snale2(int num100) {
	int arr1 [][]= new int [num100][num100];

	int num = arr1.length*arr1.length;
	int buf = arr1.length;
	int a=0;
	int b=-1;
	int turn = 1;
	
	while(buf>0) {
		for(int i=0; i<buf;i++) {
			 b+= turn;
			arr1[a][b]=num--;
		}
		
		buf--;
		
		for(int j = buf; j>0;j--) {
			a += turn;
			arr1[a][b]=num--;
		}
		turn *= -1;
	}
	
	
	for(int i =0; i<arr1.length; i++) {
		for(int j =0; j<arr1[0].length; j++) {
			System.out.printf("%3d",arr1[i][j]);
		}
		System.out.println();
	}

}
}
public class java241014_arr {

	

//	
	public static int PayMoney(int num){
		int money[] = {500,100,50,10};
		int result = 0;
		int pay =num;
		
		for(int i=0; i<money.length; i++) {
			if(pay % money[i] < money[i]) {
				System.out.println(money[i] +"원 : "+ pay/money[i]+"개");
				result += pay/money[i];
				pay -= pay/money[i] * money[i];
			}
		}
		
		return result;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub


//		달팽이
		
		Snale sn = new Snale(); 
		
		sn.Snale1(7);
		System.out.println();
		System.out.println();
		sn.Snale2(7);
		
//		현금 동전으로 교환시 최소 각각의 동전 갯수
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("돈 입력");
		int setMoney = sc.nextInt();
		int getMoney = PayMoney(setMoney);

		System.out.println(getMoney);
		sc.close();
	}

}

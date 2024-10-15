package javaclass;

class gugudan{
	public static void gugudan1(){
		int [][] numarr = new int[10][10];
//		구구단 2 방법
		for(int i = 1; i <10; i++) {
			for(int j= 1; j<10;j++) {
				numarr[i][j] = i*j;
				System.out.println(numarr[i][j]);
			}
		}
	}
	
	public static void gugudan2() {
		for(int i = 1; i <10; i +=3) {
			for(int j= 1; j<10;j++) { 
				for(int k = i; k<i+3;k++) {
					System.out.print(k+"x"+j+"="+j*k+"\t");
				}
				System.out.println();
			}
			System.out.println();
		}		

	}
}

public class java241008 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		gugudan g = new gugudan();
		
//		다차원 배열 

		g.gugudan1();
		
//		3줄 띄우기
		
		g.gugudan2();

		
	}
} 

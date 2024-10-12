package javaclass;

public class java241011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열로 별찍기 2
//		  *
//		 **
//		***
		char starArr1[][] = new char [4][4];
		char starArr2[][] = new char [4][4];
		
		char blank = (char)32;
		char star = '*';
		
		for(int i=0; i<starArr1.length;i++) {
			for(int j=starArr1.length-1;j>0;j--) {
				if(i>=j) {
					starArr1[i][j]=star;
				}else {
					starArr1[i][j]=blank;
				}
				System.out.printf("%c",starArr1[i][j]);

			}
			System.out.printf("%n");
		}
		
//		***
//		 **
//		  *
		for(int i=0; i<starArr2.length;i++) {
			for(int j=0;j<starArr2.length;j++) {
				
				if(i>j) {
					starArr2[i][j]=blank;
				}else {
					starArr2[i][j]=star;
				}
				System.out.printf("%c",starArr2[i][j]);
				
			}
			System.out.println();
		}
// 5x5 숫자판 코드작성
		
		int k= 1;
		int[][] maroonfive= new int [5][5];
		for(int i =0; i< maroonfive.length;i++) {
			for(int j=0; j<maroonfive.length;j++) {
				maroonfive[i][j] = k++;
				if(j%5==0) {
					System.out.println();
					System.out.printf("---------------------");
					System.out.println();
					System.out.printf("|");
				};
				System.out.printf("%3d|",maroonfive[i][j]);
			}
		}
		System.out.println();
		System.out.println("---------------------");
		
//		숫자 세로 배치
		int jpark[][]=new int [5][5];
		
		for(int i=0;i<jpark.length;i++) {
			for(int j=0;j <jpark.length;j++) {
				jpark[i][j] =i+1 + j*jpark.length;				
				System.out.printf("%3d",jpark[i][j]);
			}
			System.out.println();
		}
		System.out.println();		
		System.out.println();		
		System.out.println();
// 		지그재그 배치

		k=1;
		
		int[][] zig= new int [5][5];
			for(int i =0; i< zig.length;i++) {
						
				for(int j=0; j<zig.length;j++) {
					zig[i][j] = k++;
					if(i%2==1) {
						zig[i][j] += 4- 2*j;
						System.out.printf("%3d",zig[i][j]);
					}else {
						System.out.printf("%3d",zig[i][j]);
					}
				}
				System.out.println();
				}
			System.out.println();
			System.out.println();
			System.out.println();

//		지그재그 2;
			int zag[][] =new int [5][5];
			
			k=1;
			
			for(int i=0;i<zag.length;i++) {
				for(int j=0;j<zag.length;j++) {
					zag[i][j] = k++;
				}
			}
			for(int i=0;i<zag.length;i++) {
				for(int j=0;j<zag.length;j++) {
					System.out.printf("%3d",zig[j][i]);
				}
				System.out.println();
			}
			System.out.println();
			System.out.println();
			
			
//			달팽이
			int num=1;
			int turn = 1;
			int col = -1;
			int row = 0;
			int snale[][] = new int [5][5];
			int buf = snale.length;

			while( buf>0 ) {
				for(int j=0; j<buf;j++) {
					col +=turn;
					snale[col][row] = num++;
				}
				buf--;
				for(int j=buf; j>0;j--) {
					row += turn;
					snale[col][row] = num++;
				}
				turn *=-1;
			}
			
			for(int i = 0; i<5;i++) {
				for(int j=0; j<5;j++) {
					System.out.printf("%3d",snale[i][j]);
				}
				System.out.println();
			}
			
			
	}
}


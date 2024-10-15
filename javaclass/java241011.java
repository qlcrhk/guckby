package javaclass;
class star{
	char starArr[][] = new char [4][4];
	char blank = (char)32;
	char star = '*';
	
	void arrStar() {
		for(int i=0; i<starArr.length;i++) {
			for(int j=starArr.length-1;j>0;j--) {
				if(i>=j) {
					starArr[i][j]=star;
				}else {
					starArr[i][j]=blank;
				}
				System.out.printf("%c",starArr[i][j]);

			}
			System.out.printf("%n");
		}
		
	}
	
	void arrStar2() {
		for(int i=0; i<starArr.length;i++) {
			for(int j=0;j<starArr.length;j++) {
				
				if(i>j) {
					starArr[i][j]=blank;
				}else {
					starArr[i][j]=star;
				}
				System.out.printf("%c",starArr[i][j]);
				
			}
			System.out.println();
		}
	}
}

class numberArr{
	int k= 1;
	int[][] setArr= new int [5][5];

	void numByNum(){
		for(int i =0; i< setArr.length;i++) {
			for(int j=0; j<setArr.length;j++) {
				setArr[i][j] = k++;
				if(j%5==0) {
					System.out.println();
					System.out.printf("---------------------");
					System.out.println();
					System.out.printf("|");
				};
				System.out.printf("%3d|",setArr[i][j]);
			}
		}
		System.out.println();
		System.out.println("---------------------");
	}
	
	void numSet1() {
		
		for(int i=0;i<setArr.length;i++) {
			for(int j=0;j <setArr.length;j++) {
				setArr[i][j] =i+1 + j*setArr.length;				
				System.out.printf("%3d",setArr[i][j]);
			}
			System.out.println();
		}
	}
	
	void numSet2() {		
			for(int i =0; i< setArr.length;i++) {
						
				for(int j=0; j<setArr.length;j++) {
					setArr[i][j] = k++;
					if(i%2==1) {
						setArr[i][j] += 4- 2*j;
						System.out.printf("%3d",setArr[i][j]);
					}else {
						System.out.printf("%3d",setArr[i][j]);
					}
				}
				System.out.println();
				}
	}
	
	void numSet3() {
				
		for(int i=0;i<setArr.length;i++) {
			for(int j=0;j<setArr.length;j++) {
				setArr[i][j] = k++;
			}
		}
		for(int i=0;i<setArr.length;i++) {
			for(int j=0;j<setArr.length;j++) {
				System.out.printf("%3d",setArr[j][i]);
			}
			System.out.println();
		}
	}
	
	void numSnale() {
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
public class java241011 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열로 별찍기 2
//		  *
//		 **
//		***
		star s = new star();
		s.arrStar();
		
//		***
//		 **
//		  *
		s.arrStar2();

		numberArr na = new numberArr();
//		 5x5 숫자판 코드작성
		na.numByNum();
		
		
//		숫자 세로 배치
		na.numSet1();

// 		지그재그 배치

		na.numSet2();

//		지그재그 2;

		na.numSet3();
			
			
//			달팽이
			
		na.numSnale();
			
	}
}


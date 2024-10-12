package javaclass;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 		지그재그 배치

		
		        int[][] test = new int[5][5];
		        int num = 65;  
		        int a = 0, b = -1, turn=1;  
		        int buf=test.length;
		        int i,j;

		        while (buf > 0) {
		            for (i = 0; i < buf; i++) {
		                b += turn;
		                test[a][b] = num++;
//		                System.out.printf("%d ",test[a][b]);
		            }
		            buf--;
		            System.out.println();

		            for (i = buf; i > 0; i--) {
		                a += turn;
		                test[a][b] = num++;
//		                System.out.println(test[a][b]);
		            }
		            turn *= -1; 
		        }
		        
				for(int col = 0; col<5;col++) {
					for(int row=0; row<5;row++) {
						System.out.printf("%3c",test[row][col]);
					}
					System.out.println();
				}
				
				
				
	}

}

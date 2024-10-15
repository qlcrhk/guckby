package JavaBasic;

public class java08_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 타입[] 배열이름;
//		2. 타입 배열이름[];
		
		String[] name = {"Kim","Park","Son","Lee","Kwon"};
//		배열의 시작은 0 부터
		
		for(int i=0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		
//		다차원 배열
		
		int[][] arr = {
				{10, 20, 30},
			    {40, 50, 60}
		};
	}

}

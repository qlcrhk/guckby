package javaclass;

class Tv{
	String color;
	int channel=0;
	boolean power;
	
	void power() {power = !power;}
	void channelUp() {++channel;}
	void channelDown() {--channel;}
}



public class java241014_class {
	
	public static void main(String[] args) {
//		예제 1
		
//		Tv t1 = new Tv();
//		Tv t2 = new Tv();
//		
//		System.out.println("t1 현재 체녈은"+t1.channel+"입니다.");
//		System.out.println("t2 현재 체녈은"+t2.channel+"입니다.");
//		t1.channelDown();
//		
//		t1.channel =7;
//		System.out.println("t1 체녈은 7로 변경되었습니다.");
//		System.out.println("t1 체녈은"+t1.channel+"입니다.");
//		System.out.println("t2 체녈은"+t2.channel+"입니다.");
		
//		예제 2
		
		Tv[] tvArr =new Tv[3];

		for(int i = 0; i<tvArr.length;i++) {
			tvArr[i] = new Tv();
			tvArr[i].channel =i+ 10;
		}
		
		for(int i=0; i<tvArr.length;i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
		}
	}
}
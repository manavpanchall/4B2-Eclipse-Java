package p1;
public class Iclass implements Itest1,Itest2 {
	public static void main(String[] args) {
		Iclass ob = new Iclass();
		ob.m1();
		ob.m3();
		Itest1.m2();
		Itest2.m2();
	}
	public void m1() {
	System.out.println("THis is m1 Method");	
	}
	public void m3() {
		// TODO Auto-generated method stub
		Itest2.super.m3();
	}
}

package patternProgramming;

 interface A {
 public void test();
 
 public static void book() {
	 System.out.println("Book1");
 }

}

 interface B {
	 public void test();

}

 class C implements B{
	 
	public void test() {
		System.out.println("From c");
	}
	
	public static void main(String[] args) {
	C c=new C();
	c.test();
	A.book();
	
	}

}

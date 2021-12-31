
public class SwapNoWIthoutThirdVar {

	public static void main(String[] args) {
		int a= 10;
		int b=20;
		System.out.println("a before swapping: "+a);
		System.out.println("b before swapping: "+b);
		a=a+b;//30
		b=a-b;//10 
		a=a-b; //20
		System.out.println("a after swapping: "+a);	
		System.out.println("b after swapping: "+b);	

		}

}

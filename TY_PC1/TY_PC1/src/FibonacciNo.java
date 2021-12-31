
public class FibonacciNo {

	public static void main(String[] args) {
		int num1=0;
		int num2=1;
		int num3=0;
		int count=1;
		int limit=10;
		
		System.out.print(num1+" "+num2);
		while(limit>count) {
			num3=num1+num2;
			num1=num2;
			num2=num3;
			count++;
		
		System.out.print(" " +num3);
		}
	}

}

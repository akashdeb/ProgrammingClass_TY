
public class PrimeNo {

	public static void main(String[] args) {
		int num = 23;
		int temp=0;
		for(int i=2; i<num/2; i++) {
			if(num%i==0) {
				temp=1;
			}
		}
		if(temp==0) {
			System.out.println(num+" is Prime");
		}
		else System.out.println(num+" is not Prime");
	}

}

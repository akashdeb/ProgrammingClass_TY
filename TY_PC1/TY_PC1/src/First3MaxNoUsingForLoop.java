
public class First3MaxNoUsingForLoop {
	public static void main(String[] args) {
		int [] a = {50,40,70,10,20};
		for(int i =0; i<a.length;i++) {
			for(int j=i+1;j<a.length; j++) {
				if(a[i]<a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		int n=3;
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum+=a[i];
			System.out.println(a[i]);
			
		}
		System.out.println("Sum = "+sum);
}
}

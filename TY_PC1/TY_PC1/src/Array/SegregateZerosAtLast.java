package Array;

public class SegregateZerosAtLast {

	public static void main(String[] args) {
		
		int [ ] a= {4,0,6,8,0,8,0,0,5,3,0,1,2,5,0};
		int[]b= new int[a.length];
		int m= 0;
		int n=a.length-1;
		for(int i=0; i<a.length;i++) {
			if(a[i]==0) {
				b[n]=a[i];
				n--;
			}
			else
			{
				b[m]=a[i];
				m++;
			}
				
		}
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		}

	}

}

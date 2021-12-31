package Array;

public class IterateDependingOnKey {

	public static void main(String[] args) {
		
		int[] a= {1,4,5,6,7,9,4};
		int key = 3;
		for(int i=0; i<key;i++) {
			int temp=a[0];
			for(int j=1;j<a.length;j++) {
				a[j-1]=a[j];
			}
			a[a.length-1]=temp;
		}
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]);
		}
	}

}

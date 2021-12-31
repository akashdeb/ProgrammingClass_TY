package Array;

public class AddElementsOfAnArray {
	public static void main(String[] args) {
		int [] a = {2,3,4};
		int[] b = {5,7,6,3};
		int count = a.length;
		
		if(count<b.length) {
			count=b.length;
		}
		for(int i=0; i<count; i++) {
			
			try {
			 System.out.print(a[i]+b[i]+" ");
			}
			catch(Exception e) {
				if(a.length>b.length) {
					System.out.println(" "+a[i]);
				}
				else System.out.println(" "+b[i]);
			}
		}
		
	}

}

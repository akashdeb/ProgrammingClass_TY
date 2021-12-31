package Array;

public class Shift0 {

	public static void main(String[] args) {
		int [] a = {0,0,2,4,8,0};
		int m = 0;
		int n = a.length-1;
		while(m<n) {
		while(a[m]==0 && m<n) {
			m++;
		}
		while((a[n]>=1&&a[n]<=9)&&(n>m)) {
			n--;
		}
		
	}

}

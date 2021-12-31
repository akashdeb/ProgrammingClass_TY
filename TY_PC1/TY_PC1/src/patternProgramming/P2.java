package patternProgramming;
/**
 *      *
 *      (1,1)
 *      * *
 *      (2,1) (2,2)
 *      * * *
 *      (3,1) (3,2) (3,3)
 *      * * * *
 *      (4,1) (4,2) (4,3) (4,4) 
 *       
 *
 */
public class P2 {
	public static void main(String[] args) {
		
		int n=15;
		for(int i= 1; i<=n; i++) {
			for(int j=1; j<=n; j++){
				if(i+j>=n-1) {
					System.out.print("* ");
				}
				else
					System.out.print("  ");
				
			}
			System.out.println();
		}
		
	}

}

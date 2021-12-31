package patternProgramming;

public class P1 {
	/**
	 *      a b c d e
	 *      f g h i j
	 *      g b c d e
	 *      a b c d e
	 * 		a b c d e
	 */

	public static void main(String[] args) {
		int ch = 1;
		for(int i=1;i<=5; i++) {
			
			for(int j=1; j<=5; j++) {
				
				System.out.print(ch++ +" ");
			}
			System.out.println();
			
		}
	}

}

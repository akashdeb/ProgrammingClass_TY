
public class ReverseEachWordInaStatement {

	public static void main(String[] args) {
		String str= "Welcome To TYSS";
		String [] s = str.split(" ");
		for(int i =0; i<s.length; i++) {
			String temp = s[i];
			String rev="";
			for(int j=temp.length()-1; j>=0; j--) {
				rev+=temp.charAt(j);
			}
			System.out.print(rev+" ");
				
		}
		
	}

}

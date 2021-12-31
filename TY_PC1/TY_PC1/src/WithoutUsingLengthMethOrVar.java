
public class WithoutUsingLengthMethOrVar {

	public static void main(String[] args) {
		String s = "I am a Programmer";
		String rev="";
		char[] ch = s.toCharArray();
		int count=0;
		for (char c : ch) {
			count++;			
		}
		for(int i = count-1; i>=0; i--) {
			 rev+=s.charAt(i);
		}
		System.out.println(rev);

	}

}

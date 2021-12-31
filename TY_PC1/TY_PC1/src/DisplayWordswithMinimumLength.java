
public class DisplayWordswithMinimumLength {
	public static void main(String[] args) {
		String [] str = {"ab", "a", "abc","abcde", "abcd", "mnopq","q"};
		String min = str[0];
		for(int i=0;i<str.length; i++) {
			if(str[i].length()<max.length()) {
				min=str[i];
			}
		}
		for(int i=0; i<str.length;i++) {
			if(min.length()==str[i].length()) {
				System.out.println(str[i]);
			}
		}
	}

}

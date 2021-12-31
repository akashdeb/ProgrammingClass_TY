
public class DiaplayWordsWithMaximumLength {

	public static void main(String[] args) {
		String [] str = {"ab", "a", "abc","abcde", "abcd"};
		String max = str[0];
		for(int i=0;i<str.length; i++) {
			if(str[i].length()>max.length()) {
				max=str[i];
			}
		}
		for(int i=0; i<str.length;i++) {
			if(max.length()==str[i].length()) {
				System.out.println(str[i]);
			}
		}
	}

}

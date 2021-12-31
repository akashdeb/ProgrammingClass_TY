import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class WordOccurrance {

	public static void main(String[] args) {
		String str = "Welcome to TYSS welcome to program";
		
		String [] s = str.split(" ");
		LinkedHashSet <String>set = new LinkedHashSet();
		for(int i=0; i<s.length;i++) {
			set.add(s[i]);
		}
		for (String string : set) {
			int count = 0;
			for(int i=0; i<s.length; i++) {
			if(string.equalsIgnoreCase(s[i])) {
				count++;
			}
		}
		System.out.println(string+" : "+count);
	}

}}

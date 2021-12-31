import java.util.LinkedHashSet;

public class DuplicateWords {

	public static void main(String[] args) {
		String str = "Welcome to Banglore Welcome to TYSS";
		
		String [] s = str.split(" ");
		LinkedHashSet <String>set = new LinkedHashSet();
		for(int i=0; i<s.length;i++) {
			set.add(s[i]);
		}
		for (String string : set) {
			int count = 0;
			for(int i=0; i<s.length; i++) {
			if(string.equals(s[i])) {
				count++;
			}
		}
			if(count>1) {
		System.out.println(string+" : "+count);
			}
	}
	}

}

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class PrintOnlyDuplicates {
	
	public static void main(String[] args) {
		String s = "i am a programer";
		LinkedHashSet <Character> set = new LinkedHashSet<Character>();
		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);
		for (Character character : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (character==s.charAt(i)) {
					count++;				
				}
			}
			if(count>1) {
			System.out.println(character+" : "+count);
		}
	}}}
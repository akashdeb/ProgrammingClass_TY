import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/**
 * Step1: Create any SET collection and add all the character of given string to set 
 * Step2: Compare all the characters of set with all the character of string.
 * Step3: If the characters are are repeating then increment the count
 * Step4: Print both characters of set and count
 * @author LENOVO
 *
 */
public class CountOccurence {
	
	public static void main(String[] args) {
		String s = "Tester";
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
			System.out.println(character+" : "+count);
		}
	}

}

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class DisplayThePositionOfEachCharacter {

	public static void main(String[] args) {
		String s = "Tester";
		String str = s.toLowerCase();
		LinkedHashSet<Character> set = new LinkedHashSet();
		for(int i = 0 ; i<str.length(); i++)
		{
			set.add(str.charAt(i));			
		}
		System.out.println(set);
		for(Character ch:set) {
		for(int i=0; i<str.length(); i++) {
			if(ch==str.charAt(i)) {
				System.out.println(ch+" "+(i+1));
				break;
			}
		}
		}
		

	}

}

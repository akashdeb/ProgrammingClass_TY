
public class Palindrom {
	public static void main(String[] args) {
		String s = "Madam";
		String str="";
		for(int i = s.length()-1; i>=0; i--) {
			str+=s.charAt(i);
	}
	if(s.equalsIgnoreCase(str)) {
		System.out.println(s+" is a Palindrom");
	}
	else System.out.println(s+" is not a Palindrom");
	}
}

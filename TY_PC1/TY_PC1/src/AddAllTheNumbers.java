
public class AddAllTheNumbers {

	public static void main(String[] args) {
		String str = "15dcd24#@#10dfv";
		int sum = 0;
		char[] ch = str.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if(ch[i]>=48 && ch[i]<=57) {
				sum+=str.charAt(i)-48;
			}
		}
		System.out.println(sum);
	}

}

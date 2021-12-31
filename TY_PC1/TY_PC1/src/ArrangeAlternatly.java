
public class ArrangeAlternatly {

	public static void main(String[] args) {
		String s1="abc";
		String s2 = "xyz";
		String s3 = s1+s2;
		String s4="";
		for(int i=0;i<s3.length()/2; i++) {
			s4 = s3.charAt(i)+""+s3.charAt(s3.length()/2+i)+"";
			System.out.print(s4);
		}
		

	}

}

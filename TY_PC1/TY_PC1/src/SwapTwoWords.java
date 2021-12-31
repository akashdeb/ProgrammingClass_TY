
public class SwapTwoWords {

	public static void main(String[] args) {
		
		String str = "Akash";
		String str1 = "Deb";
		str = str+str1;//AkashDeb
		str1= str.substring(0, str.length()-str1.length());
		str = str.substring(str1.length());
		System.out.println(str);
		System.out.println(str1);
		

	}

}

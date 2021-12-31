
public class AddAllTheDigit2Places {

	public static void main(String[] args) {
		String str = "15dcd24#@#10dfv10";
		int sum = 0;
		int tsum =0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)>=48 && str.charAt(i)<=57){
				int num = str.charAt(i)-48;
				sum=sum*10+num;
			}
			else {
				tsum+=sum;
				sum=0;
			}
	}
		tsum+=sum;
		System.out.println(tsum);

	}}



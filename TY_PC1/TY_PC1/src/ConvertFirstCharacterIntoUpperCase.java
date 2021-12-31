
public class ConvertFirstCharacterIntoUpperCase {
	
	public static void main(String[] args) {
		String real="";
		String str = "i am a programmer";
		String[] s = str.split(" ");
		for(int i=0; i<s.length;i++) {
			
			String s1= ""+s[i].charAt(0);
			System.out.print(s1.toUpperCase()+s[i].substring(1)+" ");
			
		}
		/*	String a = s[i];
			for(int j=0; j<a.length(); j++) {
				char[] ch = a.toCharArray();
				String st = (ch[0]+"").toUpperCase();
				String st1 = a.substring(1);
				real = st+st1;
				
			}
			System.out.print(real+" ");
		}*/
		
		
	}

}

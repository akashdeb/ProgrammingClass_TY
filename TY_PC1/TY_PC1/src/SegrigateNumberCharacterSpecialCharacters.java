
	
	public class SegrigateNumberCharacterSpecialCharacters {

		public static void main(String[] args) {
			
			String s = "ab$12@xy3";
			
			String alphabet = "";
			String number = "";
			String specialCharacter = "";
			
			for (int i=0;i<s.length();i++)
			{
				if (s.charAt(i)>='a' && s.charAt(i)<='z' || s.charAt(i)>= 'A' && s.charAt(i)<='Z')
				{
					alphabet=alphabet+s.charAt(i);
				}
				else if(s.charAt(i)>='0' && s.charAt(i)<='9')
				{
					number=number+s.charAt(i);
				}
				else
				{
					specialCharacter=specialCharacter+s.charAt(i);
				}
			}
			
			System.out.println("Alphabats : "+alphabet +" Numbers : "+number + " Special Character : "+specialCharacter);
		}

	}




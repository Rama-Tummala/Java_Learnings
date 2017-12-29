import java.util.HashSet;
import java.util.Set;

public class Emailtest {

	public void testemail(String str){
		
	//	char[] str_char = str.toCharArray();
		Set<Character> bad = new HashSet<>();
		
		char[] specialChars = new char[] {'!', '#', '$', '%', '^', '&', '*', '(', ')', '-', '/', '~', '[', ']'} ;
		 for (char c : specialChars) {
		      bad.add(c);
		    }
		
		if(str.contains("@"))
		{
		int i	= str.indexOf('@');
			String str1 = str.substring(0, i);
			String str2 = str.substring(i, str.length());
			
			//System.out.println("str1 "+str1);
			//System.out.println("str2 "+str2);
			
			if(!bad.contains(str1)&& str2.contains(".")) {
				
				int j	= str.indexOf('.');
				String str3 = str2.substring(0,j );
				String str4 = str2.substring(j,str2.length() );
				
				if(str3.length()>2&& !bad.contains(str3) && !bad.contains(str4))
				{
					System.out.println("Valid Email");
				}
				
				
				else
					
				{
					System.out.println("Invalid Domain name");
				}
			}
			else
				
			{
				System.out.println("Invalid username");
			}
			
			
			
			
		}else
			
		{
			System.out.println("Invalid Email");
		}
		
	}
	
	
	
	
	
	
}

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
				
				int j	= str2.indexOf('.');
				String str3 = str2.substring(0,j-1 );
				String str4 = str2.substring(j-1,str2.length() );
				
				//System.out.println("str3 "+str3);
				//System.out.println("str4 "+str4);
				
				if(str3.length()>1 && !bad.contains(str3) && !bad.contains(str4))
				{
					System.out.println("Valid Email"+str);
				}
				
				
				else
					
				{
					System.out.println("Invalid Domain name"+str);
				}
			}
			else
				
			{
				System.out.println("Invalid username"+str);
			}
			
			
			
			
		}else
			
		{
			System.out.println("Invalid Email"+str);
		}
		
	}
	
	
	
	
	
	
}

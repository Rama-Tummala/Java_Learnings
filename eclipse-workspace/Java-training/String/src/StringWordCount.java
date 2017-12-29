
public class StringWordCount {

	public void WordCount(String str) {
		int count=0;
		char[] Str1= str.toCharArray();
		System.out.println(Str1.length);
		
		boolean isWord=false;
		
		for(int i=0;i<=(Str1.length-1);i++) {
			
			if(Character.isLetter(Str1[i]) )
					{
				      isWord = true;
				      
					}
			
			else if (!Character.isLetter(Str1[i]) &&  isWord == true )
			{
		count++;
	}
		
			else if(isWord = true && i == (Str1.length-1))
			{
				 System.out.println(" i :"+i);
			
				count++;
				
			}
			
		
		
			
			 
	}
		 System.out.println(" Word count is :"+count);
	}
}
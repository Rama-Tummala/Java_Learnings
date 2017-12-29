import java.util.*;


public class StringDuplicates {
	
	public void testDuplicate(String str) {
		
		String[] words = str.split("\\s+");
		
		Set<String> newStr = new HashSet<>();
		
		Set<String> duplicates = new HashSet<>();
		
		for(String word1: words) {
			
		if(!newStr.add(word1))
		{
			duplicates.add(word1);
			
				}
					
		}
		
		System.out.println(duplicates);
		System.out.println(newStr);
	}
	
	
}

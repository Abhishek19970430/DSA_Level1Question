package stringBuilder;
import java.util.*;
public class StringWithASCIIDifference {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
			String str= "abdgca";
			
			StringBuilder sb = new StringBuilder();
			sb.append(str.charAt(0));
			
			for(int i=1;i<str.length();i++) {
				
				char ch1= str.charAt(i);
				char ch2= str.charAt(i-1);
				
				int dif= ch1-ch2;
				sb.append(dif);
				sb.append(ch1);
				
				
			}
			
			System.out.println(sb.toString());
			
			
			
			
	}
	
	
	
	

}

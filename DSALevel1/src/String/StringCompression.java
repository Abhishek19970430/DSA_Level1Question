// question
// input= aaabbcdddfff;
// output= a3b2cd3f3


package String;
import java.util.*;
public class StringCompression {
   
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		String s = sc.nextLine();
		
		String Rs = s.charAt(0) + "";
		
		
		
		int i=1;
		int count=1;
		for( i=1; i<s.length();i++) {
			
			char ch1 = s.charAt(i-1);
			char ch2 = s.charAt(i);
			
			if(ch1 == ch2) {
				count++;
			}else {
				if(count>1) {
				 Rs += count;
				 count=1;
				}
				
				Rs += ch2;
				
			}
		}
		if(count>1 ) {
			Rs+=count;
			count=1;
		}
		System.out.println(Rs);
		
		
	}
	
	
	
}

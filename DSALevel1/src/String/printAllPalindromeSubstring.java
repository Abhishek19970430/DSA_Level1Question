package String;
import java.util.*;
public class printAllPalindromeSubstring {
    
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();						
//		System.out.println("Yes");
		checkPalindrome(str);
	
	}
	
	public static void checkPalindrome(String str){
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<=str.length();j++) {
				int k=0;
				String s= str.substring(i,j);
				int l= s.length()-1;
				
				while(k<l) {
					char ch1= s.charAt(k);
					char ch2= s.charAt(l);
					if(ch1 != ch2) {
						break;
					}else {
						k++;
						l--;
					}	
				}
				if(k>=l) {
				System.out.println(s);
				}
				
				
			}
		}
		

	}

	
	
}

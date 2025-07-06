package recursion;
import java.util.*;
public class getSubsequence {
	public static void main(String[] args) {
		
		String str= "abc";
		//output= [  , c , b, bc a, ac, ab, abc] this is sub-sequence of string "abc" 
		System.out.println(getGss(str));
		
	}
	
	
	
	public static ArrayList<String> getGss(String str) {
		
		if(str.length()==0) {
			ArrayList<String> bres= new ArrayList<>();
		     bres.add("");	
			return bres;
		}
		String ss=str.substring(1);
		char ch= str.charAt(0);
		ArrayList<String> subList = getGss(ss); // faith from this funtion that it will give sub-sequence of 
		                                       // string "bc"=[  , c, b ,bc];
//Now we have to concatinate each subsequence of bc with a and than without a 
		ArrayList <String> restr = new ArrayList<>(); 
		   
		   for(String s: subList) {
			   restr.add(ch+s);
		   }
		   for(String s: subList) {
			   restr.add(s+" ");
		   }
		return restr;
		
	}

}

package recursion;
import java .util.*;
public class PrintAllPermutation {

	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		String str =  sc.nextLine();
		
		PAP(str, "");
	}
	
	public static void PAP(String str, String ans) {
		
		if(str.isEmpty()) {
			System.out.println(ans);
			return;
		}
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			String rsl= str.substring(0, i);//remaining string Left
			String rsr = str.substring(i+1);// remaing String Right
			String cs = rsl+rsr;// combine String For Next recursive call
			    PAP(cs,ans+ch);// Here we Add character ch in our Answer Array
		}
		
		
	}
	
	
	
}

package recursion;
import java.util.*;
public class printEncoding {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		String str= sc.nextLine();
		
		   PE(str ,"");//"123"
		
	}
	
	
	public static void PE(String ques, String asf ) {
		if(ques.length()==0) {
			System.out.println(asf);
			return;
		}else if(ques.length() ==1){
			char ch= ques.charAt(0);
			if(ch=='0') {
				return;
			}else {
			int chI =  ch-'0';
			char chv =  (char)('a'+ chI-1);
			asf = asf + chv; 
			System.out.println(asf);
			}
			
		} else{
			char ch= ques.charAt(0);
			String ros = ques.substring(1); 
			
			if(ch=='0') {
				return;
			}else {
			int chI =  ch-'0';
			char chv =  (char)('a'+ chI-1);
			asf = asf + chv; 
			PE(ros,asf);	
		}
			
		   String ch12= ques.substring(0,2);
		   String roq= ques.substring(2);
		   
		   int ch12v = Integer.parseInt(ch12);
		   
		   char charch12v= (char)('a'+ch12v-1);
		     PE(roq, asf+charch12v);
			
		
		
	}
	
	
}
}

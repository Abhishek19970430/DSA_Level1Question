package recursion;
import java.util.*;
public class StringAndArrayListBasics {
	
	
	public static void main(String[] args) {
		String str= "hello";
//		System.out.println(str);
	
	
//	for(int i=0;i<str.length();i++) {
//		char ch= str.charAt(i);
//		System.out.println(ch);
//		
//		
//	}
	
//	String ss= str.substring(2,5);
//	System.out.println(ss);
			
		
//**************ArrayList******************
		
		ArrayList<String> stList= new ArrayList<>();
		stList.add("Abhishek");
		stList.add("Verma");
		stList.add("San");
		stList.add("Advit");
//		System.out.println(stList  +"->" + stList.size());
		
//		for(String val: stList) {
//			System.out.println(val);
//		}
		
//  for( int i=0; i<stList.size();i++) {
//	  System.out.println(stList.get(i));
//  }
  
  stList.set(2,"Sankalp");
  
  for( int i=0; i<stList.size();i++) {
	  System.out.println(stList.get(i));
  }
	
	}
}

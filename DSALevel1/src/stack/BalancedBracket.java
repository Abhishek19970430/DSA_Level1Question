package stack;
import java.util.*;
public class BalancedBracket {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		String str= sc.nextLine();
		Stack<Character> st= new Stack<>();
		
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			
			if(ch=='('||ch=='{'||ch=='[') {
				st.push(ch);
			}else if(ch==')'||ch=='}'||ch==']') {
				if(ch==')') {
					if(st.peek()=='(') {
						st.pop();
					}else {
						System.out.println("No it not Balaced Bracket");
						return;
					}
				}else if(ch=='}') {
					if(st.peek()=='{') {
						st.pop();
					}else {
						System.out.println("No it not Balaced Bracket");
						return;
					}
					
				}else if(ch==']') {
					
					if(st.peek()=='[') {
						st.pop();
					}else {
						System.out.println("No it not Balaced Bracket");
						return;
					}
				}else if(st.isEmpty()) {
					System.out.println("No it not Balaced Bracket");
					return;
				}
					
				
				}
			}
		System.out.println("true");	
			
		}
		
		

	}



package stack;
import java.util.*;
public class ValidParenthesis {

	public static void main(String[] args) {
		System.out.println(isValid("()[]{}"));
		
	}
	
	
	    public static boolean isValid(String s) {
	        Stack<Character> st = new Stack<>();
	         
	         for(int i=0;i<s.length();i++){
	          char ch= s.charAt(i);

	          if(ch=='('||ch=='{'||ch=='['){
	            st.push(ch);
	          }else{
	            if(ch==')'){
	                if(st.peek()!='('){
	                  return false;
	                }else{
	                    st.pop();
	                }
	            }else if(ch=='}'){
	                if(st.peek()!='{'){
	                    return false;
	                }else{
	                	st.pop();
	                }
	            }else if(ch==']'){
	                if(st.peek()!='['){
	                    return false;
	                }else{
	                	st.pop();
	                }
	            }
	          }

	        

	         }
	         return true;

	    }
	}
	


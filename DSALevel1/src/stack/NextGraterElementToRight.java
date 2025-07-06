package stack;
import java.util.*;
public class NextGraterElementToRight {

	public static void main(String[] args) {
		
		int [] arr= {2,5,9,3};//given in question
		int [] brr= new int [arr.length];// Create new array of same size; 
		int l= arr.length-1;
		Stack<Integer> st= new Stack<>();// Create Stack of Integer Type
		
		st.push(arr[arr.length-1]);// Assign last element of array arr to the to the stack means value
		                           // 3 in this case.
		
		brr[arr.length-1]= -1;// Assign -1 to the last index of array brr because their is nothing greater
		                       // than 3 at right of 3
		
		
//		niche vale loop me ham pahle check kar rahe hai than answer array brr me ans assign kar rahi hai or false aane par  
//		stack se value pop kar rahai hai. agar stack empty ho jata hai to aur arr[i] se badi koi value nahi milti 
//		to answer array me -1 assign kar dete hai aur arr[i] par rakhi value ko push kar dete hai
		
		for( int i=arr.length-2;i>=0;i--) {
			while(!st.isEmpty()) {
				if(st.peek()>arr[i]) {
					brr[i]=st.peek();
					st.push(arr[i]);
					break;
				}else {
					st.pop();
				}
				
			}
			if(st.isEmpty()) {
				brr[i]=-1;
				st.push(arr[i]);
			}
			
			
			
			
		}
		
		for(int val:brr) {
			System.out.print(val+" ");
		}
		
		
	}
	
	
	
	
}

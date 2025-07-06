package stack;
import java.util.*;
public class NextSmallerElementToTheLeft {

	public static void main(String[] args) {
		int[] arr = {2,5,9,3,4,6,8};
		
		int [] brr= new int [arr.length];
		
		Stack<Integer> st= new Stack<>();
		
		st.push(arr.length-1);
		
		for(int i=arr.length-2;i>=0;i--) {
			while(st.size()>0 && arr[i]<arr[st.peek()]) {
				int pos= st.peek();
				brr[pos]= arr[i];
				st.pop();
				}
			
			st.push(i);
		}
		
		while(st.size()>0) {
			int pos= st.peek();
			brr[pos]=-1;
			st.pop();
		}
		
		for(int val:brr) {
			System.out.print(val+" ");
		}
	}
	
	
}

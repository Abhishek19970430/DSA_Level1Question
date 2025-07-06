package stack;
import java.util.*;
public class StockSpan {

public static void main(String[] args) {
	int [] arr= {5,6,8,4,7,9,8,4,2};
	int [] brr = new int[arr.length];
	int [] ans= new int [arr.length];
	
	Stack<Integer> st= new Stack<>();
	
	st.push(arr.length-1);
	
	for( int i=arr.length-2;i>=0;i--) {
		
		while(st.size()>0 && arr[i]> arr[st.peek()]) {
			int pos=st.peek();
			brr[pos]= i;
			st.pop();
		}
		
		st.push(i);
	}
	
	while(st.size()>0) {
		int pos= st.peek();
		brr[pos]=-1;
		st.pop();
	}
	
	for(int k=0;k<arr.length;k++) {
		
		if(brr[k]==-1) {
			ans[k]= k+1;
		}else {
			
			ans[k]= k-brr[k];
			 
		}
		
		
		
	}
	
	for( int val:ans) {
		System.out.print(val+" ");
	}
	
	
}
}

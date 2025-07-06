package stack;
import java.util.*;
public class NextGreaterElementToRightAprroch2 {
public static void main(String[] args) {
	int [] arr= {4,5,6,3};
	Stack<Integer> st =new Stack<>();
	int [] brr= new int[arr.length];
	
	st.push(0);
	
	
	for(int i=1;i<arr.length;i++) {
		
		while(st.size()>0 && arr[i]>arr[st.peek()] ) {
			int pos= st.peek();
			brr[pos]=arr[i];
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

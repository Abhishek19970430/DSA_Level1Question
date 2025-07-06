package stack;
import java.util.*;
public class NextSmallerElementToRight {
public static void main(String[] args) {
	
	int [] arr= {2,5,9,3,4,6,8};
	
	int [] brr= new int[arr.length];
	
	Stack<Integer> st= new Stack<>();
	st.push(arr[arr.length-1]);
	brr[arr.length-1]=-1;
	
	for(int i=arr.length-2;i>=0;i--) {
		while(!st.isEmpty()) {
			if(st.peek()<arr[i]) {
				brr[i]= st.peek();
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
	
	for(int val: brr) {
		System.out.print(val+" ");
	}
	
}
	
	
	
}

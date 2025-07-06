package stack;
import java.util.*;
public class LargestAreaHistogram {
   
	// largest area in histogram nikalne ke liye ham har ek baar ka 
	// next smaller element in left and next smaller element in right
	// nikal lene se ham left and right boundary ka index nikal legai than
	// than un dono ke difference ko us element ki height se multiply karne par 
	// largest area rectangle us height ke element ka pata lag jata hai 
	//than greatest among all the area is our answer.
	public static void main(String[] args) {
		int [] arr = {6,2,5,4,5,1,6};
		
		int [] rb = new int [arr.length];//array rb contain index of next smaller element at right
		int [] lb = new int [arr.length];//array lb contain index of next smaller element at left;
		int [] area= new int [arr.length];
		Stack<Integer> st= new Stack<>();
		Stack<Integer> st2= new Stack<>();
		
		st.push(0);
		for( int i= 1; i<arr.length; i++) {
			while(st.size()>0 && arr[i]<= arr[st.peek()]){
				int pos= st.peek();
				rb[pos]= i;
				st.pop();
			}
			st.push(i);
			
		}
		
		while(st.size()>0) {
			   int pos= st.peek();
			   rb[pos]=arr.length;
			   st.pop();
		   }
		
		
		for(int val: rb) {
			System.out.print(val+" ");
		}
	//******************* left Boundary ************************	
		
		st2.push(arr.length-1);
		
		for(int i=arr.length-2;i>=0;i--) {
			while(st2.size()>0 && arr[i]<=arr[st2.peek()]) {
				int pos= st2.peek();
				lb[pos]= i;
				st2.pop();
			}
			st2.push(i);
		}
		
		while( st2.size()>0) {
			int pos= st2.peek();
			lb[pos]= 0;
			st2.pop();
		}
       System.out.println();
		for(int val: lb) {
			System.out.print(val+" ");
		}
		
		for(int i=0; i<arr.length;i++) {
			int base= (rb[i]-lb[i])-1;
			 area[i]= base*arr[i];
			
		}
		System.out.println();
		for(int val: area) {
			System.out.print(val+" ");
		}
		
		int max=0;
		for(int i=0;i<area.length;i++) {
			if(area[i]>max) {
				max= area[i];
			}
		}
		System.out.println();
		System.out.println("Maximum area of Histogram is "+ max );
	}
	
	
}

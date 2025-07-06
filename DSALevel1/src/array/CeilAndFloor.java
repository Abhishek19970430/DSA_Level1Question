package array;
import java.util.*;
public class CeilAndFloor {
public static void main(String[] args) {
	int [] arr= {10,20,30,40,50,60,70,80};
	int data= 61;
	
	int s=0;
	int e= arr.length;
	int mid=0;
	int ceil=0;
	int floor=0;
	while(s<=e) {
		mid=(s+e)/2;
		
		if(data>arr[mid]) {
			s=mid+1;
			floor=arr[mid];
		}else if(data<arr[mid]) {
			e= mid-1;
			ceil= arr[mid];
		}else {
			ceil=arr[mid];
			floor=arr[mid];
			
		}
		
	}
	
	System.out.println("ceil of number is "+ ceil+" and "+ "floor of a number is " + floor );
	
}


	

	
}

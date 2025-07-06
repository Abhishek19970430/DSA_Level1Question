package array;
import java.util.*;
public class BinarySearchAlgoArray {
public static void main(String[] args) {
	
	int [] arr= {10,20,30,40,50,60,70,80};
	int x= 7;
	
	int index=BinarySearch(arr, x);
	
	System.out.println(index);
	if(index==-1) {
		System.out.println("Sorry Element not Found");
	}else {
	    System.out.println("Element Found at "+index +" index");
	}
	
	
	
	
	
	
	
}

public static int BinarySearch(int [] arr, int x) {
	int s=0;
	int e= arr.length;
	int mid=0;
	while(s<=e) {
	mid=(s+e)/2;
	
	if(arr[mid]== x) {
		break;
	}else if(x<arr[mid]) {
		e= mid-1;
	}else if(x>arr[mid]) {
		s=mid+1;
	}
	
}
	if(s>e) {
		return-1;
	}else {
	return mid;
	}
}
}

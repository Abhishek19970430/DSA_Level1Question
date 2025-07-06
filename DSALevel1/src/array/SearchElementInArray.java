package array;

import java.util.Scanner;

public class SearchElementInArray {
public static void main(String[] args) {
	Scanner sc= new Scanner( System.in);
	int n= sc.nextInt();
	int [] arr= new int [n];
	
	for(int i=0;i<n;i++) {
		arr[i]= sc.nextInt();
	}
	
	int d= sc.nextInt();
	System.out.println(FindNumber(arr,d));
}

public static int FindNumber(int [] arr, int d) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==d) {
			return i;
		}
	}
	
	return -1;
}
}

package array;

import java.util.Scanner;

public class BarChart {
public static void main(String[] args) {
	Scanner sc= new Scanner( System.in);
	int n= sc.nextInt();
	int [] arr= new int [n];
	
	for(int i=0;i<n;i++) {
		arr[i]= sc.nextInt();
	}
	int max=Findmax(arr);
	
	for(int i=max;i>0;i--) {
		for(int j=0;j<arr.length;j++) {
			if(i>arr[j]) {
				System.out.print(" \t");
			}else {
				System.out.print("*\t");
			}
			
		}
		System.out.println();
	}
	
	
	
}
public static int Findmax(int [] arr) {
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max= arr[i];
		}
	}
	
	return max;
}
}

package array;

import java.util.Scanner;

public class DifferenceOfTwoArray {
	public static void main(String[] args) {
		Scanner sc= new Scanner( System.in);
		int n1= sc.nextInt();
		int [] a1= new int[n1];
		
		for(int i=0;i<n1;i++) {
			a1[i]= sc.nextInt();
		}
		
		int n2= sc.nextInt();
		int [] a2= new int[n2];
		
		for(int i=0;i<n2;i++) {
			a2[i]= sc.nextInt();
		}
		
		int [] dif= new int [n1>n2?n1:n2];
	
		int i= a1.length-1;
		int j= a2.length-1;
		int k= dif.length-1;
		int d=0;
		int borrow=0;
		
		while(k>=0) {
			
			
			if(i>=0&&j>=0){
				if(a1[i]<a2[j]) {
					d=a1[i]+10-a2[j]+borrow;
					borrow=-1;	
				}else {
					d=a1[i]-a2[j];
					}
				
			}else {
				d=(a1[i]+borrow);
			}
				
			
			dif[k]=d;
			
			i--;
			j--;
			k--;
			
		}
		
		for(int val:dif) {
			System.out.print(val+" ");
		}
	
}
}

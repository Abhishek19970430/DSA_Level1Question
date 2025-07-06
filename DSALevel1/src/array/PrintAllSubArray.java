package array;
import java.util.*;
public class PrintAllSubArray {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int n= sc.nextInt();
	
	int [] arr = new int [n];
	
	for(int i=0;i<arr.length;i++) {
		arr[i]= sc.nextInt();
	}
	
	for(int i=0;i<arr.length;i++) {
		for(int k=0;k<arr.length;k++) {
			for( int j=i;j<=k;j++) {
				System.out.print(arr[j]+",");
			}
			System.out.println();
		}
	}
	
	
	
}
	
	
	
	
}

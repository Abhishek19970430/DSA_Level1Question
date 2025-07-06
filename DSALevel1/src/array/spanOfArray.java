package array;
import java.util.*;

public class spanOfArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner( System.in);
		int n= sc.nextInt();
		int [] arr= new int [n];
		
		for(int i=0;i<n;i++) {
			arr[i]= sc.nextInt();
		}
		int max= Findmax(arr);
		int min= Findmin(arr);
		System.out.println("Span of array is "+ (max-min));
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
	
	public static int Findmin(int [] arr) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min= arr[i];
			}
		}
		
		return min;
	}
	
	
	
	
	
}

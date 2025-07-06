package array;
import java.util.*;
public class rotateAnArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4,5,6,7};
		int k=3;
		
		int l=arr.length;
		//Output: [5,6,7,1,2,3,4]
		
		reverse(arr,(l-k),(l-1));
		reverse(arr,0,(l-k-1));
		reverse(arr,0,(l-1));
		
		for(int val: arr) {
			System.out.print(val+",");
		}
		
		
		
		
	}
	
	public static int [] reverse(int [] arr, int s,int l) {
		int temp;
		while(s<l) {
			temp=arr[l];
			arr[l]=arr[s];
			arr[s]= temp;
			s++;
			l--;
		}
	
		return arr;
	}
	
}



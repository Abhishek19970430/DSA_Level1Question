package recursion;

public class PrintALLIndex {
	public static void main(String[] args) {
		
		int [] arr = {2,3,6,9,8,3,2,3,6};
		int count =0;
		int data=2;
		
		int [] result = findAllIndex(arr, 0, data, count);
		
		
		for(int val: result) {
			System.out.println(val);
		}
		
	}
	
	
	public static int[] findAllIndex(int [] arr, int idx ,int data, int count ) {
		
		if(idx== arr.length) {
			
			return new int [count];
		}
		
		if(arr[idx]== data) {
			int [] brr= findAllIndex(arr, idx+1, data, count+1);
			brr[count]= idx;
			return brr;
		}else {
			int [] brr=findAllIndex(arr, idx+1, data, count);
			return brr;
		}
		
		
		
		
	}
}

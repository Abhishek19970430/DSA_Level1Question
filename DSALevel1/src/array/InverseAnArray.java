package array;

public class InverseAnArray {

	public static void main(String [] args ) {
		int [] arr = {3,4,1,2,0};
		int [] brr = new int [arr.length];
		
		
		for(int i=0; i<arr.length;i++) {
			brr[arr[i]]=i;
		}
		
		for(int val:brr) {
			System.out.println(val);
		}
		
		
		
	}
	
	
}

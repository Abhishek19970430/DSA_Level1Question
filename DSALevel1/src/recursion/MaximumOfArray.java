//Expectation from maxofArray(arr,idx) is that it will find tha maximum 
//of the array from index idx to end of array or you can say 0 to end 

//Faith
// maxOfArray(arr,idx+1);es function se ye fainth hai ki ye 
// hame idx+1 se end ke beech maximum nikal kar dega


//How to meet faith to our Expectaion

// maxOfArray(arr,idx+1) ne hame (idx+1) se end tak ke beech ka max value nikal 
// ke diya maine use arr[idx] se compare kiya aur max of the array 
// find kar liya.



package recursion;

public class MaximumOfArray {

	public static void main(String[] args) {
		
		int [] arr = {22,1010,2,33,7,76,19};
		
	System.out.println(maxOfArray(arr,0));
		
	}
	
	public static int maxOfArray(int [] arr, int idx) {
		
		if(idx==arr.length) {
			return 0;
		}
		
		
		int misa= maxOfArray(arr,idx+1);
		
		if(misa>arr[idx]) {
			return misa;
		}else {
			return arr[idx];
		}
		
	}
	
	
}

package recursion;

public class LastIndex {

	public static void main(String[] args) {
		 
		int [] arr= {2,3,6,9,8,3,2,3,6,4};
		int data= 2;
		
		int idx= arr.length-1;
		System.out.println(lastIndex(arr,idx,data));
		
//		//Expectation
//		lastIndex(arr,idx,data);
//		
//		// faith 
//		lastIndex(arr,idx-1,data);

		
	}
	
	
	public static int lastIndex(int [] arr ,int idx, int data){
		if(idx<0) {
			return -1;
		}
		
		if(arr[idx]==data) {
			return idx;
			
		}
		
		int liisa= lastIndex(arr,idx-1,data);
			
		if(liisa==-1) {
				return -1;
	    }else {
		  return liisa;
	   }
	}
	
	
}


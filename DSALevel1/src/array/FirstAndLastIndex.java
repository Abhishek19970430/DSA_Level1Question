package array;

public class FirstAndLastIndex {
public static void main(String[] args) {
	int [] arr= {10,20,20,20,20,20,30,40,50,90};
	int data= 20;
		int s=0;
		int e= arr.length-1;
		int mid=0;
		
		int SIndex=-1;
		
		while(s<=e) {
			mid=(s+e)/2;
			
			 if(arr[mid]>data) {
				e= mid-1;
			}else if(arr[mid]<data) {
				s=mid+1;
			}else {
				SIndex=mid;
				e=mid-1;
			}
			
		}
		
		System.out.println(SIndex);
		
		s=0;
		e=arr.length-1;
		int LIndex=-1;
		

		while(s<=e) {
		mid=(s+e)/2;
		
		 if(arr[mid]>data) {
			e= mid-1;
		}else if(arr[mid]<data) {
			s=mid+1;
		}else {
			LIndex=mid;
			s=mid+1;
			
		}
		
	}
		System.out.println(LIndex);
		
		
		
		
}

}

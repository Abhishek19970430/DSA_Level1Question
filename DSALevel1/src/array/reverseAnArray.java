package array;

public class reverseAnArray {
public static void main(String[] args) {
	int [] arr= {5,4,6,4,6,2};
	int i=0;
	
	int j=(arr.length-1);
	System.out.println(j);
	int temp=0;
	while(i<=j) {
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
		i++;
		j--;
	}
	for(int val:arr) {
		System.out.print(val+" ");
	}
}
	
	
}

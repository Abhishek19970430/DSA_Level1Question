// Question array arr ko reverse order me print karna hai.
// Output ye aana chahiye {50,40,30,20,10}; recursion ki bhasa 
// me kahe to meri expectation ye hai  displayArr(arr,idx) se
// faith hai displayArr(arr,idx+1) se ki vo (50,40,30,20) print  
// kar dega.


package recursion;



import java.util.Scanner;

public class DisplayReveverseArray {

	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		
		int [] arr= {10,20,30,40,50};
		
		
		displayArr(arr,0);
		
	}
	
	public static void displayArr(int [] arr, int idx) {
		if(idx==arr.length) {
			return;
		}
		
		displayArr(arr,idx+1);
		System.out.println(arr[idx]);// ye line likar hamne faith and Expectation ko meet kar diya
		
	}
	
	
	}
	
	


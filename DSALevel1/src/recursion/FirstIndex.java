//Question-3  ki pahli occurance kis index pe ho rahi hai us index ki value  
// return karo.

//Expectation
//function Find(arr,0,data)  -> es function se Expectation, ye hai ki 
// ye 0 se end ke beech data kis index pe hai vo return kare.  

// Faith 
// function Find(arr,1,data) -> es function se ye Faith hai ki ye hame 1 se last 
// index ke beech data jis staring index pe milega vo index treturn karega 
// jese es Exaple me index number 1 pe 3 hai.

package recursion;
public class FirstIndex {
public static void main(String[] args) {
	
	int [] arr = {2,3,5,3,2,4,6,3,5,3,6};
	int data=5;
	
	System.out.println(find(arr,0,data));
	
}

public static int find(int [] arr, int idx, int data) {
	if(idx == arr.length) {
		return 0;
	}
	
	 find(arr,idx+1, data);
	 
	if(arr[0]==data) {
		return 0;
	}
	else if( arr[idx]== data){
		return idx;
		break;
	}else {
		return -1;
	}
	
	
}
	
	
}

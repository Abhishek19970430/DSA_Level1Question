package recursion;
import java.util.*;

public class GetStairPath11 {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner( System.in);
		int n= sc.nextInt();
		ArrayList<String>Result= getPath(n);
		System.out.println(Result);
		
	}
	
	public static ArrayList<String> getPath(int n) {
		
		if(n==0) {//Positive base case
			ArrayList <String> bres = new ArrayList<>();
			bres.add("");// 0 se 0 pe jane ka rasta hai ki chalo hi mat you are already their
			return bres;
		}else if(n<0) {// Negative Base Case
			ArrayList <String> bres = new ArrayList<>();
			return bres;// yaha empty arrayList dena jaruri hai  kyuki function ka return type ArrayList hai.  
		}
		
		ArrayList<String>paths1  =getPath(n-1);
		ArrayList<String>paths2  =getPath(n-2);
		ArrayList<String>paths3  =getPath(n-3);
		
		ArrayList <String> paths= new ArrayList<>();
		
		for(String path: paths1) {
			paths.add(1+ path);
		}
		
		for(String path: paths2) {
	 		paths.add(2+ path);
		}
		for(String path: paths3) {
			paths.add(3+ path);
		}
		
		return paths;
	}
	
	
}

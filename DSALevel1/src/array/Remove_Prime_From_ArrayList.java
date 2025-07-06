package array;
import java.util.*;
public class Remove_Prime_From_ArrayList {
	
	public static void main(String [] args) {
		
		ArrayList<Integer> num = new ArrayList<>(Arrays.asList(7,10,11,13,42,15,13));
		
		for(int i=num.size()-1;i>=0;i--) {
			
			boolean Result= checkPrime(num.get(i));
			
			if(Result == true) {
				num.remove(i);
			}
			
		
		}
		
		System.out.println(num);
		
		
		
		
		
	}
	 public static boolean checkPrime(int N) {
		
			
			for(int i=2;i<N;i++) {
				
				if(N%i==0) {
					return false;
					
				}
			}
			
		return true;
			
			
		}
	
	

}

package DSABasics;
import java.util.*;
public class primeFactorization {

	/**
	 * @param args
	 */
	public static void main(String [] args) {
		Scanner sc= new Scanner (System.in);
		
		int Number = sc.nextInt();
		
		for(int i=2;Number>=i;i++) {
			while(Number%i==0) {
			Number=Number/i;
			System.out.println(i);
			}
			
		}
		
		if(Number!=1) {
			System.out.println(Number);
		}
		
	}
	
}

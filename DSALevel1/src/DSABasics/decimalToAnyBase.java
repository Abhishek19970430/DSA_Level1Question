package DSABasics;
import java.util.*;
public class decimalToAnyBase {

	
	public static int dToAny (int number,int base) {
		int i=0;
		int rem;
		int sum=0;
		while(number!=0) {
			rem=number%base;
			sum+=(int)(rem*Math.pow(10, i));
			i++;
			number=number/base;
		}

		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner( System.in);
		int n = sc.nextInt();
		int b= sc.nextInt();
		
		
		System.out.println(dToAny(n,b));
		
		}
	
	
}

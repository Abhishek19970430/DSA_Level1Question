package numberSystemConversion;
import java.util.*;
public class anyToDecimal {
	public static int AnyTod (int number,int base) {
		int i=0;
		int rem;
		int sum=0;
		while(number!=0) {
			rem=number%10;
			sum+=(int)(rem*Math.pow(base, i));
			i++;
			number=number/10;
		}

		return sum;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner( System.in);
		int n = sc.nextInt();
		int b= sc.nextInt();
		
		
		System.out.println(AnyTod(n,b));
		
		}
}

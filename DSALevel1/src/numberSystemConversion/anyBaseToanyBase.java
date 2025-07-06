package numberSystemConversion;
import java.util.*;
public class anyBaseToanyBase {
	
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
	
	int n= sc.nextInt();
	int b1= sc.nextInt();
	int b2= sc.nextInt();
	
	int d=AnyTod(n,b1);
	System.out.println(dToAny(d,b2));
	
	
	  }

	
	
	
	
	
	
}


package numberSystemConversion;

import java.util.Scanner;
import java.util.*;

public class anybaseSubtration {
	
	public static int AnyBaseSubtraction(int num1,int num2,int base) {
		int d1;
		int d2;
		int d;
		int p=1;
		int ans=0;
		while(num1>0||num2>0) {
		
		d1=num1%10;
		d2= num2%10;
		if(d1>d2) {
		d=d1-d2	;
		 num1=num1/10;
		 num2=num2/10;
		
		}else {
			d1=d1+base;
			d=d1-d2	;
			num1=num1/10;
			num1= num1-1;
			num2/=10;
			
			ans=ans+d*p;
			p*=10;
		
		}
		}
			
		return ans;
	}
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int base= sc.nextInt();
		int num1= sc.nextInt();
		int num2= sc.nextInt();
		
		System.out.println(AnyBaseSubtraction(num1,num2,base));
	}

	
}

package numberSystemConversion;
import java.util.*;
public class anyBaseAddition {
	
	public static int AnybaseAddition(int num1 ,int num2,int base) {
		int d1=0;
		int d2=0;
		int sum=0;
		int c=0;
		int p=1;
		int ReqNumber=0;
		while(num1>0||num2>0||c>0) {
		 d1=num1%10;
		 d2= num2%10;
		 num1=num1/10;
		 num2=num2/10;
		
		 sum=d1+d2+c;
		 c=sum/base;
		 sum =sum%base;
		 
		 
		 ReqNumber= ReqNumber+sum*p;
		 p*=10;
		}
		
		return ReqNumber;
	}
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int base= sc.nextInt();
	int num1= sc.nextInt();
	int num2= sc.nextInt();
	
	
	System.out.println(AnybaseAddition(num1,num2,base));
	
	
	
}
	
	
	
}

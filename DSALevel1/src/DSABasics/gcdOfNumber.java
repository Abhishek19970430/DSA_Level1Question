package DSABasics;
import java.util.*;
public class gcdOfNumber {
public static void main(String[]args) {

	Scanner sc= new Scanner(System.in);
	int num1=sc.nextInt();//divisor
	int num2= sc.nextInt();//divident
	int rem=100;
	
	
	int Onum1=num1;//24
	int Onum2= num2;//36
	while(rem!=0) {
	 rem=num2%num1;//0
	if(rem==0) {
		break;
	}
	 num2=num1;//12
	 num1=rem;//12
	}
	int GCD=num1;
	System.out.println(GCD);
	
	
	int LCM= (Onum1*Onum2)/GCD;
	System.out.println(LCM);
	
	
	
}
	
}

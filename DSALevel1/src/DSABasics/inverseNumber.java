package DSABasics;
import java.util.*;
public class inverseNumber {

	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int Number= 135246;
		double temNum=0;
		int x=0;
		
		for(int i=1; Number>0;i++) {
			 x= Number%10;
			 temNum= temNum+ i*(Math.pow(10, x-1));
			Number=Number/10;
		}
		System.out.println((int)temNum);
	}
	
	
}

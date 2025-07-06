package DSABasics;
import java.util.*;

public class pattern16 {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int st=1;
		int sp= (2*n-3);
		int count;
		
		for(int i=1;i<=n;i++) {
			count=1;
			for(int j=1;j<=st;j++) {
				System.out.print(count+"\t");
				if(j!=n) {
					count++;
				}
				
				
			}
			
			for(int j=1;j<=sp;j++) {
				System.out.print(" \t");
			}
		
			for(int j=1;j<=st;j++) {
		         count--;
		         if(j!=n) {
				System.out.print(count+"\t");
		         }
				
			}
			
			System.out.println();
			sp-=2;
			st++;
		}
		
		
	}
	
}

package DSABasics;
import java.util.*;
public class pattern6 {

	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int st=3;
		int sp=1;
		for(int i=0; i<n; i++) {
			for(int j=0;j<st;j++) {
				System.out.print("*\t");
			}
			for(int k=0;k<sp;k++) {
				System.out.print(" \t");
			}
			for(int l=0;l<st;l++) {
				System.out.print("*\t");
			}
			System.out.println();
			
			if(i<n/2) {
				st--;
				sp=sp+2;
			}else {
				st++;
				sp=sp-2;
			}
			
		}
		
		
		
	}
	
	
}

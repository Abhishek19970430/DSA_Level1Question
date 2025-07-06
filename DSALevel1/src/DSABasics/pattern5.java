package DSABasics;
import java.util.*;
public class pattern5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int sp=2;
		int st=1;
		
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<sp;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<st;k++) {
				System.out.print("*");
			}
			System.out.println();
			if(i<n/2) {
				sp--;
				st=st+2;
			}else {
				sp++;
				st=st-2;
			}
			
			
		}
		
	}
	
	
}

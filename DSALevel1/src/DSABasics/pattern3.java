package DSABasics;
import java.util.*;
public class pattern3 {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			for(int k=0; k<(n-i);k++) {
				System.out.print(" \t");
			}
			for(int j=0;j<i;j++) {
				System.out.print("*\t");
			}
			System.out.println();
		}
	}
 
 
}


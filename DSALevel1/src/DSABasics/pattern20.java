package DSABasics;
import java.util.*;
public class pattern20 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	for(int i=1; i<=n;i++) {
		for( int j=1; j<=n;j++) {
			if(i<=(n/2)) {
				if((j==1)||j==n) {
					System.out.print("*\t");
				}else {
					System.out.print(" \t");
				}
			}
			if(i==((n/2)+1)) {
				if(j%2==0) {
					System.out.print(" \t");
				}else {
					System.out.print("*\t");
				}
			}
			
			if(i==(n-1)) {
				if(j==(n/2)+1) {
					System.out.print(" \t");
				}else {
					System.out.print("*\t");
				}
			}
			
			if(i==n) {
				if((j==1)||j==n) {
					System.out.print("*\t");
				}else {
					System.out.print(" \t");
				}
			}
			
		}
		System.out.println();
	}
	
}

}

package DSABasics;
import java.util.*;
public class pattern7 {

	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		//Approch1
//		int sp=0;
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<sp;j++) {
//			   System.out.print(" \t");
//			}
//			System.out.print("*\t");
//			System.out.println();
//			sp++;
//		}
		
		//Approch 2
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==j) {
					System.out.print("*\t");
				}else {
					System.out.print(" \t");
				}
				
			}
			System.out.println();
		}
		
		
		
		
	}
	
	
	
}

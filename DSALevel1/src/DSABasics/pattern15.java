package DSABasics;
import java.util.*;
public class pattern15 {
public static void main(String [] args) {
	Scanner sc = new Scanner( System.in);
	int n= sc.nextInt();
	int sp=2;
	int st=1;
	int val=1;
	int cVal;
	for( int i=1;i<=n;i++) {
		
		for(int j=0;j<sp;j++) {
			System.out.print(" \t");
		}
		cVal=val;// cVal hamesa val se shuru hoga
		
		for(int k=0;k<st;k++) {
			System.out.print(cVal+"\t");
		//column me value control karne ke liye niche ye 
			//if else lagaya
			if(k<st/2) {
				cVal++;
			}else {
				cVal--;
			}
			
		}
		if(i<=n/2) {
			sp--;
			st+=2;
			val++;
		}else {
			sp++;
			st-=2;
			val--;
		}
		System.out.println();
	}	
}
}

package DSABasics;
import java.util.*;
public class pattern4 {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	
	for(int i=n;i>=1;i--) {
		for(int k=(n-i); k>0;k--) {
			System.out.print(" \t");
		}
		for(int j=i; j>0;j--) {
			System.out.print("*\t");
		}
		System.out.println();
	}
} 
	
	
}

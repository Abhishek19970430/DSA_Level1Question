package DSABasics;
import java.util.*;
public class FibonachiSeries {

	

		public static void main(String[] args) {
			System.out.println("Enter the number till you need Fibonachi");
			Scanner sc = new Scanner(System.in);
			 
			int n = sc. nextInt();
			
			int x=-1;
			int y=1;
			
			for(int i=0;i<n;i++) {
				int z=x+y;
				System.out.println(z);
				x=y;
				y=z;
				
			}
			
			
		}
	}



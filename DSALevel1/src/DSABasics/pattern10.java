package DSABasics;
import java.util.*;

public class pattern10 {
public static void main(String[]args) {
	Scanner sc= new Scanner(System.in);
	  int n= sc.nextInt();
	  
	  int os=2;
	  int is=-1;
	  for(int i=0;i<n;i++) {
		  for(int j=0;j<os;j++) {
			  System.out.print(" ");
		  }
		  System.out.print("*");
		  for(int k=0;k<is;k++) {
			  System.out.print(" ");
		  }
		  if(is>0) {
		  System.out.print("*");
		  }
		  
		  if(i<n/2) {
			  os--;
			  is+=2;
		  }else {
			  os++;
			  is-=2;
		  }
		  
		  System.out.println();
		  
	  }
	
}
	
	
}

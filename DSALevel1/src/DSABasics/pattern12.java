package DSABasics;
import java.util.*;
public class pattern12 {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n= sc.nextInt();
	int x=-1;
	int y=1;
	int z;
	for(int i=1;i<=n;i++) {
		for(int j=0;j<i;j++) {
			z=x+y;
			x=y;
			y=z;
			System.out.print(z+"\t");
		}
		System.out.println();
	}
	
	}
}

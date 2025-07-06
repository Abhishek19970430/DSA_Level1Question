package recursion;
import java.util.*;
public class PrintMazePathWithJump {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		int n= s.nextInt();
		int m= s.nextInt();
		 printAllPath(1,n,1,m,"");
		
		
//		sr=Source Row
//		dr= Destination  row
//		dc= Destination Column 
//		sc=Source Column
//		ms= Min. Step
		
	}
	
	public static void printAllPath(int sr,int dr,int sc,int dc, String psf) {
		
		if(sr==dr && sc==dc ) {
			System.out.println(psf);
			return ;
		}
		
		for(int ms=1; ms<=dr-sr; ms++) {
			printAllPath( sr+ms, dr, sc, dc, psf+"V"+ms);
		}
		
		for(int ms=1; ms<=dc-sc; ms++) {
			printAllPath( sr, dr, sc+ms, dc, psf+"H"+ms);
		}
		
		for(int ms=1; ms<=dc-sc && ms<= dr-sr; ms++) {
			printAllPath( sr+ms, dr, sc+ms, dc, psf+"D"+ms);
		}
		
		
		
	}
	
	
}

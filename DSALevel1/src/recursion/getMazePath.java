package recursion;
import java.util.*;
public class getMazePath {

	public static void main(String[] args) {
		
		ArrayList<String>paths= getMazePath(1,1,3,3);
		System.out.println(paths);
	}
	public static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc){
		if(sr==dr&&sc==dc) {
			ArrayList<String>bres = new ArrayList<>();
			bres.add("");
			return bres;
		}else if(sr>dr||sc>dc) {
			ArrayList<String>bres = new ArrayList<>();
			return bres;
		}
		
			ArrayList<String>paths1= getMazePath(sr+1,sc,dr,dc);
		
		
			ArrayList<String>paths2= getMazePath(sr,sc+1,dr,dc);
		
		
	    ArrayList<String> Paths= new ArrayList<>();
	    
	    for(String p1: paths1) {
	    	Paths.add("V"+p1);
	    }
	    for(String p2: paths2) {
	    	Paths.add("H"+p2);
	    }
		return Paths;
	}
	
}

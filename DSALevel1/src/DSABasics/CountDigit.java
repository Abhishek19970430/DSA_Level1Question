package DSABasics;
import java.util.*;
public class CountDigit {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int Number= sc.nextInt();
		int count=0;
		while(Number!=0) {
			Number= Number/10;
			count++;
		}
		System.out.println(count);
		
		
	}
	
}

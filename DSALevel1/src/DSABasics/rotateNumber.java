package DSABasics;
import java.util.*;
public class rotateNumber {

//*************This my Approch First Attempt********
//	public static void main(String[]args) {
//		int length=0;
//		int Number= 12739;//91273
//		int tempNum=Number;
//		int lnum=0;
//		int Rnumber=0;
//		int snum=0;
//		int Rnum=0;
//		
//		int rotate= -2;
//		if(rotate>0) {
//		
//		
//		
//		while(tempNum!=0) {
//			tempNum= tempNum/10;
//			length++;
//		}
//		for(int i=0;i<rotate;i++) {
//			lnum= Number%10;//3
//			Number=Number/10;//9127
//			Rnumber= (int)(lnum* Math.pow(10, length-1))+ Number;
//			Number=Rnumber;
//			
//			
//		}
//		System.out.println(Rnumber);
//		 
//		}else {
//			while(tempNum!=0) {
//				tempNum= tempNum/10;
//				length++;
//			}
//			for(int i=0;i>rotate;i--) {
//			
//			
//			snum=(int)(Number/Math.pow(10,length-1));
//			Rnum=(int)(Number%Math.pow(10,length-1));
//			Rnumber=Rnum*10+snum;
//			Number= Rnumber;
//			}
//			System.out.println(Rnumber);
//			
//		}
//		
//	}
	
	
//************ Smart Aproach********************	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Number= sc.nextInt();
		int R= sc.nextInt();
		int tempNum=Number;
		int nod=0;
		
		
		
		while(tempNum!=0) {
			tempNum= tempNum/10;
			nod++;}
		R=R%nod;
		if(R<0) {
			R=nod+R;
		}
		
		
		int divisor= (int)(Math.pow(10, R));
		int Multiplier= (int)(Math.pow(10, nod-R));
		
		int quotient = Number/divisor;
		int Rem= Number%divisor;
		
		int Rnumber= (Rem*Multiplier)+ quotient;
		
		System.out.println(Rnumber);
	}
	
}

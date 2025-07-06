package DSABasics;

public class CheckPythagorus {

	public static void main(String[] args) {
		int a=4;
		int b=3;
		int c=5;
		boolean Flag=false;
		a=a*a;
		b=b*b;
		c=c*c;
		
		if(a==(b+c)) {
			Flag=true;
		}else if(b==(c+a)) {
			Flag=true;
		}else if(c==(a+b)) {
			Flag=true;
		}
		
		System.out.println(Flag);
	}
}

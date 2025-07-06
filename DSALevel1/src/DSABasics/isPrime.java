package DSABasics;
import java. util.*;
public class isPrime {
public static void main(String []arg) {
	Scanner sc= new Scanner(System.in);
	int t= sc.nextInt();  // t ki value 10 pow 4 tak ja saki hai
	int [] arr= new int [t];
	boolean flag=false;
	
	for(int i=0;i<t;i++) {
		 arr[i]= sc.nextInt();
	}
	
	for(int n:arr) {
		for(int i=2; i*i<=n;i++) { //ye vala loop n ki value 10pow9 tak ja sakta hai 
			if((n% i)==0) {
				flag=true;
				break;
			}
			
		}
		if(flag==true) {
			System.out.println("not prime");
		}else if(flag==false) {
			System.out.println("prime");
		}
	}
}
}

//total time complexity by adding t and n 10pow4 *10pow9=  10 pow13 ho jayegi 
// jo time limit exceed error dega

//Solution of This problem

//Note= Agar koi number 2 se apne square root tak kisi number se divide nahi hota to vo age bhi 
// kisi number se divide nahi hoga for example 49 agar 49 2 se 7 ke beech kisi number divide hua to
// thik varna 7 ke age aesa koi number nahi hoga jo 49 ko divide kare 49 ke sivaye , vese 7 to 49 ko 
// divide karta hai to 49 ek prime number nahi hai.

// to ham prime number check karne ke liye 2 se squareRoot of n tak check karegai only, to hamari 
//complexity 10pow9 se ghat kar 10pow3 and over all complexity 10pow7 ho jayegi






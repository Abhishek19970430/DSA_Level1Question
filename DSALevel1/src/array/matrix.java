package array;
import java.util.*;
public class matrix {
	
	public static void main(String args[]) {
	       
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] arr= new int [row][col];
        
        for(int i=0;i<row;i++) {
        	for(int j=0;j<col;j++) {
        		arr[i][j]= sc.nextInt();
        	}
        }
        int srow=0;
        int scol=0;
        int erow=row-1;
        int ecol= col-1;
        
        
     while((srow<erow)&& (scol<ecol)){

         for(int i=srow;i<=ecol;i++){
             System.out.print(arr[srow][i]+",");
         }
         for(int i=srow+1; i<=erow; i++){
             System.out.print(arr[i][ecol]+",");
         }
         for(int i=ecol-1;i>=scol;i--){
             System.out.print(arr[erow][i]+",");
         }
         for(int i= erow-1;i>=srow+1;i--){
             System.out.print(arr[i][scol]+",");
         }
         srow++;
         scol++;
         erow--;
         ecol--;
         }
         
         System.out.print("End");
  }

}
